package com.dena.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.dena.entities.InformationPersonnel;
import com.dena.service.IInformationPersonnelService;


@RestController
@RequestMapping("informationpersonnel")

public class InformationPersonnelController {
	

		@Autowired
		private IInformationPersonnelService informationPersonnelService ;

		public IInformationPersonnelService getIInformationPersonnelService() {
			return informationPersonnelService;
		}

		public void setIInformationPersonnelService(IInformationPersonnelService informationPersonnelService) {
			this.informationPersonnelService = informationPersonnelService;
		}

		@RequestMapping(
				method = {RequestMethod.GET,RequestMethod.POST}, 
				produces = { "application/json" }
				)
		public List<InformationPersonnel> findAll(HttpServletResponse response) {
			List<InformationPersonnel> informationPersonnel = null;
			
			informationPersonnel = informationPersonnelService.findAll();
		
			return informationPersonnel;
			
		}

	}


