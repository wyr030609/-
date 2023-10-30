package cs3.service;

import cs3.model.Contact;

public interface ContactService {
    void addContact(Contact contact);

    void updateContact(Contact contact);

    void deleteContact(String name);

    Contact getContact(String name);
}
