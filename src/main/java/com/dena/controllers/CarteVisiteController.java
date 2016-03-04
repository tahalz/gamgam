package com.dena.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dena.entities.CarteVisite;
import com.dena.service.ICarteVisiteService;


@RestController
@RequestMapping("/cartevisite")
public class CarteVisiteController {

	@Autowired
	private ICarteVisiteService carteVisiteService ;
	
	@RequestMapping(method=RequestMethod.POST)
	public CarteVisite save(@RequestBody CarteVisite carteVisite) {
		return carteVisiteService.save(carteVisite);
	}
	@RequestMapping(method=RequestMethod.GET)
	public List<CarteVisite> findAll() {
		return carteVisiteService.findAll();
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public CarteVisite findById(@PathVariable long id) {
		return carteVisiteService.findById(id);
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		carteVisiteService.delete(id);
	}
	 @RequestMapping( value="/update/{id}",method=RequestMethod.PUT)
	public CarteVisite update(@ PathVariable long id,@RequestBody CarteVisite carteVisite) {
		return carteVisiteService.update(id,carteVisite);
	}

	

}