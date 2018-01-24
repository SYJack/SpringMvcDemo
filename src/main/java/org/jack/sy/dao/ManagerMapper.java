/**
 * 
 */
package org.jack.sy.dao;

import org.jack.sy.entity.ManagerEntity;
import org.springframework.stereotype.Repository;

/**
 * @author jack
 * 下午4:43:16
 */
@Repository("managerMapper")
public interface ManagerMapper {

	Boolean deleteByPrimaryKey(Long id);

	Boolean insert(ManagerEntity record);

	Boolean insertSelective(ManagerEntity record);

	ManagerEntity selectByPrimaryKey(Long id);

	Boolean updateByPrimaryKeySelective(ManagerEntity record);

	Boolean updateByPrimaryKey(ManagerEntity record);
}
