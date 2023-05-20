package com.company.StringBuffer;

public class Main {
    public static void main(String[] args) {
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
    }
}
