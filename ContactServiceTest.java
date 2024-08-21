package contactService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ContactServiceTest {

	private ContactService contactService;
	
	@BeforeEach
	public void setUp() {
		contactService = new ContactService();
	}
	
	@Test
	public void testAddContact() {
		Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertTrue(contactService.addContact(contact));
	}
	
	@Test
    public void testAddDuplicateContact() {
        Contact contact1 = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        Contact contact2 = new Contact("1234567890", "Jane", "Smith", "9876543210", "456 Elm St");
        assertTrue(contactService.addContact(contact1));
        assertFalse(contactService.addContact(contact2));
    }
	
	@Test
    public void testDeleteContact() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        assertTrue(contactService.deleteContact("1234567890"));
    }
	
	@Test
    public void testDeleteNonexistentContact() {
        assertFalse(contactService.deleteContact("9999999999"));
    }
	
	@Test
    public void testUpdateFirstName() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        assertTrue(contactService.updateFirstName("1234567890", "Jane"));
        assertEquals("Jane", contactService.getContact("1234567890").getFirstName());
    }
	
	@Test
    public void testUpdateLastName() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        assertTrue(contactService.updateLastName("1234567890", "Smith"));
        assertEquals("Smith", contactService.getContact("1234567890").getLastName());
    }
	
	@Test
    public void testUpdatePhone() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        assertTrue(contactService.updatePhone("1234567890", "9876543210"));
        assertEquals("9876543210", contactService.getContact("1234567890").getPhone());
    }
	
	@Test
    public void testUpdateAddress() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        contactService.addContact(contact);
        assertTrue(contactService.updateAddress("1234567890", "456 Elm St"));
        assertEquals("456 Elm St", contactService.getContact("1234567890").getAddress());
    }

}
