package com.project1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<customer> allCus= new ArrayList<customer>();
        ArrayList<employee> allEmp= new ArrayList<employee>();


        customer c1 = new customer();
        c1.Id= 98756;
        c1.name= "James Smith";
        c1.age= 27;
        c1.address= "Liberty street";
        c1.account_id= "12345";

        customer c2 = new customer();
        c2.Id= 4564654;
        c2.name= "Jim Harry";
        c2.age= 30;
        c2.address= "Main Street";
        c2.account_id= "5564";

        customer c3 = new customer();
        c3.Id= 66110;
        c3.name= "Jolie John";
        c3.age= 21;
        c3.address= "Liberty street";
        c3.account_id= "2315";

        customer c4 = new customer();
        c4.Id= 4561;
        c4.name= "Alex Hughes";
        c4.age= 45;
        c4.address= "CrossRoads street";
        c4.account_id= "2398";

        customer c5 = new customer();
        c5.Id= 21345;
        c5.name= "Mark";
        c5.age= 35;
        c5.address= "60 street";
        c5.account_id= "85231";

        employee e1 = new employee();
        e1.Id= 1152;
        e1.name="John Walter";
        e1.age=35;
        e1.address="Main ST";
        e1.position="Employee";
        e1.salary=5000;
        e1.cus_list.add(c1);
        e1.cus_list.add(c2);


        employee e2 = new employee();
        e2.Id= 1105;
        e2.name="Lily Hugh";
        e2.age=28;
        e2.address="Crossroads";
        e2.position="Employee";
        e2.salary=4500;
        e2.cus_list.add(c3);
        e2.cus_list.add(c4);

        employee e3 = new employee();
        e3.Id= 1089;
        e3.name="John Walter";
        e3.age=38;
        e3.address="MainLand";
        e3.position="Employee";
        e3.salary=5500;
        e3.cus_list.add(c5);

        employee e4 = new employee();
        e4.Id= 1152;
        e4.name="Alex Harper";
        e4.age=45;
        e4.address="Maryland";
        e4.position="Manager";
        e4.salary=10000;
        e4.emp_list.add(e1);
        e4.emp_list.add(e2);
        e4.emp_list.add(e3);

        allEmp.add(e1);
        allEmp.add(e2);
        allEmp.add(e3);
        allEmp.add(e4);

        allCus.add(c1);
        allCus.add(c2);
        allCus.add(c3);
        allCus.add(c4);
        allCus.add(c5);

        search(allEmp);

    }


        public static void search(ArrayList<employee>L){
            Scanner s = new Scanner(System.in);
            System.out.println("Type name:");
            String n = s.next();

            for(int i=0;i<L.size();i++){
                if(L.get(i).name.equalsIgnoreCase(n)){
                    System.out.println(customer.class);
                }
            }
        }

}
