package com.dena.controllers;


import java.io.IOException;
import java.text.Normalizer.Form;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dena.entities.Formation;
import com.dena.service.IFormationService;


@RestController
@RequestMapping("formation")
public class FormationController {
	
			@Autowired
			private IFormationService formationService ;

			public IFormationService getIFormationService() {
				return formationService;
			}

			public void setIFichierProfessionelService(IFormationService formationService) {
				this.formationService = formationService;
			}

			@RequestMapping(
					method = {RequestMethod.GET,RequestMethod.POST}, 
					produces = { "application/json" }
					)
			public List<Formation> findAll(HttpServletResponse response) throws IOException{
				List<Formation> formation = null;
				try
				{
					formation = formationService.findAll();
				}
				catch(Exception e)
				{
					response.sendError(404);
				}
				return formation;
				
			}

	}


