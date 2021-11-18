package com.project1;

import java.util.ArrayList;

public class employee extends person{
    int salary;
    String position;

    ArrayList<employee> emp_list = new ArrayList<employee>();
    ArrayList<customer> cus_list = new ArrayList<customer>();

    @Override
    public  String toString(){
        return "Name:"+ name + ", ID:"+ Id + " ,Age:" + age + ", Address:" + address +", Salary:"+ salary +
                ", Position:" + position + ", Cus_list:" + cus_list;
    }
}
