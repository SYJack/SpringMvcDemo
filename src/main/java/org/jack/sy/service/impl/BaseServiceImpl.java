/**
 * 
 */
package org.jack.sy.service.impl;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.annotation.Resource;

import org.jack.sy.dao.BaseDao;
import org.jack.sy.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jack
 *
 */
@Service
public abstract class BaseServiceImpl<T> implements BaseService<T, Serializable> {

	private BaseDao<T, Serializable> baseDao;

	public BaseDao<T, Serializable> getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao<T, Serializable> baseDao) {
		this.baseDao = baseDao;
	}

//	public int insert(T entity) {
//		return baseDao.insert(entity);
//	}
//
//	public int insertSelective(T record) {
//		return baseDao.insertSelective(record);
//	}

	public T selectByPrimaryKey(String id) {
		return baseDao.selectByPrimaryKey(id);
	}

//	public int updateByPrimaryKey(T record) {
//		return baseDao.updateByPrimaryKey(record);
//	}
//
//	public int updateByPrimaryKeySelective(T record) {
//		return baseDao.updateByPrimaryKeySelective(record);
//	}
//
//	public int deleteByPrimaryKey(String id) {
//		return baseDao.deleteByPrimaryKey(id);
//	}
//
//	public List<T> findTop(int top, String statementKey, Object parameter)
//			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
//		return baseDao.findTop(top, statementKey, parameter);
//	}
//
//	public T findTopOne(String statementKey, Object parameter)
//			throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
//		return baseDao.findTopOne(statementKey, parameter);
//	}
}