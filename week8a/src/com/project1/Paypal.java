package com.project1;

public class Paypal implements Payment{
    @Override
    public void pay() {
        System.out.println("Paypal payment");

    }
}
