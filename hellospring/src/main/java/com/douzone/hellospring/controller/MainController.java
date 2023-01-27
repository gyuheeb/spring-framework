package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@ResponseBody
	@RequestMapping({"/","/main","/a/b/c/main"})    //multi mapping (이 값을 해도 return)
	public String main(){
		return "MainController.main()";
	}

}
