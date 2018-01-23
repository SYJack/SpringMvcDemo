/**
 * 
 */
package org.jack.sy.dao;

import org.jack.sy.entity.CurriculumEntity;
import org.jack.sy.entity.StudentEntity;
import org.springframework.stereotype.Repository;

/**
 * @author jack
 *
 */
@Repository("curriculumMapper")
public interface CurriculumMapper {

	Boolean deleteByPrimaryKey(Long id);

	Boolean insert(CurriculumEntity record);

	Boolean insertSelective(CurriculumEntity record);

	CurriculumEntity selectByPrimaryKey(Long id);

	Boolean updateByPrimaryKeySelective(CurriculumEntity record);

	Boolean updateByPrimaryKey(CurriculumEntity record);
}
