package com.dena.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
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
	@RequestMapping(method=RequestMethod.GET,headers="Accept=application/json")
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
	 //retrouver le username et les roles du member loged
	@RequestMapping(value="/getLogedUser")
	public Map<String, Object> getLogedUser(HttpSession httpSession){
		SecurityContext securityContext=(SecurityContext) httpSession.getAttribute("SPRING_SECURITY_CONTEXT");
		String useName=securityContext.getAuthentication().getName();
		List<String> roles=new ArrayList<>();
		for(GrantedAuthority grantedAuthority :securityContext.getAuthentication().getAuthorities())
			roles.add(grantedAuthority.getAuthority());
		Map<String, Object> params=new HashMap<>();
		params.put("userName", useName);
		params.put("roles", roles);
		return params;
		
	}
	
	

}