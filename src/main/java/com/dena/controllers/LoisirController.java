package com.dena.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dena.entities.Loisir;
import com.dena.service.ILoisirService;

@RestController
@RequestMapping("/loisir")

public class LoisirController {


		@Autowired
		private ILoisirService loisirService ;
		
		@RequestMapping(method=RequestMethod.POST)
		public Loisir save(@RequestBody Loisir loisir) {
			return loisirService.save(loisir);
		}
		@RequestMapping(method=RequestMethod.GET)
		public List<Loisir> findAll() {
			return loisirService.findAll();
		}
		@RequestMapping(value="/{id}",method=RequestMethod.GET)
		public Loisir findById(@PathVariable long id) {
			return loisirService.findById(id);
		}
		@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
		public void delete(@PathVariable long id) {
			loisirService.delete(id);
		}
	/*	 @RequestMapping( value="/update/{id}",method=RequestMethod.PUT)
		public Loisir update(@ PathVariable long id,@RequestBody Mail mail) {
			return mailService.update(id,mail);
		}
  */
		

	}


