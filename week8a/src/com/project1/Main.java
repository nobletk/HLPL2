package com.project1;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cash cash_payment=new Cash();
        Paypal Paypal_payment= new Paypal();
        BankCard bankcard_payment=new BankCard();
        VisaCard visacard_payment= new VisaCard();

        DoPayment(cash_payment);
        DoPayment(Paypal_payment);
        DoPayment(bankcard_payment);
        DoPayment(visacard_payment);
    }

    public static void DoPayment(Payment p){
        p.pay();
    }
}
