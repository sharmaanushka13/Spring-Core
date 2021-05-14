package com.java.org;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
	
	Customer c1 = new Customer(5,"Sheldon","9394855949",new Addresses("BBT","NY","US","325199","New York"));
	
    @Test
	public void draw() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Customer c = (Customer) context.getBean("customer");
		assertEquals(c1.getCustID(), c.getCustID());
		assertEquals(c1.getCustName(), c.getCustName());
	}

}
