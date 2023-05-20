package com.company.strings;

public class Question3 {
    public static void main(String[] args) {

       /*3. Given a String “Java String pool refers to collection of Strings which are stored in heap
        memory”, perform the following operations (Hint: all operation can be performed using
        String methods)
        a. Print the string to console in lowercase
        b. Print the string to console in uppercase
        c. Replace all ‘a’ character in the string with $ sign
        d. Check if the original String contains the word “collection”
        e. Check if the following String “java string pool refers to collection of strings which
        are stored in heap memory” matches the original
        f. If the string does not match check if there is another method which can be used to
        check if the strings are equal*/
        //a.
        String s= "Java String pool refers to collection of Strings which are stored in heap memory";
        System.out.println("In Lower Case "+s.toLowerCase());
//        b.
        System.out.println("In Upper Case "+s.toUpperCase());
//        c.
        String st=" $";
//        System.out.println("After Replacement "+s.replace(0,10,"a",st));
//        d.
        System.out.println(s.contains("collection"));
        String target="java string pool refers to collection of strings which are stored in heap memory";
        System.out.println(s.equals(target));
        System.out.println(s.equalsIgnoreCase(target));
        System.out.println(s==target);// compares references not values
        /* comapreTo matgod:
        0: if s1==s2
        Pos val: s1>s2
        Neg Val: s1<s2
         */
        System.out.println(s.compareTo(s));
        System.out.println(s.compareTo(target));
        System.out.println(target.compareTo(s));

    }
}
