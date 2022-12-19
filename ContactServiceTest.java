package com.brandon.contact;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ContactServiceTest {

	// Tests with good contacts
	@Test
	public void testMethodAddPass() {
		ContactService cs = new ContactService();
		Contact con1 = new Contact("001", "Jalen", "Hurts", "2152123344", "52 Broad Street");
		Contact con2 = new Contact("011", "AJ", "Brown", "2152123344", "52 Broad Street");
		Contact con3 = new Contact("006", "Devonta", "Smith", "2152123344", "52 Broad Street");
		assertEquals(true, cs.addContact(con1));
		assertEquals(true, cs.addContact(con2));
		assertEquals(true, cs.addContact(con3));
	}

	// Testing add function with bad data
	@Test
	public void testMethodAddFail() {
		ContactService cs = new ContactService();
		Contact con1 = new Contact("001", "Jalen", "Hurts", "2152123344", "52 Broad Street");
		Contact con2 = new Contact("002", "", "Test", "2152123344", "52 Broad Street");
		Contact con3 = new Contact("003", "Test", "Case", "215212334499", "52 Broad Street");
		assertEquals(true, cs.addContact(con1));
		assertEquals(false, cs.addContact(con1));
		assertEquals(true, cs.addContact(con3));
		assertEquals(true, cs.addContact(con2));
	}

	// Update test with good data
	@Test
	public void testUpdatePass() {
		ContactService cs = new ContactService();
		Contact con1 = new Contact("001", "Jalen", "Hurts", "2152123344", "52 Broad Street");
		Contact con2 = new Contact("011", "AJ", "Brown", "2152123344", "52 Broad Street");
		Contact con3 = new Contact("006", "Devonta", "Smith", "2152123344", "52 Broad Street");
		assertEquals(true, cs.addContact(con1));
		assertEquals(true, cs.addContact(con3));
		assertEquals(true, cs.addContact(con2));

		assertEquals(true, cs.updateContact("001", "Jalen", "Hurts", "2152123344", "1 Broad Street"));
		assertEquals(true, cs.updateContact("011", "AJ", "Brown", "2152123344", "1000 Always Open"));
	}

	// Update test with bad data
	@Test
	public void testUpdateFail() {
		ContactService cs = new ContactService();
		Contact con1 = new Contact("001", "Jalen", "Hurts", "2152123344", "52 Broad Street");
		Contact con2 = new Contact("011", "AJ", "Brown", "2152123344", "52 Broad Street");
		Contact con3 = new Contact("006", "Devonta", "Smith", "2152123344", "52 Broad Street");
		assertEquals(true, cs.addContact(con1));
		assertEquals(true, cs.addContact(con3));
		assertEquals(true, cs.addContact(con2));

		assertEquals(false, cs.updateContact("055", "Jalen", "Hurts", "2152123344", "52 Broad Street"));
		assertEquals(true, cs.updateContact("001", "Jalen", "Hurts", "1111111111", "52 Broad Street"));
	}

	// Delete test with good data
	@Test
	public void testMethodDeletePass() {
		ContactService cs = new ContactService();
		Contact con1 = new Contact("001", "Jalen", "Hurts", "2152123344", "52 Broad Street");
		Contact con2 = new Contact("011", "AJ", "Brown", "2152123344", "52 Broad Street");
		Contact con3 = new Contact("006", "Devonta", "Smith", "2152123344", "52 Broad Street");
		assertEquals(true, cs.addContact(con1));
		assertEquals(true, cs.addContact(con2));
		assertEquals(true, cs.addContact(con3));

		assertEquals(true, cs.deleteContact("001"));
		assertEquals(true, cs.deleteContact("011"));
	}

	// Delete test with bad data
	@Test
	public void testMethodDeleteFail() {
		ContactService cs = new ContactService();
		Contact con1 = new Contact("001", "Jalen", "Hurts", "2152123344", "52 Broad Street");
		Contact con2 = new Contact("011", "AJ", "Brown", "2152123344", "52 Broad Street");
		Contact con3 = new Contact("006", "Devonta", "Smith", "2152123344", "52 Broad Street");
		assertEquals(true, cs.addContact(con1));
		assertEquals(true, cs.addContact(con3));
		assertEquals(true, cs.addContact(con2));

		assertEquals(false, cs.deleteContact("088"));
		assertEquals(true, cs.deleteContact("001"));
	}

}
