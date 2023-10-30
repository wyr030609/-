package cs3.ui;

import cs3.Dao.ContactDAO;
import cs3.Dao.ContactDAOImpl;
import cs3.model.Contact;
import cs3.service.ContactService;
import cs3.service.ContactServiceImpl;

public class ContactApp {
    public static void main(String[] args) {
        ContactDAO contactDAO = new ContactDAOImpl();
        ContactService contactService = new ContactServiceImpl(contactDAO);
        Contact contact = new Contact("吴怡睿", "1234", "202131061108");
        Contact contact2 = new Contact("wyr", "0000", "0000");
        Contact contact3 = new Contact("111", "1111", "202131061108");
        Contact contact4 = new Contact("wyr", "1310000", "西南石油");
        contactService.addContact(contact);
        contactService.addContact(contact2);
        contactService.addContact(contact3);
        contactService.deleteContact("111");
        System.out.println(contactService.getContact("吴怡睿").getAddress());
        contactService.updateContact(contact4);
    }
}
