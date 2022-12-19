package com.brandon.contact;

public class Contact {
	
	// Instance variables 
	private String contactId;
	private String phone;
	private String address;
	private String firstName;
	private String lastName;
	
	
	// Contact builder
	public Contact(String contactId,String firstName,String lastName,String phoneNumber,String address){
		if(contactId.length() <= 10 && contactId != null) {
			this.contactId = contactId;
		}
		this.setFirst(firstName);
		this.setLast(lastName);
		this.setPhone(phoneNumber);
		this.setAddress(address);
	}

	
	// Getters
	public String getId() {
		return contactId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phone;
	}

	public String getAddress() {
		return address;
	}
	
	// Setters
	public void setFirst(String firstName) {
		if(firstName.length() <= 10 && firstName != null) {
			this.firstName = firstName;
		}
	}
	
	public void setLast(String lastName) {
		if(lastName.length() <= 10 && lastName != null) {
			this.lastName = lastName;
		}
	}

	public void setPhone(String phoneNumber) {
		if(phoneNumber.length() == 10 && phoneNumber != null) {
			this.phone = phoneNumber;
		}
	}
	
	public void setAddress(String address) {
		if(address.length() <= 30 && address != null) {
			this.address = address;
		}
	}

	

	// To string function 
	@Override
	public String toString() {
		return "Contact [contactID=" + contactId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phoneNumber=" + phone + ", address=" + address + "]";
	}
}