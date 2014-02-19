define([], function() {
    App.Model._PymeModel = Backbone.Model.extend({
        defaults: {
 
		 'name' : ''
,  		 'description' : ''              
,                'phone' : ''
,                'mail':''
                 
        },
        initialize: function() {
        },
        getDisplay: function(name) {
         console.log("Entro a hacer el request LOOOOOOOOL");
         return this.get(name);
        }
    });

    App.Model._PymeList = Backbone.Collection.extend({
        model: App.Model._PymeModel,
        initialize: function() {
        }

    });
    return App.Model._PymeModel;
});