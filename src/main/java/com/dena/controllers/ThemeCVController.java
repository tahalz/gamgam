package com.dena.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dena.entities.ThemeCV;
import com.dena.service.IThemeCVService;


@RestController
@RequestMapping("themecv")
public class ThemeCVController {



	
	@Autowired
	private IThemeCVService themeCVService ;

	public IThemeCVService getCVService() {
		return themeCVService;
	}

	public void setIThemeCVService(IThemeCVService cvService) {
		this.themeCVService = cvService;
	}

	@RequestMapping(
			method = {RequestMethod.GET,RequestMethod.POST}, 
			produces = { "application/json" }
			)
	public List<ThemeCV> findAll(HttpServletResponse response) throws IOException{
		List<ThemeCV> themecv = null;
		try
		{
			themecv = themeCVService.findAll();
		}
		catch(Exception e)
		{
			response.sendError(404);
		}
		return themecv;
		
	}

}


