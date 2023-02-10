package com.douzone.container.user.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.douzone.container.user.User;

public class XmlConfigTest {

	public static void main(String[] args) {
		// XML Auto Configuration(Annotation Scanning= 자동설정)
		//testBeanFactory01();
		
		// XML Bean Configuration(Explicit Configuration= 명시적 설정)
		//testBeanFactory02();
		
		// XML Auto Configuration(Annotation Scanning= 자동설정)
		//testApplicationContext01();
		
		// XML Bean Configuration(Explicit Configuration= 명시적 설정)
		// XML에서 ID 직접 설정해줘야함.
		testApplicationContext02();
				
				
	}
	private static void testApplicationContext02() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/douzone/container/config/user/applicationContext02.xml");

		User user =null;
		
		//id로 빈 가져오기
		user = (User)ac.getBean("user");
		System.out.println(user.getName());

		//name으로 빈 가져오기
		user = (User)ac.getBean("usr");
		System.out.println(user.getName());
		
		//Type으로 빈 가져오기
		//같은 타입의 빈이 2개 이상 있으면 type으로 가져오기 실패
		//1. id + type
		//2. name + type
		user = ac.getBean("user2",User.class);
		System.out.println(user);
		
		//파라미터 2개(1개 이상)인 생성된 빈1 생성성하기
		user = ac.getBean("user3",User.class);
		System.out.println(user);
		
		//파라미터 2개(1개 이상)인 생성된 빈2 생성성하기
		user = ac.getBean("user4",User.class);
		System.out.println(user);
		
		// setter를 사용한 빈 가져하기
		user = ac.getBean("user5",User.class);
		System.out.println(user);
		
		// // setter를 사용한 빈 가져하기 2 (DI)
		user = ac.getBean("user6",User.class);
		System.out.println(user);
		
		// setter를 사용한 빈 가져하기 3 (Collection Property)
		user = ac.getBean("user7",User.class);
		System.out.println(user);
		
		
	}
	
	private static void testApplicationContext01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/douzone/container/config/user/applicationContext01.xml");
		User user = null;
		
		user = ac.getBean(User.class);
		System.out.println(user.getName());
		//Annotation Scan 설정에서는 Bean Id가 자동으로 부여된다.
		user = (User)ac.getBean("user");
		System.out.println(user.getName());
	}
	
	
	private static void testBeanFactory01() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/douzone/container/config/user/applicationContext01.xml"));
		User user = bf.getBean(User.class);
		System.out.println(user.getName());
	}
	
	private static void testBeanFactory02() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/douzone/container/config/user/applicationContext02.xml"));
		User user = bf.getBean(User.class);
		System.out.println(user.getName());
	}

}
