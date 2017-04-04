package dbDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FoodApplication.class)
@WebAppConfiguration
public class PgBootApplicationTests {

	//@Autowired
	//private TeiidServerProperties teiidServerProperties;

	@Test
	public void contextLoads() {
	}
}
