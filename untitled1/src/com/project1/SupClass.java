package com.project1;

import java.util.ArrayList;
import java.util.List;

public class SupClass {
    public void printMyMessage(){
        System.out.println("Hi this is supclass");
    }
    @Deprecated
    public void dosomthing(){
        System.out.println("I do some work");
    }

    private List versions = new ArrayList();
    @SuppressWarnings("unchecked")
    public void addVersion(String version){
        versions.add(version);
    }
}
