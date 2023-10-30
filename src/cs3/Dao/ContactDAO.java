package cs3.Dao;

import cs3.model.Contact;

public interface ContactDAO {
    void addContact(Contact contact);

    void updateContact(Contact contact);

    void deleteContact(String name);

    Contact getContact(String name);
}
