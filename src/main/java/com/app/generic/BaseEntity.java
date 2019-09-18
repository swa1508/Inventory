package com.app.generic;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	  @Id  
	    @GeneratedValue(strategy = GenerationType.IDENTITY)  
	    @Basic(optional = false)  
	    @Column(name = "id", nullable = false, columnDefinition = "BIGINT UNSIGNED")  
	    protected Long id;  
	  
	    @Column(name = "version")  
	    @Version  
	    private Long version;

		public Long getId() {
			return id;
		}
		
		public Long getVersion() {
			return version;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((id == null) ? 0 : id.hashCode());
			result = prime * result + ((version == null) ? 0 : version.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			BaseEntity other = (BaseEntity) obj;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (version == null) {
				if (other.version != null)
					return false;
			} else if (!version.equals(other.version))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return this.getClass().getName() + " BaseEntity [id=" + id + "]";
		}
		
		

}
