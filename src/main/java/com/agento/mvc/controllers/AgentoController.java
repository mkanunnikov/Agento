package com.agento.mvc.controllers;

import com.agento.dao.DAO;
import com.agento.mvc.model.DealObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/")
public class AgentoController {

    @Autowired
    private DAO dao;

//    @Autowired
//    private ReloadableResourceBundleMessageSource messageSource;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		return "index";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/objects")
	public String showObjects(ModelMap model) {
        List<DealObject> dealObjects = dao.getObjects();
		model.addAttribute("objects", dealObjects);
//        messageSource.getMessage("login.title",null, Locale. );
		return "objects";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/searchObjects")
	public String searchObjects(@ModelAttribute Double price, ModelMap model) {
        List<DealObject> dealObjects = dao.getObjects(price);
		model.addAttribute("objects", dealObjects);
		return "objects";
	}

}