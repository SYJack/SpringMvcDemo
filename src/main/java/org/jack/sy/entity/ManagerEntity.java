package org.jack.sy.entity;

import java.io.Serializable;
import java.util.Random;

public class ManagerEntity implements Serializable{

	/**
	 * 管理员id
	 */
	private Long id;
	
	/**
	 * 管理员登录账号
	 */
	private String managerName;
	
	/**
	 * 登录密码
	 */
	private String passwd;
	
	/**
	 * 角色id
	 */
	private Long roleId;
	
	

	public ManagerEntity() {
	}

	public ManagerEntity(Long id, String managerName, String passwd, Long roleId) {
		this.id = id;
		this.managerName = managerName;
		this.passwd = passwd;
		this.roleId = roleId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	public boolean equals(Object other) {
		if ( (this == other ) ) return true;
		if ( (other == null ) ) return false;
		if ( !(other instanceof ManagerEntity) ) return false;
		ManagerEntity castOther = ( ManagerEntity ) other;
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
