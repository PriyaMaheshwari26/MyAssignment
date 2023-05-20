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
        Contact obj1=new Contact(99999999L,"abc","abc@gmail.com", gender.Male);
        Contact obj2=new Contact(11111111L,"xyz","xyz@gmail.com", gender.Female);
        Contact obj3=new Contact(22222222L,"axb","axb@gmail.com", gender.Female);
        TreeMap<Long,Contact> map=new TreeMap<>();
        map.put(obj1.phoneNumber, obj1);
        map.put(obj2.phoneNumber, obj2);
        map.put(obj3.phoneNumber, obj3);
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map);
        for (Map.Entry m:map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
        System.out.println(m.getValue().toString());
        }
//        System.out.println(map.values().toString());


    }

}
