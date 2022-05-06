package com.zohocrm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entities.Contact;
import com.zohocrm.entities.Lead;
import com.zohocrm.services.ContactService;
import com.zohocrm.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	LeadService leadser;
	@Autowired
	ContactService contactser;
	
	@RequestMapping("/view")
	public String ViewCreateLeadPage( ) {
		return "create_lead";
	}
	@RequestMapping("/savelead")
	public String SaveOneLead(@ModelAttribute("lead") Lead lead,Model model) {
		leadser.SaveLead(lead);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
	@RequestMapping("/listall")
	public String listAllLead(Model model) {
		List<Lead> lead = leadser.findAllLead();
		model.addAttribute("leads",lead);
		return "lead_result";
	}
	@RequestMapping("/getLeadById")
	public String getLeadById(@RequestParam("id") long id,Model model) {
		Lead lead=leadser.getLead(id);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id,Model model) {
		Lead lead=leadser.getLead(id);
		Contact contact =new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		contactser.SaveContact(contact);
		
		leadser.deleteLead(id);
		List<Contact> contacts = contactser.findAllContacts();
		model.addAttribute("contacts",contacts);
		return "contact_result";	
	}
}
