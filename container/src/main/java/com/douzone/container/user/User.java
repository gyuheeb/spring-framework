package com.douzone.container.user;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class User {
	private Long no = 0L;
	private String name = "루피";
	private Freind freind;
	private List<String> freinds;
	
	public User() {
	} 
	public User(String name) {
		this.name=name;
	}
	
	public User(Long no,String name) {
		this.no=no;
		this.name=name;
	}
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Freind getFreind() {
		return freind;
	}
	public void setFreind(Freind freind) {
		this.freind = freind;
	}
	
	
	public List<String> getFreinds() {
		return freinds;
	}
	public void setFreinds(List<String> freinds) {
		this.freinds = freinds;
	}
	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", freind=" + freind + ", freinds=" + freinds + "]";
	}
	
	

}
