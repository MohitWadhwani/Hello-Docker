package com.hello;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String sayHello(ModelMap map)
	{
		return "Hello welcome to spring boot world";
	}
}
