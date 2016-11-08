package personal.chencs.tutorial.test;

import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import personal.chencs.tutorial.entity.User;
import personal.chencs.tutorial.service.UserService;

public class UserServiceTest {
	private Logger logger = Logger.getLogger(UserServiceTest.class.getName());
	private UserService userService;
	private ApplicationContext context;
	
	@Before    
    public void before() {     
		context = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		userService = (UserService) context.getBean("userService");
		return;   
    }

	@Test
	public void testQueryByName() {
		User user = userService.queryByName("mybatis");
		
		System.out.println(user);
		logger.info(user.toString());
	}

}
