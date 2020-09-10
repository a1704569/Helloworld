package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class GitbashController {
	
@RequestMapping("/hello")
	public String gitBash() {
		return "Hello github from github";
		// TODO Auto-generated method stub

	}

}
