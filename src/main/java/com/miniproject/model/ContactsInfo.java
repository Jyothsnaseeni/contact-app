package com.miniproject.model;

public class ContactsInfo {
	private Integer contactId;
	private String name;
	private String email;
	private Integer phnNo;
	
	public ContactsInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContactsInfo(Integer contactId, String name, String email, Integer phnNo) {
		super();
		this.contactId = contactId;
		this.name = name;
		this.email = email;
		this.phnNo = phnNo;
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

	public Integer getPhnNo() {
		return phnNo;
	}

	public void setPhnNo(Integer phnNo) {
		this.phnNo = phnNo;
	}

	@Override
	public String toString() {
		return "ContactsInfo [contactId=" + contactId + ", name=" + name + ", email=" + email + ", phnNo=" + phnNo
				+ "]";
	}
	
	

	

}
