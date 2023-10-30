package cs3.model;

public class Contact {
    private String name;
    private String address;
    private String phoneNumber;

    public Contact(String name, String phone, String address) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phone;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


}

