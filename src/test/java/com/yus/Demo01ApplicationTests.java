package com.yus;

import com.yus.beans.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo01ApplicationTests {
	@Autowired
	Person person;
	@Test
	public void contextLoads() {

		System.out.print(person.getName()+person.getAge());

	}

}
