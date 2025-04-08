package com.codetrio.module;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	private String path_hoAdmin = "hoxdm/";
	private String path_whAdmin = "whxdm/";
	
	@RequestMapping(value = "/hoxdm/index")	
	public String hoxdmIndex() {	
		return path_hoAdmin + "index";
	}
	
	@RequestMapping(value = "/whxdm/index")	
	public String whxdmIndex() {	
		return path_whAdmin + "index";
	}
}
