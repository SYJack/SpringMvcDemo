import org.jack.sy.dao.RosiyDao;
import org.jack.sy.entity.Rosiy;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class RosiyDaoTest extends BaseTest{
	
	@Autowired
	private RosiyDao rosiyDao;
	
	@Test
	public void testQueryById() throws Exception {
		int rosiyId = 1;
		Rosiy rosiy = rosiyDao.queryById(rosiyId);
		System.out.println(rosiy);
	}
	
}
