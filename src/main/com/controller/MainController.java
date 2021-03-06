package com.codejava.contact.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.codejava.contact.dao.*;
import com.codejava.contact.model.*;

@Controller
public class MainController {
	
	@Autowired
	private ContactDAO contactDAO;
	
	@RequestMapping(value = "/")
	public ModelAndView listContact(ModelAndView model) {
		List<Contact> listContact = contactDAO.list();
		model.addObject("listContact",listContact);
		model.setViewName("index");
		return model;
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Contact newContact = new Contact();
		model.addObject("contact",newContact);
		model.setViewName("contact_form");
		return model;
	}
}
