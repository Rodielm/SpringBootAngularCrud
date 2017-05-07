package com.example.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.model.Contact;
import com.example.repository.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	public List<Contact> getAllContacts(){
		List<Contact> contacts = new ArrayList<>();
		contactRepository.findAll().forEach(contacts::add);
		return contacts;
	}
	
	public Contact getContact(Integer idcontact){	
		return contactRepository.findOne(idcontact);
	}
	
	public void addContact(Contact contact){
		contact.setCreated_at(LocalDateTime.now().toString());
		contactRepository.save(contact);
	}
	
	public void updateContact(Integer idcontact, Contact contact){
		contactRepository.save(contact);
	}
	
	public void deleteContact(Integer idcontact){
		contactRepository.delete(idcontact);
	}
	
	
	
	
	
	
	

}
