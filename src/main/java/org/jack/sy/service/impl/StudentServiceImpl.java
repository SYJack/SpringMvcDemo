/**
 * 
 */
package org.jack.sy.service.impl;

import javax.annotation.Resource;

import org.jack.sy.dao.StudentMapper;
import org.jack.sy.entity.StudentEntity;
import org.jack.sy.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @author jack
 */
@Service("studentServiceimpl")
public class StudentServiceImpl implements StudentService{

	@Resource(name="studentMapper")
	private StudentMapper studentMapper;
	
	public StudentEntity selectByPrimaryKey(Long id) {
		return studentMapper.selectByPrimaryKey(id);
	}
	@Override
	public Integer updateByPrimaryKey(StudentEntity studentEntity) {
		return studentMapper.updateByPrimaryKey(studentEntity);
	}
	@Override
	public Integer insertStudent(StudentEntity studentEntity) {
		return studentMapper.insert(studentEntity);
	}


}
