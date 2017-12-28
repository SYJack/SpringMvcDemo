package org.jack.sy.entity;

import java.io.Serializable;
import java.util.Random;

public class College implements Serializable {
	
	/**
	 * 学院id
	 */
	private Long id;
	
	/**
	 * 学员编号
	 */
	private Long collegeNumber;
	
	/**
	 * 学院名称
	 */
	private String collegeName;
	

	public College() {
	}

	public College(Long id, Long collegeNumber, String collegeName) {
		this.id = id;
		this.collegeNumber = collegeNumber;
		this.collegeName = collegeName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCollegeNumber() {
		return collegeNumber;
	}

	public void setCollegeNumber(Long collegeNumber) {
		this.collegeNumber = collegeNumber;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public boolean equals(Object other) {
		if ( (this == other ) ) return true;
		if ( (other == null ) ) return false;
		if ( !(other instanceof College) ) return false;
		College castOther = ( College ) other;
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
