/**
 * 
 */
package org.jack.sy.dao;

import org.jack.sy.entity.StudentEntity;
import org.springframework.stereotype.Repository;

/**
 * @author jack
 */
@Repository("studentMapper")
public interface StudentMapper {

	Boolean deleteByPrimaryKey(Long id);

	Boolean insert(StudentEntity record);

	Boolean insertSelective(StudentEntity record);

	StudentEntity selectByPrimaryKey(Long id);

	Boolean updateByPrimaryKeySelective(StudentEntity record);

	Boolean updateByPrimaryKey(StudentEntity record);

}
