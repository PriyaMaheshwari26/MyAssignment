package com.company.collections;

class Contact {
    long phoneNumber;
    String name;
    String email;
    Enum gender;


    Contact(long phoneNumber,String name, String email, Enum gender) {
        this.phoneNumber=phoneNumber;
        this.name = name;
        this.email = email;
        this.gender=gender;

    }
    public String toString(){
        return name+" "+email+" "+phoneNumber+" "+gender;
    }

}