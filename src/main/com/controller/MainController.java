package com.codejava.contact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.codejava.contact.dao.*;
import com.codejava.contact.model.*;

@Controller
public class MainController {
	
	@RequestMapping(value = "/")
	public ModelAndView listContact(ModelAndView model) {
		List<Contact> listContact = contactDAO.list();
		model.addObject("listContact",listContact);
		model.setViewName("index");
		return model;
	}

}
