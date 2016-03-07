package com.dena.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dena.entities.CV;
import com.dena.service.ICVService;


@RestController
@RequestMapping("CV")
public class CVController {
	
	@Autowired
	private ICVService cvService ;

	public ICVService getCVService() {
		return cvService;
	}

	public void setICVService(ICVService cvService) {
		this.cvService = cvService;
	}

	@RequestMapping(
			method = {RequestMethod.GET,RequestMethod.POST}, 
			produces = { "application/json" }
			)
	public List<CV> findAll(HttpServletResponse response) throws IOException{
		List<CV> cv = null;
		try
		{
			cv = cvService.findAll();
		}
		catch(Exception e)
		{
			response.sendError(404);
		}
		return cv;
		
	}

}
