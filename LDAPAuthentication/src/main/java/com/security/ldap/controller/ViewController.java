package com.security.ldap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * A Basic controller for secured and public url access
 *
 */
@Controller
public class ViewController {
	
	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public ModelAndView publicURL() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}

	@RequestMapping(value = "/securedaccess", method = RequestMethod.GET)
	public ModelAndView secureURL() {
		ModelAndView model = new ModelAndView();
		model.setViewName("secured");
		return model;
	}

}