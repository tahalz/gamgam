package com.dena.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dena.entities.Experience;
import com.dena.service.IExperienceService;

@RestController
@RequestMapping("experience")
public class ExperienceController {

	@Autowired
	private IExperienceService experienceService ;

	public IExperienceService getExperienceService() {
		return experienceService;
	}

	public void setIExperienceService(IExperienceService experienceService) {
		this.experienceService = experienceService;
	}

	@RequestMapping(
			method = {RequestMethod.GET,RequestMethod.POST}, 
			produces = { "application/json" }
			)
	public List<Experience> findAll(HttpServletResponse response) throws IOException{
		List<Experience> experiences = null;
		try
		{
			experiences = experienceService.findAll();
		}
		catch(Exception e)
		{
			response.sendError(404);
		}
		return experiences;
		
	}
	
	

}
