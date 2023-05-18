package com.company.collections;

import java.util.Map;
import java.util.TreeMap;

/*Given a TreeMap<Long, Contact>
which has phone numbers for keys and contact objects for values.
        Write solutions to
        a. Fetch all the keys and print them,
        b. Fetch all the values and print them
        c. Print all key-value pairs
        Note: a) Contacts should be stored in descending order of phone number
        b) Contact Class:
            • PhoneNumer: <long>
            • Name: <String>
            • Email: <String>
            • Gender: <Enum>*/

public class Assignment3Q1 {


    public static void main(String[] args) {
        System.out.println("Collection");
        Contact obj1=new Contact("abc","abc@gmail.com");
        Contact obj2=new Contact("xyz","xyz@gmail.com");
        Contact obj3=new Contact("axb","axb@gmail.com");
        TreeMap<Long,Contact> map=new TreeMap<>();
        map.put(99999999L,obj1);
        map.put(11111111L,obj2);
        map.put(22222222L,obj3);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);
        for (Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


    }
}
