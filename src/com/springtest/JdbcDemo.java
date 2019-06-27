package com.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springtest.dao.HibernateDaoImpl;

public class JdbcDemo {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		HibernateDaoImpl dao = ctx.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		// dao.insert(new Circle(3, "second circle"));
		// System.out.println(dao.getAllCircles());
		System.out.println(dao.getCircleCount());
	}

}
