package com.dena.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dena.entities.Langue;
import com.dena.service.ILangueService;


@RestController
@RequestMapping("langue")

public class LangueController {
	
	@Autowired 
	ILangueService langueService ;

	public ILangueService getLangueService() {
		return langueService;
	}

	public void setILangueService(ILangueService langueService) {
		this.langueService = langueService;
	}

	@RequestMapping(
			method = {RequestMethod.GET,RequestMethod.POST}, 
			produces = { "application/json" }
			)
	public List<Langue> findAll(HttpServletResponse response) {
		List<Langue> langue = null;
		
		langue = langueService.findAll();
	
		return langue;
		
	}

}