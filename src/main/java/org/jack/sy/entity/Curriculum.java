package org.jack.sy.entity;

import java.io.Serializable;
import java.util.Random;

public class Curriculum implements Serializable {

	/**
	 * 课程id
	 */
	private Long id;
	
	/**
	 * 课程名称
	 */
	private String curriculumName;
	
	/**
	 * 教师id
	 */
	private Long teacherId;
	
	/**
	 * 学生id
	 */
	private Long studentId;
	
	/**
	 * 上课时间
	 */
	private String classTime;
	
	/**
	 * 上课地点
	 */
	private String classPlace;
	
	/**
	 * 课程时间周期
	 */
	private String classWeekly;
	
	/**
	 * 课程类型 0选修课1必修课
	 */
	private Short curriculumType;
	
	/**
	 * 学分
	 */
	private Integer credit;
	
	

	public Curriculum() {
	}

	public Curriculum(Long id, String curriculumName, Long teacherId,
			Long studentId, String classTime, String classPlace,
			String classWeekly, Short curriculumType, Integer credit) {
		this.id = id;
		this.curriculumName = curriculumName;
		this.teacherId = teacherId;
		this.studentId = studentId;
		this.classTime = classTime;
		this.classPlace = classPlace;
		this.classWeekly = classWeekly;
		this.curriculumType = curriculumType;
		this.credit = credit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCurriculumName() {
		return curriculumName;
	}

	public void setCurriculumName(String curriculumName) {
		this.curriculumName = curriculumName;
	}

	public Long getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(Long teacherId) {
		this.teacherId = teacherId;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getClassTime() {
		return classTime;
	}

	public void setClassTime(String classTime) {
		this.classTime = classTime;
	}

	public String getClassPlace() {
		return classPlace;
	}

	public void setClassPlace(String classPlace) {
		this.classPlace = classPlace;
	}

	public String getClassWeekly() {
		return classWeekly;
	}

	public void setClassWeekly(String classWeekly) {
		this.classWeekly = classWeekly;
	}

	public Short getCurriculumType() {
		return curriculumType;
	}

	public void setCurriculumType(Short curriculumType) {
		this.curriculumType = curriculumType;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}
	
	public boolean equals(Object other) {
		if ( (this == other ) ) return true;
		if ( (other == null ) ) return false;
		if ( !(other instanceof Curriculum) ) return false;
		Curriculum castOther = ( Curriculum ) other;
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
