package org.jsp.setter_injector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Pencil_Driver {
	
	public static void main(String[] args) {
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("pencil.xml");
//		Pencil pencil = context.getBean(Pencil.class,"mypencil");
//		System.out.println(pencil.getBrand());
//		System.out.println(pencil.getColor());
//		System.out.println(pencil.getPrice());
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("pencil.xml");
		Pencil pencil = context.getBean(Pencil.class,"mypencil");
		System.out.println(pencil.getBrand());
		System.out.println(pencil.getColor());
		System.out.println(pencil.getPrice());
		context.close();
		
		
		
	}

}
