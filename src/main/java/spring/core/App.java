package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import spring.core.entity.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicatonContext.xml");
		Employee bean = (Employee)ioc.getBean("emp");
		Employee bean2 = (Employee)ioc.getBean("emp1");
		System.out.println(bean);
		System.out.println(bean2);

	}

}
