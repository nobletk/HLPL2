package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        customer c1 = new customer();
        customer c2 = new customer();
        customer c3 = new customer();
        customer c4 = new customer();
        customer c5 = new customer();
        customer c6 = new customer();
        customer c7 = new customer();
        customer c8 = new customer();
        customer c9 = new customer();

        c1.name="Mike"; c1.Id="123";
        c2.name="Alex"; c2.Id="234";
        c3.name="Paul"; c3.Id="556";
        c4.name="Jim"; c4.Id="662";
        c5.name="Tim"; c5.Id="138";
        c6.name="Derek"; c6.Id="809";
        c7.name="Raul"; c7.Id="778";
        c8.name="Mick"; c8.Id="156";
        c9.name="Suzie"; c9.Id="398";

        ArrayList<customer> L= new ArrayList<customer>();


        L.add(c1);
        L.add(c2);
        L.add(c3);
        L.add(c4);
        L.add(c5);
        L.add(c6);
        L.add(c7);
        L.add(c8);
        L.add(c9);

        Queue(L);

    }
    public static void Queue(ArrayList<customer>L){
        Random visits= new Random();

//        for(int i=0;i<L.size();i++)
//            System.out.println(L.get(i));

    }
}
