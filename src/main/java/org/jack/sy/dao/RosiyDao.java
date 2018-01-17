package org.jack.sy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.jack.sy.entity.RosiyEntity;

public interface RosiyDao {

	/**
	 * @param id
	 * @return
	 * @Description: TODO
	 * @author ジャック
	 * @date 2017年12月8日
	 */
	RosiyEntity queryById(Integer rosiId);
	
	/**
	 * @param offset 查询起始位置
	 * @param limit  查询条数
	 * @return
	 * @Description: TODO
	 * @author ジャック
	 * @date 2017年12月8日
	 */
	List<RosiyEntity>  queryAll(@Param("offset")Integer offset,@Param("limit")Integer limit);
	 
}
