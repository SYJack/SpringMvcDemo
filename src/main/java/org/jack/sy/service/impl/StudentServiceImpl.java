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
	public Boolean updateByPrimaryKey(StudentEntity studentEntity) {
		if(studentEntity.getId() == null || studentEntity == null ){
			throw new RuntimeException("参数对象为空");
		}
		StudentEntity po = studentMapper.selectByPrimaryKey(studentEntity.getId());
		if(po==null){
			throw new RuntimeException("没有这个学生");
		}
		studentMapper.updateByPrimaryKey(studentEntity);
		return Boolean.TRUE;
	}
	@Override
	public Boolean insertStudent(StudentEntity studentEntity) {
		if(studentEntity == null ){
			throw new RuntimeException("参数对象为空");
		}
		studentMapper.insert(studentEntity);
		return Boolean.TRUE;
	}
	@Override
	public Boolean deleteByPrimaryKey(Long id) {
		if( id == null ){
			throw new RuntimeException("id为空");
		}
		StudentEntity po = studentMapper.selectByPrimaryKey(id);
		if(po==null){
			throw new RuntimeException("没有这个学生");
		}
		studentMapper.deleteByPrimaryKey(id);
		return Boolean.TRUE;
	}


}
