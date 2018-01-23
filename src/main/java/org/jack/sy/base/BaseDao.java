/**
 * 
 */
package org.jack.sy.base;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Assert;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jack
 *
 */
@SuppressWarnings("rawtypes")
public abstract class BaseDao<T extends Serializable,M> extends SqlSessionDaoSupport implements IBase{

	protected M m;
	
    private Class<T> entityClass;

    private Class<M> mapperClass;
	
    
    @Autowired
    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        super.setSqlSessionTemplate(sqlSessionTemplate);
    }
    
    /**
     * 创建默认构造方法，以取得真正的泛型类型
     */
    @SuppressWarnings("unchecked")
	public BaseDao() {
    	 Class<?> c = getClass();
         Type type = c.getGenericSuperclass();
         if (type instanceof ParameterizedType) {
             Type[] parameterizedType = ((ParameterizedType) type).getActualTypeArguments();
             if (CollectionUtils.sizeIsEmpty(parameterizedType)) {
                 throw new RuntimeException("init entityClass mapperClass failed!");
             }
             this.entityClass = (Class<T>) parameterizedType[0];
             this.mapperClass = (Class<M>) parameterizedType[1];
         } else {
             throw new RuntimeException(String.format("没有找到【%s】的动态参数T", getClass().getSimpleName()));
         }
	}
    
	@Override
	public String getNameSpace() {
		return mapperClass.getName();
	}

	@Override
	public Class<T> getEntityClass() {
		return entityClass;
	}
	
	/**
     * 根据ID查询对象
     */
    public <D extends Number> T getById(D id) {
        Assert.assertNotNull(id);
        if (id instanceof Integer) {
            return ((BaseMapper<T>) m).getById((Integer) id);
        }
        if (id instanceof Long) {
            return ((BaseMapper<T>) m).getById(((Long) id).intValue());
        }
        return null;
    }
	
}
