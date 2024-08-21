package contactService;

public class Contact {
	 private String contactID; // not updatable
	 private String firstName;
     private String lastName;
	 private String phone;
	 private String address;

	 public Contact(String contactID, String firstName, String lastName, String phone, String address) {
	     if (contactID == null || firstName == null || lastName == null || phone == null || address == null) {
	            throw new IllegalArgumentException("Fields cannot be null");
	        }
	     if (contactID.length() > 10 || firstName.length() > 10 || lastName.length() > 10 || phone.length() != 10 || address.length() > 30) {
	            throw new IllegalArgumentException("Invalid field lengths");
	        }
	     
	        this.contactID = contactID;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.phone = phone;
	        this.address = address;
	    }
	 
	 // Getters and setters
	 public String getContactID() {
		 return contactID;
	 }
	 
	 public void setContactID(String contactID) {
		 if(contactID == null || contactID.length() > 10) {
			 throw new IllegalArgumentException("Invalid contactID");
		 }
		 this.contactID = contactID;
	 }
	 
	 public String getFirstName() {
	        return firstName;
	    }
	 
	 public void setFirstName(String firstName) {
	        if (firstName == null || firstName.length() > 10) {
	            throw new IllegalArgumentException("Invalid first name");
	        }
	        this.firstName = firstName;
	    }
	 
	 public String getLastName() {
	        return lastName;
	    }

	 public void setLastName(String lastName) {
	     if (lastName == null || lastName.length() > 10) {
	            throw new IllegalArgumentException("Invalid last name");
	     }
	     this.lastName = lastName;
	    }
	 
	 public String getPhone() {
	        return phone;
	    }
	 
	 public void setPhone(String phone) {
	        if (phone == null || phone.length() != 10) {
	            throw new IllegalArgumentException("Invalid phone");
	        }
	        this.phone = phone;
	    }
	 
	 public String getAddress() {
		 return address;
	 }
	 
	 public void setAddress(String address) {
		 if (address == null || address.length() > 30) {
			 throw new IllegalArgumentException("Invalid address");
		 }
		 this.address = address;
	 }
	 
		 
	 }
	 
	