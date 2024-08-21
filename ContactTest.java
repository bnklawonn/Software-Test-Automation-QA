package contactService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
    public void testContactID() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("1234567890", contact.getContactID());
    }

    @Test
    public void testContactFirstName() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("John", contact.getFirstName());
    }
    
    @Test
    public void testContactLastName() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("Doe", contact.getLastName());
    }

    @Test
    public void testContactPhone() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("1234567890", contact.getPhone());
    }

    @Test
    public void testContactAddress() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("123 Main St", contact.getAddress());
    }
    
    @Test
    public void testContactIDLengthLimit() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St"));
    }

    @Test
    public void testContactFirstNameNotNull() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", null, "Doe", "1234567890", "123 Main St"));
    }

    @Test
    public void testContactLastNameNotNull() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", "John", null, "1234567890", "123 Main St"));
    }

    @Test
    public void testContactPhoneFormat() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", "John", "Doe", "12345", "123 Main St"));
    }
    
    @Test
    public void testContactAddressNotNull() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1234567890", "John", "Doe", "1234567890", null));
    }
    
    
	}


