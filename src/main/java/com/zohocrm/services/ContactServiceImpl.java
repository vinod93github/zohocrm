package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Contact;
import com.zohocrm.repositories.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	ContactRepository contactrepo;
	@Override
	public void SaveContact(Contact contact) {
		contactrepo.save(contact);

	}

	@Override
	public List<Contact> findAllContacts() {
		List<Contact> contact = contactrepo.findAll();
		return contact;
	}

	@Override
	public Contact getContactById(long id) {
		Contact contact = contactrepo.getById(id);
		return contact;
	}

}
