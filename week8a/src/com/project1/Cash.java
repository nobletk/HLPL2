package com.project1;

public class Cash implements Payment{
    @Override
    public void pay() {
        System.out.println("Cash payment");

    }
}
