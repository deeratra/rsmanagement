package com.cts.foodster.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.foodster.bean.Login;
import com.cts.foodster.service.RegistraionService;

@Controller
public class RegistrationController {
	
	@Autowired
	RegistraionService registrationService;
	
	@RequestMapping(value="registration.html", method=RequestMethod.POST)
	public String register(@ModelAttribute Login login)
	{
		if("yes".equals(registrationService.registerAdmin(login)))
			return "admin";
		else
			return "admin";
		
	}
	
	

}
