package com.project1;

public class BankCard implements Payment{


    @Override
    public void pay() {
        System.out.println("Bank card payment");
    }
}
