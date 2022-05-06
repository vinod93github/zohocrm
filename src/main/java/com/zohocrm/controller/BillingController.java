package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Billing;
import com.zohocrm.services.BillingService;

@Controller
public class BillingController {
	@Autowired
	BillingService billingservice;
	
	
	@RequestMapping("/generate")
	public String generateBill(@ModelAttribute("bills") Billing bill,Model model) {
	 billingservice.GenerateOneBill(bill);
	 	model.addAttribute("msg","Bill gets generated......");
		return "generate_bill";
	}
	
	@RequestMapping("listbills")
	public String listbills(Model model) {
		List<Billing> billing = billingservice.listbills( );
		model.addAttribute("billing",billing);
		return "billing_result";
		
	}

}
