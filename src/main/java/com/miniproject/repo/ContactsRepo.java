package com.miniproject.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miniproject.Entity.Contacts;

public interface ContactsRepo extends JpaRepository<Contacts, Serializable>{
	
	public List<Contacts> findByIsActive(String isActive);
}
