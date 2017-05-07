package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Contact;
import com.example.service.ContactService;

@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/contacts")
	public List<Contact> getAllContact(){
		 return contactService.getAllContacts();
	}
	
	@RequestMapping("/contacts/{idcontact}")
	public Contact getContact(@PathVariable Integer idcontact){
		System.out.println("Probando este metodo");
		return contactService.getContact(idcontact);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/contacts")
	public void addContact(@RequestBody Contact contact){
		contactService.addContact(contact);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/contacts/{idcontact}")
	public void updateContact(@RequestBody Contact contact, @PathVariable Integer idcontact){
		contactService.updateContact(idcontact, contact);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/contacts/{idcontact}")
	public void deleteContact(@PathVariable Integer idcontact){
		contactService.deleteContact(idcontact);
	}
	
}
