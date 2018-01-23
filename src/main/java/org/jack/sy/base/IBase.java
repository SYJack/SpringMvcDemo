/**
 * 
 */
package org.jack.sy.base;

import java.io.Serializable;

/**
 * @author jack
 *
 */
public interface IBase<T extends Serializable> {
	String getNameSpace();

	Class<T> getEntityClass();
}
