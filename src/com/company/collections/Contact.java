package com.company.collections;

import java.util.Comparator;

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
    public Long getPhoneNumber(){
        return phoneNumber;
    }
    class SortAccordingPhoneNumber implements Comparator<Contact> {
        @Override
        public int compare(Contact c1, Contact c2) {
            return c2.getPhoneNumber().compareTo(c1.getPhoneNumber());
        }
    }



    public String toString(){
        return name+" "+email+" "+phoneNumber+" "+gender;
    }

}