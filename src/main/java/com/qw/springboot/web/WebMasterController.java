package com.qw.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebMasterController {

	@RequestMapping("/webMaster")
	public String webMaster() {
		return "webMaster";
	}
	
	@RequestMapping("/recruitment")
	public String recruitment() {
		return "recruitment";
	}
}
