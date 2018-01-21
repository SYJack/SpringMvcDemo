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

	int deleteByPrimaryKey(Long id);

	int insert(StudentEntity record);

	int insertSelective(StudentEntity record);

	StudentEntity selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(StudentEntity record);

	int updateByPrimaryKey(StudentEntity record);

}
