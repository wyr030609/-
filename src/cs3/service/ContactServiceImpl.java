package cs3.service;

import cs3.model.Contact;
import cs3.Dao.ContactDAO;
import cs3.service.ContactService;

public class ContactServiceImpl implements ContactService {
    private ContactDAO contactDAO;

    public ContactServiceImpl(ContactDAO contactDAO) {
        this.contactDAO = contactDAO;
    }

    @Override
    public void addContact(Contact contact) {
        // 添加联系人前可以做一些逻辑判断和处理
        contactDAO.addContact(contact);
    }

    @Override
    public void updateContact(Contact contact) {
        // 更新联系人前可以做一些逻辑判断和处理
        contactDAO.updateContact(contact);
    }

    @Override
    public void deleteContact(String name) {
        // 删除联系人前可以做一些逻辑判断和处理
        contactDAO.deleteContact(name);
    }

    @Override
    public Contact getContact(String name) {
        // 查询联系人前可以做一些逻辑判断和处理
        return contactDAO.getContact(name);
    }
}