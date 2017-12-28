package org.jack.sy.entity;

import java.io.Serializable;
import java.util.Random;

public class Role implements Serializable{
	
	/**
	 * 角色id
	 */
	private Long id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色权限
     */
    private String permissions;
    
    
    
	public Role() {
	}


	public Role(Long id, String roleName, String permissions) {
		this.id = id;
		this.roleName = roleName;
		this.permissions = permissions;
	}
    
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public String getPermissions() {
		return permissions;
	}


	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}


	public boolean equals(Object other) {
		if ( (this == other ) ) return true;
		if ( (other == null ) ) return false;
		if ( !(other instanceof Role) ) return false;
		Role castOther = ( Role ) other;
		if( this.getId() == null || castOther.getId() == null){
			return false;
		}
		
		return ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) );
	}
	
	public int hashCode() {
		Random random = new Random();
		int result = 0;
		result += result + (this.getId() == null ? random.nextInt(Integer.MAX_VALUE) : this.getId().hashCode());
		return result;
	}

}
