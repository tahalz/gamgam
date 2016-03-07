package com.dena.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dena.entities.Membre;
import com.dena.service.IMembreService;

@RestController
@RequestMapping("/membre")
public class  MembreController {

	@Autowired
	private IMembreService membreService ;
	@RequestMapping(value="/find/sexe/{sexe}",method=RequestMethod.GET)
	public List<Membre> findBySexe(@PathVariable Boolean sexe) {
		return membreService.findBySexe(sexe);
	}
	
	@RequestMapping(value="/find/civilite/{civilite}",method=RequestMethod.GET)
	public List<Membre> findByCivilite(@PathVariable String civilite) {
		return membreService.findByCivilite(civilite);
	}
	public IMembreService getMembreService() {
		return membreService;
	}
	public void setMembreService(IMembreService membreService) {
		this.membreService = membreService;
	}
	@RequestMapping(method=RequestMethod.POST)
	public Membre save(@RequestBody Membre membre) {
		return membreService.save(membre);
	}
	@RequestMapping(method=RequestMethod.GET)
	public List<Membre> findAll() {
		return membreService.findAll();
	}
	@RequestMapping(value="/find/{id}",method=RequestMethod.GET)
	public Membre findById(@PathVariable long id) {
		return membreService.findById(id);
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		membreService.delete(id);
	}
	 @RequestMapping( value="/update/{id}",method=RequestMethod.PUT)
	public Membre update(@ PathVariable long id,@RequestBody Membre membre) {
		return membreService.update(id,membre);
	}

	

}