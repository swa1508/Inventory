package com.app.generic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@MappedSuperclass
public abstract class InventoryBaseEntity extends BaseEntity {

    @Column(name = "creation_time")  
    @Temporal(TemporalType.TIMESTAMP)  
    private Date creationTime;  
  
    @Size(max = 20)  
    @Column(name = "creator", length = 20)  
    private String creator;  
  
    @Column(name = "modified_time")  
    @Temporal(TemporalType.TIMESTAMP)  
    private Date modifiedTime;  
  
    @Size(max = 20)  
    @Column(name = "modifier", length = 20)  
    private String modifier;

	public Date getCreationTime() {
		return creationTime;
	}

	@PrePersist
	public void setCreationTime() {
		this.creationTime = new Date();
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	@PreUpdate
	public void setModifiedTime() {
		this.modifiedTime = new Date();
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
    

}
