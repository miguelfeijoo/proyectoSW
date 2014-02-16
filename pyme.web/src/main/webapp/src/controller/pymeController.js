define(['controller/_pymeController'], function() {
    App.Controller.PymeController = App.Controller._PymeController.extend({

        postInit: function(options) {
            var self = this;
            this.searchTemplate = _.template($('#pymeSearch').html()+$('#pymeList').html());
 
            Backbone.on(this.componentId + '-' + 'toolbar-search', function(params) {
                self.search(params);
            });
            Backbone.on(this.componentId+'-pyme-search', function(params) {
                self.pymeSearch(params);
            });
        },
        
        _renderSearch: function(params) {
 
            var self = this;
            this.$el.slideUp("fast", function() {
                self.$el.html(self.searchTemplate({componentId: self.componentId,
                    pymes: self.pymeModelList.models,
                    pyme: self.currentPymeModel,
                    showEdit: false,
                    showDelete:false
                }));
                self.$el.slideDown("fast");
            });
        },
        
        search: function() {
            this.currentPymeModel = new App.Model.PymeModel();
            this.pymeModelList = new this.listModelClass();
            this._renderSearch();
        },
        pymeSearch: function() {
            var self = this;
            var model = $('#' + this.componentId + '-pymeForm').serializeObject();
            this.currentPymeModel.set(model);
            App.Delegate.PymeDelegate.search(self.currentPymeModel, function(data) {
                self.pymeModelList=new App.Model.PymeList();
                _.each(data,function(d){
                    var model=new App.Model.PymeModel(d);
                    model.name = d;
                    self.pymeModelList.models.push(model);
                });
                self._renderSearch(params);
            }, function(data) {
                Backbone.trigger(self.componentId + '-' + 'error', {event: 'pyme-search', view: self, id: '', data: data, error: 'Error in pyme search'});
            });
        }
    });
    return App.Controller.PymeController;
}); 