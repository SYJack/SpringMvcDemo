package org.jack.sy.entity;

import java.io.Serializable;
import java.util.Random;

public class StudentEntity  implements Serializable {
	
	/**
	 * 学生id
	 */
	private Long id;
	
	/**
	 * 学号
	 */
	private Long studentId;
	
	/**
	 * 学生名字
	 */
	private String stuName;
	
	/**
	 * 性别:0女，1男
	 */
	private Short gender;
	
	/**
	 * 生日时间戳
	 */
	private Long birthday;
	
	/**
	 * 入学时间戳
	 */
	private Long entranceTime;
	
	/**
	 * 学院id
	 */
	private Long collegeId;
	
	/**
	 * 学生登录密码
	 */
	private String passwd;
	
	/**
	 * 角色id
	 */
	private Long roleId;
	

	public StudentEntity() {
	}




	public StudentEntity(Long id, Long studentId, String stuName, Short gender,
			Long birthday, Long entranceTime, Long collegeId, String passwd,
			Long roleId) {
		this.id = id;
		this.studentId = studentId;
		this.stuName = stuName;
		this.gender = gender;
		this.birthday = birthday;
		this.entranceTime = entranceTime;
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

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Short getGender() {
		return gender;
	}

	public void setGender(Short gender) {
		this.gender = gender;
	}

	public Long getBirthday() {
		return birthday;
	}

	public void setBirthday(Long birthday) {
		this.birthday = birthday;
	}

	public Long getEntranceTime() {
		return entranceTime;
	}

	public void setEntranceTime(Long entranceTime) {
		this.entranceTime = entranceTime;
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
		if ( !(other instanceof StudentEntity) ) return false;
		StudentEntity castOther = ( StudentEntity ) other;
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
