
package co.edu.uniandes.csw.pyme.persistence.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class _PymeEntity {

	private String name;
	@Id
	@GeneratedValue(generator = "Pyme")
	private Long id;
	private String description;
        private String description2;
        private String name2;

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public Long getId(){
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
}