package com.spring.security.project.SpringbootSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
	@RequestMapping("/")
	public String getHome() {

		return "home.jsp";
	}
}
