package com.project1;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ArrayList <String> list = new ArrayList<String>(Arrays.asList("a1","a2","b1","b2","c2","c1"));
//        list.stream()
//                .filter(s->s.startsWith("c")) //lambda exp
//                .map(String::toUpperCase) //static method reference
//                .sorted()
//                .forEach(System.out::println);
        // .skip(2) //skip 2 elements
        // .limit(3) //limit to n elements

        ArrayList <String> list = new ArrayList<String>(Arrays.asList("adam ","mike","alex","zack","ole","michael","ben","melony","mark","carl"));
        list.stream()

                .filter(s->s.startsWith("m")) //lambda exp
                .skip(6)
                .map(String::toUpperCase) //static method reference
                .sorted()
                .forEach(System.out::println);
    }
}
