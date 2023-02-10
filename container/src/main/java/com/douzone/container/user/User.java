package com.douzone.container.user;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String name = "루피";
	
	public String getName() {
		return name;
	}

}
