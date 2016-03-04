package com.dena.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dena.entities.LettreMotivation;
import com.dena.service.ILettreMotivationService;

@RestController
@RequestMapping("/lettremotivation")
public class LettreMotivationController {

	@Autowired
	private ILettreMotivationService lettreMotivationService ;
	
	@RequestMapping(method=RequestMethod.POST)
	public LettreMotivation save(@RequestBody LettreMotivation lettreMotivation) {
		return lettreMotivationService.save(lettreMotivation);
	}
	@RequestMapping(method=RequestMethod.GET)
	public List<LettreMotivation> findAll() {
		return lettreMotivationService.findAll();
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public LettreMotivation findById(@PathVariable long id) {
		return lettreMotivationService.findById(id);
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		lettreMotivationService.delete(id);
	}
	 @RequestMapping( value="/update/{id}",method=RequestMethod.PUT)
	public LettreMotivation update(@ PathVariable long id,@RequestBody LettreMotivation lettreMotivation) {
		return lettreMotivationService.update(id,lettreMotivation);
	}

	

}