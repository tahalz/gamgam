package com.dena.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dena.entities.Mail;
import com.dena.service.IMailService;

@RestController
@RequestMapping("/mail")
public class MailController {

	@Autowired
	private IMailService mailService ;
	
	@RequestMapping(method=RequestMethod.POST)
	public Mail save(@RequestBody Mail mail) {
		return mailService.save(mail);
	}
	@RequestMapping(method=RequestMethod.GET)
	public List<Mail> findAll() {
		return mailService.findAll();
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public Mail findById(@PathVariable long id) {
		return mailService.findById(id);
	}
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable long id) {
		mailService.delete(id);
	}
	 @RequestMapping( value="/update/{id}",method=RequestMethod.PUT)
	public Mail update(@ PathVariable long id,@RequestBody Mail mail) {
		return mailService.update(id,mail);
	}

	

}

