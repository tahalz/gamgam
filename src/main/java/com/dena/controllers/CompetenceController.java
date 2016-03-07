package com.dena.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dena.entities.Competence ;
import com.dena.service.ICompetenceService;


@RestController
@RequestMapping("competence")
public class CompetenceController {


		
		@Autowired
		private ICompetenceService competenceService ;

		public ICompetenceService getCompetenceService() {
			return competenceService;
		}

		public void setICompetenceService(ICompetenceService competenceService) {
			this.competenceService = competenceService;
		}

		@RequestMapping(
				method = {RequestMethod.GET,RequestMethod.POST}, 
				produces = { "application/json" }
				)
		public List<Competence> findAll(HttpServletResponse response) throws IOException{
			List<Competence> competence = null;
			
				competence = competenceService.findAll();
			
		
			return competence;
			
		}

	}


