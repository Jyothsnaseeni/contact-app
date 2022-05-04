package com.miniproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniproject.Entity.Contacts;
import com.miniproject.model.ContactsInfo;
import com.miniproject.repo.ContactsRepo;

@Service
public class ContactServiceImpl implements IContactService {

	@Autowired
	private ContactsRepo contactsRepo;

	@Override
	public boolean saveContact(Contacts contacts) {

		contacts.setIsActive("Y");
		Contacts savedObj = contactsRepo.save(contacts);
		return savedObj.getContactId() != null;
	}

	@Override
	public List<Contacts> getAllContacts() {
		return contactsRepo.findByIsActive("Y");

	}

	@Override
	public Contacts getContactById(Integer contactId) {
		Optional<Contacts> findById = contactsRepo.findById(contactId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public boolean updateContact(Contacts contacts) {
		try {
			Contacts save = contactsRepo.save(contacts);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		try {
            Contacts contacts = contactsRepo.findById(contactId).get();
            contacts.setIsActive("N");  
			contactsRepo.save(contacts);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

}
