package com.brandon.contact;

import java.util.ArrayList;

public class ContactService {
	ArrayList<Contact> contactList;

	public ContactService() {
		contactList = new ArrayList<>();
	}

	// Add contact
	public boolean addContact(Contact contact) {
		
		boolean exists = false;
		for (Contact con : contactList) {
			if (con.equals(contact)) {
				exists = true;
			}
		}
		
		if (!exists) {
			contactList.add(contact);
			System.out.println("Contact added");
			return true;
		} else {
			System.out.println("Contact exists already");
			return false;
		}
	}

	// Delete contact
	public boolean deleteContact(String id) {

		boolean deleted = false;
		for (Contact con : contactList) {
			if (con.getId().equalsIgnoreCase(id)) {
				contactList.remove(con);
				deleted = true;
				break;
			}
		}
		return deleted;
	}

	// Update first name
	public boolean updateContactFirstName(String id, String newFirst) {

		boolean updated = false;
		for (Contact con : contactList) {
			if (con.getId().equalsIgnoreCase(id)) {
				con.setFirst(newFirst);
				updated = true;
				break;
			}
		}
		return updated;
	}

	// Update last name
	public boolean updateContactLastName(String id, String newLast) {

		boolean updated = false;
		for (Contact con : contactList) {
			if (con.getId().equalsIgnoreCase(id)) {
				con.setLast(newLast);
				updated = true;
				break;
			}
		}
		return updated;
	}

	// Update the phone number
	public boolean updateContactNumber(String id, String newNum) {

		boolean updated = false;
		for (Contact con : contactList) {
			if (con.getId().equalsIgnoreCase(id)) {
				con.setPhone(newNum);
				updated = true;
				break;
			}
		}
		return updated;
	}

	// Update the address
	public boolean updateContactAddress(String id, String newAddress) {

		boolean updated = false;
		for (Contact con : contactList) {
			if (con.getId().equalsIgnoreCase(id)) {
				con.setAddress(newAddress);
				updated = true;
				break;
			}
		}
		return updated;
	}

	// Loop through the array list and print all of the contacts
	public void displayAllContacts() {

		for (Contact con : contactList) {
			System.out.println(con.toString());
		}
	}

	// Update contact given all string parameters
	public boolean updateContact(String contactId, String firstName, String lastName, String phoneNumber,
			String address) {

		for (Contact contactList : contactList) {

			if (contactList.getId().equals(contactId)) {
				
				if (!firstName.equals("") && !(firstName.length() > 10)) {
					contactList.setFirst(firstName);
				}
				
				if (!lastName.equals("") && !(lastName.length() > 10)) {
					contactList.setLast(lastName);
				}
				
				if (!phoneNumber.equals("") && (phoneNumber.length() == 10)) {
					contactList.setPhone(phoneNumber);
				}
				
				if (!address.equals("") && !(address.length() > 30)) {
					contactList.setAddress(address);
				}
				
				return true;
			}
		}
		return false;
	}

}
