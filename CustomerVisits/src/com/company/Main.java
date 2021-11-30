package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        customer c1 = new customer();
        customer c2 = new customer();
        customer c3 = new customer();
        customer c4 = new customer();
        customer c5 = new customer();
        customer c6 = new customer();
        customer c7 = new customer();
        customer c8 = new customer();
        customer c9 = new customer();

        c1.name = "Ahmed";
        c1.Id = 1;
        c2.name = "Alex";
        c2.Id = 2;
        c3.name = "Mustafa";
        c3.Id = 3;
        c4.name = "Jim";
        c4.Id = 4;
        c5.name = "li";
        c5.Id = 5;
        c6.name = "Omar";
        c6.Id = 6;
        c7.name = "Raul";
        c7.Id = 7;
        c8.name = "Ali";
        c8.Id = 8;
        c9.name = "Suzie";
        c9.Id = 9;


        ArrayList<customer> cus = new ArrayList<>();
        cus.add(c1);
        cus.add(c2);
        cus.add(c3);
        cus.add(c4);
        cus.add(c5);
        cus.add(c6);
        cus.add(c7);
        cus.add(c8);
        cus.add(c9);

        ArrayList<customer>visits = new ArrayList<>();

        for(int i=0; i < 100; i++){
            Random rand = new Random();
            int pickCus = rand.nextInt(0,9);
            visits.add(cus.get(pickCus));
            }
        HashMap<customer,Integer> occur= new HashMap<>();
        for(customer i:visits){
            Integer j=occur.get(i);
            occur.put(i,(j == null)?1:j+1);
             }

        occur.forEach((key, value) -> System.out.println(key + " " + "visits" + " " + value));

        }
    }
