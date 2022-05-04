package com.miniproject.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.miniproject.Entity.Contacts;
import com.miniproject.constants.AppConstants;
import com.miniproject.props.AppProperties;
import com.miniproject.service.IContactService;

@Controller
public class ContactsController {

	@Autowired
	private IContactService iContactService;
	
	@Autowired
	private AppProperties appProperties;
	
	@Autowired
	private AppConstants appConstants;

	@GetMapping("/loadForm")
	public String loadForm(Model model) {

		model.addAttribute("contacts", new Contacts());

		return "index";
	}

	// Model is used to send data frm controller to Ui
	// RedirectAttributes is used to send data to redirected URL method i.e, here
	// "/contactSavedSuccessfully"
	// RedirectAttributes used to avoid double posting problem(i.e.,duplicate values
	// r stored when we refresh the page)

	@SuppressWarnings("static-access")
	@PostMapping("/saveContact")
	public String handleSaveContactBtn(Contacts contacts, Model model) {

		boolean isSaved = iContactService.saveContact(contacts);
		
		Map<String, String> messages = appProperties.getMessages();
		
		String msgTxt = null;

		if (contacts.getContactId() == null) {
			msgTxt = messages.get(appConstants.SAVE_SUCCESS);
		} else {
			msgTxt = messages.get(appConstants.UPDATE_SUCCESS);
		}

		if (isSaved) {
			model.addAttribute(appConstants.SUCCESS_MSG, msgTxt);

		} else {
			model.addAttribute(appConstants.ERROR_MSG, messages.get(appConstants.SAVE_FAIL));
		} 
		
		return appConstants.INDEX_VIEW;
	}

	@GetMapping("/viewContacts")
	public String handleviewContactsHyperLink(Model model) {
		List<Contacts> contactsList = iContactService.getAllContacts();
		model.addAttribute("contacts", contactsList);

		return "viewContacts";
	}

	@GetMapping("/edit")
	public String handleEditClick(@RequestParam("cid") Integer cid, Model model) {

		Contacts contactObj = iContactService.getContactById(cid);
		model.addAttribute("contacts", contactObj);

		return appConstants.INDEX_VIEW;
	}
	
	@GetMapping("/delete")
	public String handleDeleteClick(@RequestParam("cid") Integer cid) {
		iContactService.deleteContactById(cid);
		return "redirect:/viewContacts";
	}
}
