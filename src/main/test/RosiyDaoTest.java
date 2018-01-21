import javax.annotation.Resource;

import org.jack.sy.entity.StudentEntity;
import org.jack.sy.service.StudentService;
import org.junit.Test;


public class RosiyDaoTest extends BaseTest{
	
	@Resource(name="studentServiceimpl")
	private StudentService studentServiceImpl;
	
	@Test
	public void testQueryById() throws Exception {
		long id = 1;
		StudentEntity rosiy = studentServiceImpl.selectByPrimaryKey(id);
		System.out.println(rosiy.toString());
	}
	
}
