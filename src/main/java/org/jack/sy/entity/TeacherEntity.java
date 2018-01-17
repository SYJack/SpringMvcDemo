package org.jack.sy.entity;

import java.io.Serializable;
import java.util.Random;

public class TeacherEntity extends RoleEntity implements Serializable {
	
	private Long id;
	
	/**
	 * 教师名字
	 */
	private String teacherName;
	
	/**
	 * 性别:0女，1男
	 */
	private Short gender;
	
	/**
	 * 学院id
	 */
	private Long collegeId;
	
	/**
	 * 登录密码
	 */
	private String passwd;
	
	/**
	 * 角色id
	 */
	private Long roleId;
	
	public TeacherEntity() {
	}

	


	public TeacherEntity(Long id, String teacherName, Short gender, Long collegeId,
			String passwd, Long roleId) {
		this.id = id;
		this.teacherName = teacherName;
		this.gender = gender;
		this.collegeId = collegeId;
		this.passwd = passwd;
		this.roleId = roleId;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public Short getGender() {
		return gender;
	}

	public void setGender(Short gender) {
		this.gender = gender;
	}

	public Long getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Long collegeId) {
		this.collegeId = collegeId;
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
		if ( !(other instanceof TeacherEntity) ) return false;
		TeacherEntity castOther = ( TeacherEntity ) other;
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
