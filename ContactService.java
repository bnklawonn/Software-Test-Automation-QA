package contactService;
import java.util.HashMap;

public class ContactService {
	private final HashMap<String, Contact> contacts = new HashMap<>();
	
	public void addContact(Contact contact) {
		if (contacts.containsKey(contact.getFirstName())) {
			throw new IllegalArgumentException("Contact with this ID already exists");
		}
		contacts.put(contact.getFirstName(), contact);
		
		}
	
	public void deleteContact(String contactID) {
		contacts.remove(contactID);
	}
	
	public void updateFirstName(String contactId, String firstName) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setFirstName(firstName);
        } else {
            throw new IllegalArgumentException("Contact ID not found");
        }
    }
	
	public void updateLastName(String contactId, String lastName) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setLastName(lastName);
        } else {
            throw new IllegalArgumentException("Contact ID not found");
        }
    }
	
	public void updatePhone(String contactId, String phone) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setPhone(phone);
        } else {
            throw new IllegalArgumentException("Contact ID not found");
        }
    }
	
	public void updateAddress(String contactId, String address) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setAddress(address);
        } else {
            throw new IllegalArgumentException("Contact ID not found");
        }
    }
	
	public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
	
	
}