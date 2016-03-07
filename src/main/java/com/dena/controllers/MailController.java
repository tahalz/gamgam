package com.dena.controllers;
<<<<<<< HEAD

=======
import java.util.Date;
>>>>>>> ba5d0ebef0f45be6581b34571663f40eb56d8ab0
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
	@RequestMapping(value="/find/dateenvoi/{dateenvoi}",method=RequestMethod.GET)
	public List<Mail> findByDateEnvoi(@PathVariable Date dateenvoi) {
		return mailService.findByDateEnvoi(dateenvoi);
	}
	@RequestMapping(value="/find/email/{email}",method=RequestMethod.GET)
	public List<Mail> findByEmail(@PathVariable String email) {
		return mailService.findByEmail(email);
	}
	@Autowired
	private IMailService mailService ;
	@RequestMapping(value="/find/contenu/{contenu}",method=RequestMethod.GET)
	public List<Mail> findByContenu(@PathVariable String contenu) {
		return mailService.findByContenu(contenu);
	}
	@RequestMapping(method=RequestMethod.POST)
	public Mail save(@RequestBody Mail mail) {
		return mailService.save(mail);
	}
	@RequestMapping(method=RequestMethod.GET)
	public List<Mail> findAll() {
		return mailService.findAll();
	}
	@RequestMapping(value="/find/{id}",method=RequestMethod.GET)
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

