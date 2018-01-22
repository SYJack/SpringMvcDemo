/**
 * 
 */
package org.jack.sy.service;

import org.jack.sy.entity.StudentEntity;

/**
 * @author jack
 */
public interface StudentService{

	public StudentEntity selectByPrimaryKey(Long id);
	
	public Integer updateByPrimaryKey(StudentEntity studentEntity);
	
	public Integer insertStudent(StudentEntity studentEntity);
}
