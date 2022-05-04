package com.miniproject.service;

import java.util.List;

import com.miniproject.Entity.Contacts;
import com.miniproject.model.ContactsInfo;

public interface IContactService {
	
	public boolean saveContact(Contacts contacts);
	
	public List<Contacts> getAllContacts();
	
	public Contacts getContactById(Integer contactId);
	
	public boolean updateContact(Contacts contacts);
	
	public boolean deleteContactById(Integer contactId);
	
	

}
