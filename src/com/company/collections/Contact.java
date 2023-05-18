package com.company.collections;

class Contact {
    long phoneNumber;
    String name;
    String email;

    enum gender {
        Male,
        Female;
    }

    Contact(String name, String email) {

        this.name = name;
        this.email = email;
    }
}