package com.company.collections;

import java.util.*;

public class Assignment3Q2 {
    public static void main(String[] args)
    {

        HashSet<product> set = new HashSet<>();


        set.add(new product("cream", 499));
        set.add(new product("Maggie", 12));
        set.add(new product("Nachos", 50));
        set.add(new product("Shampoo", 451));
        set.add(new product("Shampoo", 451));
        for (product std : set) {
            System.out.println(std.name + " " + std.price);
        }
    }
}