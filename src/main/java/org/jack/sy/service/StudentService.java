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
}
