/**
 * 
 */
package org.jack.sy.service.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.jack.sy.dao.BaseDao;
import org.jack.sy.dao.StudentDao;
import org.jack.sy.entity.StudentEntity;
import org.jack.sy.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * @author jack
 */
@Service("studentService")
public class StudentServiceImpl extends BaseServiceImpl<StudentEntity> implements StudentService {

	
	private StudentDao studentDao;

	@Override
	@Resource(name="studentDao")
	public void setBaseDao(BaseDao<StudentEntity, Serializable> baseDao) {
		super.setBaseDao(studentDao);
	}
}
