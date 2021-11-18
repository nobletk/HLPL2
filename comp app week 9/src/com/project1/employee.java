package com.project1;

import java.util.ArrayList;

public class employee extends person{
    int salary;
    String position;

    ArrayList<employee> emp_list = new ArrayList<employee>();
    ArrayList<customer> cus_list = new ArrayList<customer>();

    @Override
    public  String toString(){
       return "Name:"+ name + "\nID:"+ Id + " \nAge:" + age + "\nAddress:" + address
                +"\nSalary:"+ salary +
                "\nPosition:" + position +
                "\nCus_list:" + cus_list +
                "\nEmp_list" + emp_list;
    }
}
