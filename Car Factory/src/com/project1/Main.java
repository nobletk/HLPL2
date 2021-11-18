package com.project1;

public class Main {

    public static void main(String[] args) {
	C1 c1= new C1();
        c1.modelName="C1";
        c1.engineSize="123";
        c1.color="Black";
        c1.wheel="4";
        c1.ABS="yes";

        C2 c2= new C2();
        c2.modelName="C2";
        c2.engineSize="345";
        c2.color="Silver";
        c2.GPS="Yes";
        c2.leatherSeat="Yes";


        Scanner MyIK=new Scanner(System.in);
        System.out.println("Ik model:");
        String n= MyIK.nextLine();


        if(n.equalsIgnoreCase(c1.modelName)) {
            c1.Display();
        }
        if(n.equalsIgnoreCase(c2.modelName)) {
            c2.Display();
        }
    }
}
