package com.afaria.spring.boot.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.afaria.spring.boot.springboot.services.Service;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Test
	public void testService() {

		Service service = context.getBean(Service.class);
		service.save();
	}

}
