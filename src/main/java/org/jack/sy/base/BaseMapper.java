/**
 * 
 */
package org.jack.sy.base;

import java.io.Serializable;

/**
 * @author jack
 *
 */
public interface BaseMapper<T extends Serializable> {

	/**
     * 根据ID查找
     * 
     * @param id
     * @return
     */
    public T getById(Number id);
}
