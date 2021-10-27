package com.project1;

public class VisaCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Visa card payment");

    }
}
