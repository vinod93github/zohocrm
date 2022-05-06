package com.zohocrm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.utility.EmailService;
@Controller
public class EmailController {
	
	@Autowired
	EmailService emailservice;
	
	@RequestMapping("/compose")
	public String ComposeEmail(@RequestParam("emailId") String email,ModelMap model) {
		model.addAttribute("email",email);
		return "compose_email";
	}
	
	@RequestMapping("/sendEmail")
	public String sendEmail(@RequestParam("to") String to,@RequestParam("subject") String subject,@RequestParam("body")String body,Model model) {
		emailservice.sendSimpleMessage(to, subject,body);
		model.addAttribute("msg","Email has been sent successfully");
		return "compose_email";
	}

}
