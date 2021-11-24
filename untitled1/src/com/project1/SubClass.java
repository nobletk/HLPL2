package com.project1;

public class SubClass extends SupClass{
   // @MyNewAnnotation(name = "Tarek",id=1)
    public int x;

    @Override
    @MyNewAnnotation(name = "Ali",id=12)
   public void printMyMessage(){
        System.out.println("Hi this is subclass");
    }
}
