package com.company.strings;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        1. Write an application to determine the length of the String str = “Hello World”. (Hint: Use
//        String method)

        String str="Hello World";
        System.out.println(str.length());

        /*2.Write an application to join the two Strings “Hello, ” & “How are you?” (Hint: Use String
        method)*/
        String s1="Hello ";
        String s2="How are you?";
        System.out.println(s1.concat(s2));

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
//        String st=" $";
//        String res=s.replaceAll("a",st);
//        System.out.println("After Replacement "+res);
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


        /*Write an application to append the following strings “StringBuffer”, “is a peer class of
        String”, “that provides much of “, “the functionality of strings” using a StringBuffer*/
        StringBuffer stringBuffer=new StringBuffer("StringBuffer");
        System.out.println(stringBuffer.append(" is a peer class of String that provides much of ").append("that provides much of ").append("the functionality of strings” using a StringBuffer"));

        /*2) Insert the following string “insert text” into the string “It is used to _ at the specified index
        position” at the location denoted by the sign _*/
        StringBuffer stringBuffer1=new StringBuffer("It is used to at the specified index position");
        System.out.println(stringBuffer1.insert(14,"insert text "));

        /*3. Reverse the following string “This method returns the reversed object on which it was called” using StringBuffer Class */
        StringBuffer sb=new StringBuffer("This method returns the reversed object on which it was called” using StringBuffer Class");
        System.out.println(sb.reverse());



//        StringBuilder

        StringBuilder stringBuilder=new StringBuilder("StringBuilder");
        System.out.println(stringBuilder.append(" is a peer class of String that provides much of ").append("that provides much of ").append("the functionality of strings” using a StringBuilder"));

        StringBuilder stringBuilder1=new StringBuilder("It is used to at the specified index position");
        System.out.println(stringBuilder1.insert(14,"insert text "));

        StringBuilder builder=new StringBuilder("This method returns the reversed object on which it was called using StringBuilder Class");
        System.out.println(builder.reverse());



    }


}
