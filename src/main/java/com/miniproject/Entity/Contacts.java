package com.miniproject.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class Contacts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contactId;
	private String name;
	private String email;
	private Long phnNo;
	private String isActive;
	
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Contacts(Integer contactId, String name, String email, Long phnNo, String isActive) {
		super();
		this.contactId = contactId;
		this.name = name;
		this.email = email;
		this.phnNo = phnNo;
		this.isActive = isActive;
	}


	public Integer getContactId() {
		return contactId;
	}
	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhnNo() {
		return phnNo;
	}
	public void setPhnNo(Long phnNo) {
		this.phnNo = phnNo;
	}
	public String getIsActive() {
		return isActive;
	}
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
	
	

}
