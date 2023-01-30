package com.douzone.hellospring.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

		@RequestMapping("/hello")
		public String hello() {
			return "/WEB-INF/views/hello.jsp";
		}
		@RequestMapping("/hello2")
		public String hello2(String name) {
			System.out.println("name :"+ name);
			return "/WEB-INF/views/hello.jsp";
		}
		
		//3,4 출력값 동일함.
		@RequestMapping("/hello3")
		public ModelAndView hello3(String name) {
			ModelAndView mav =new ModelAndView();
			mav.addObject("name", name);
			mav.setViewName("/WEB-INF/views/hello3.jsp");
			
			return mav;
		}
		@RequestMapping("/hello4")
		public String hello4(String name, Model model) {
			model.addAttribute("name",name);
			return "/WEB-INF/views/hello3.jsp";
		}
		
		@ResponseBody //응답 바디에 return값이 붙어간다..
		@RequestMapping("/hello5")
		public String hello5() {
			return "<h1>Hello Spring</h1>";
		}
		
		
		//redirect 응답
		//hello6으로 접속해도 redirect로 hello로 접속됨.
		@RequestMapping("/hello6")
		public String hello6() {
			return "redirect:/hello";
		}
		
		//최대한 처리를 위해 수행됨.
		@RequestMapping("/hello7")
		public void hello7(HttpServletRequest request,
			HttpServletResponse response, Writer out) throws IOException {
			
			String name = request.getParameter("name");
			out.write("hello "+name);
			
			
		}
}
