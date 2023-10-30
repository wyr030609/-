package cs2;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import cs2.Contact;

public class Client {
    public static void main(String[] args) {

        Contact contact = new Contact("C/S2", "1234", "吴怡睿");
        Contact contact2 = new Contact("2222", "1111", "吴怡睿");
        Contact contact3 = new Contact("3333", "0000", "0000");
        Contact contact4 = new Contact("3333", "8888", "8888");
        DatabaseConnector data = new DatabaseConnector();
        data.addContact(contact);
        data.addContact(contact2);
        data.addContact(contact3);
        data.deleteContact("2222");
        System.out.println(data.getContact("C/S2").getAddress());
        data.updateContact(contact4);


    }

}
