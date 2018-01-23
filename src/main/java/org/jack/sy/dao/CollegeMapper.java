package org.jack.sy.dao;

import org.jack.sy.entity.CollegeEntity;
import org.jack.sy.entity.StudentEntity;
import org.springframework.stereotype.Repository;

@Repository("collegeMapper")
public interface CollegeMapper {

	Boolean deleteByPrimaryKey(Long id);

	Boolean insert(CollegeEntity record);

	Boolean insertSelective(CollegeEntity record);

	CollegeEntity selectByPrimaryKey(Long id);

	Boolean updateByPrimaryKeySelective(CollegeEntity record);

	Boolean updateByPrimaryKey(CollegeEntity record);
}
