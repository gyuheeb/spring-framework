package com.douzone.container.user.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.douzone.container.user.User;

public class XmlConfigTest {

	public static void main(String[] args) {
		// XML Auto Configuration(Annotation Scanning= 자동설정)
		testBeanFactory01();
		
		// XML Bean Configuration(Explicit Configuration= 명시적 설정)
		testBeanFactory02();
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
