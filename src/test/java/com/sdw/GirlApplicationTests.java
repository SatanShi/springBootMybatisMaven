package com.sdw;

import com.sdw.service.HelloService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.Object;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GirlApplicationTests {

	@Autowired
	private HelloService helloService;
	@Test
	public void contextLoads() throws Exception {
		helloService.getWeight();
		//测试方法返回值是否相等
		//Assert.assertEquals("我的异常1",Object);
	}

}
