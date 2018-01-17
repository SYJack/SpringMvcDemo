import org.jack.sy.dao.RosiyDao;
import org.jack.sy.entity.RosiyEntity;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class RosiyDaoTest extends BaseTest{
	
	@Autowired
	private RosiyDao rosiyDao;
	
	@Test
	public void testQueryById() throws Exception {
		int rosiyId = 1;
		RosiyEntity rosiy = rosiyDao.queryById(rosiyId);
		System.out.println(rosiy);
	}
	
}
