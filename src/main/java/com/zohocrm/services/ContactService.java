package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Contact;


public interface ContactService {
	public void SaveContact(Contact contact);

	public List<Contact> findAllContacts();

	public Contact getContactById(long id);
}
