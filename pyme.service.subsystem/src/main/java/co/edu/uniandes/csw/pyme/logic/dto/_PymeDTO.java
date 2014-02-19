
package co.edu.uniandes.csw.pyme.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


public abstract class _PymeDTO {

	private String name;
	private Long id;
	private String description;
        private String name2;
        private String description2;

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getDescription2() {
    //    System.out.println("Loooool");
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
 
	public void setDescription(String description) {
		this.description = description;
	}
	
}