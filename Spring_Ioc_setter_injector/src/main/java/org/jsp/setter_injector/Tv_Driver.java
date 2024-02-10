package org.jsp.setter_injector;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tv_Driver {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Tv.xml");
		Tv tv = context.getBean(Tv.class,"mytv");
		tv.tvDetails();
		context.close();
		
	}
	
}
