package com.techendear.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping({"","/","/index","/index.html"})
	public String getString() {
		return "index";
	}
}
