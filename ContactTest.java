package com.brandon.contact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    Contact contact = new Contact("1", "Jalen", "Hurts", "0123456789", "2022 MVP Avenue"); 

    @Test
    void getContactId() {
        assertEquals("1", contact.getId());
    }

    @Test
    void getFirstName() {
        assertEquals("Jalen", contact.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Hurts", contact.getLastName());
    }

    @Test
    void getPhoneNumber() {
        assertEquals("0123456789", contact.getPhoneNumber());
    }

    @Test
    void getAddress() {
        assertEquals("2022 MVP Avenue", contact.getAddress());
    }

    @Test
    void testToString() {
        assertEquals("Contact [contactID=1, firstName=Jalen, lastName=Hurts, phoneNumber=0123456789, address=2022 MVP Avenue]", contact.toString());
    }

}