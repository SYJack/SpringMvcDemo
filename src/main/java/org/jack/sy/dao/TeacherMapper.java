/**
 * 
 */
package org.jack.sy.dao;

import org.jack.sy.entity.TeacherEntity;
import org.springframework.stereotype.Repository;

/**
 * @author jack
 */
@Repository("teacherMapper")
public interface TeacherMapper {

	Boolean deleteByPrimaryKey(Long id);

	Boolean insert(TeacherEntity record);

	Boolean insertSelective(TeacherEntity record);

	TeacherEntity selectByPrimaryKey(Long id);

	Boolean updateByPrimaryKeySelective(TeacherEntity record);

	Boolean updateByPrimaryKey(TeacherEntity record);
}
