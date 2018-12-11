package com.bank.app.creditcard.rest.controller.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bank.app.creditcard.model.CreditCard;
import com.bank.app.creditcard.services.CreditCadrServicies;

@Controller
public class MainController {
	
	@Autowired
	private CreditCadrServicies creditCadrServicies;
	
	
	@GetMapping("/")
	public String hello(HttpServletRequest request) {		 
		request.setAttribute("mode", "MODE_HOME");	
		return "form";		
	}
	
	@GetMapping("/f")
	public String form(HttpServletRequest request) {
		 
		request.setAttribute("mode", "MODE_FORM");	
		return "form";		
	}
	
	@GetMapping("/mode-new")
	public String home(HttpServletRequest request) {		 
		request.setAttribute("mode", "MODE_NEW");	
		return "form";		
	}
	@GetMapping("/mode-getcard")
	public String formgetcard(HttpServletRequest request) {		 
		request.setAttribute("mode", "MODE_CHECKCARD");	
		return "form";		
	}
	
	@GetMapping("/mode-newpay")
	public String newpay(HttpServletRequest request) {		 
		request.setAttribute("mode", "MODE_NEWPAY");	
		return "form";		
	}
	@GetMapping("/all-card")
	public String allCard(HttpServletRequest request) {
		request.setAttribute("cards", creditCadrServicies.list());	
		request.setAttribute("mode", "MODE_CARD");	
		return "form";
		
	}
	
	@PostMapping("/new-card")
	public String newCard(@ModelAttribute CreditCard creditcard, HttpServletRequest request) {	
		creditCadrServicies.create(creditcard);
		request.setAttribute("cards", creditCadrServicies.list());
		request.setAttribute("mode", "MODE_CARD");	
		 
		return "form";
		
	}
	
	@GetMapping("/update-card")
	public String updateCard(@RequestParam long id, HttpServletRequest request) {	
		request.setAttribute("cards", creditCadrServicies.getCard(id));	
		request.setAttribute("mode", "MODE_UPDATE");	
		return "index";
		
	}
	
	@GetMapping("/delete-card")
	public String deleteCard(@RequestParam long id, HttpServletRequest request) {
		creditCadrServicies.deleteCard(id);
		request.setAttribute("cards", creditCadrServicies.list());
		request.setAttribute("mode", "MODE_DELETE");	
		return "index";
		
	}

}
