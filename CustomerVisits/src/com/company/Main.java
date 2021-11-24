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
	
	ArrayList cus = new ArrayList();
        Random rand = new Random();
        for(int i=0; i < 20; i++){
            cus.add(rand.nextInt(1,10));
        
    	}
    }
}
