package com.company.StringBuilder;

public class Main {
    public static void main(String[] args) {
        //        StringBuilder

        StringBuilder stringBuilder=new StringBuilder("StringBuilder");
        System.out.println(stringBuilder.append(" is a peer class of String that provides much of ").append("that provides much of ").append("the functionality of strings” using a StringBuilder"));

        StringBuilder stringBuilder1=new StringBuilder("It is used to at the specified index position");
        System.out.println(stringBuilder1.insert(14,"insert text "));

        StringBuilder builder=new StringBuilder("This method returns the reversed object on which it was called using StringBuilder Class");
        System.out.println(builder.reverse());
    }
}
