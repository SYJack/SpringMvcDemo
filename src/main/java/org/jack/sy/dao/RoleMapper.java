/**
 * 
 */
package org.jack.sy.dao;

import org.jack.sy.entity.RoleEntity;
import org.springframework.stereotype.Repository;

/**
 * @author jack
 */
@Repository("roleMapper")
public interface RoleMapper {

	Boolean deleteByPrimaryKey(Long id);

	Boolean insert(RoleEntity record);

	Boolean insertSelective(RoleEntity record);

	RoleEntity selectByPrimaryKey(Long id);

	Boolean updateByPrimaryKeySelective(RoleEntity record);

	Boolean updateByPrimaryKey(RoleEntity record);
}
