/**
 * 
 */
package org.jack.sy.dao;

import java.io.Serializable;

import org.jack.sy.entity.StudentEntity;
import org.springframework.stereotype.Repository;

/**
 * @author jack
 */
@Repository("studentDao")
public class StudentDao extends BaseDao<StudentEntity, Serializable>{

}
