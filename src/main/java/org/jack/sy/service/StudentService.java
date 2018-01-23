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
	
	public Boolean updateByPrimaryKey(StudentEntity studentEntity);
	
	public Boolean insertStudent(StudentEntity studentEntity);
	
	public Boolean deleteByPrimaryKey(Long id);
}
