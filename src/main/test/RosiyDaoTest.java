import javax.annotation.Resource;

import org.jack.sy.entity.StudentEntity;
import org.jack.sy.service.StudentService;
import org.junit.Test;


public class RosiyDaoTest extends BaseTest{
	
	@Resource(name="studentService")
	private StudentService studentServiceImpl;
	
	@Test
	public void testQueryById() throws Exception {
		int id = 1;
		StudentEntity rosiy = studentServiceImpl.getById(StudentEntity.class,id);
		System.out.println(rosiy);
	}
	
}
