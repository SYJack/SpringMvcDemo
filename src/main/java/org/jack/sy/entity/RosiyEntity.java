package org.jack.sy.entity;

import java.io.Serializable;

public class RosiyEntity implements Serializable {

	private Integer rosiId;
	
	private String title;
	
	private String url;
	
	public RosiyEntity() {
	}

	public RosiyEntity(Integer rosiId, String title, String url) {
		this.rosiId = rosiId;
		this.title = title;
		this.url = url;
	}

	public Integer getRosiId() {
		return rosiId;
	}

	public void setRosiId(Integer rosiId) {
		this.rosiId = rosiId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean equals(Object other) {
		if ( (this == other ) ) return true;
		if ( (other == null ) ) return false;
		if ( !(other instanceof RosiyEntity) ) return false;
		RosiyEntity castOther = ( RosiyEntity ) other;
		if( this.getRosiId() == null || castOther.getRosiId() == null){
			return false;
		}
		
		return ( (this.getRosiId()==castOther.getRosiId()) || ( this.getRosiId()!=null && castOther.getRosiId()!=null && this.getRosiId().equals(castOther.getRosiId()) ) );
	}
	
	public int hashCode() {
		java.util.Random random = new java.util.Random();
		int result = 0;
		result += result + (this.getRosiId() == null ? random.nextInt(Integer.MAX_VALUE) : this.getRosiId().hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Rosiy [rosiId=" + rosiId + ", title=" + title + ", url=" + url
				+ "]";
	}
	
	
	
}
