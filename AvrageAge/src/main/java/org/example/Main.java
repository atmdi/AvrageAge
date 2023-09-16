package org.example;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        Person[] p1=new Person[3];
        p1[0].name="ali";
        p1[0].age=15;
        p1[1].name="hasan";
        p1[1].age=20;
        p1[2].name="mohamad";
        p1[2].age=21;
        int sum=0;
        for (int i=0;i<3;i++){
           sum+= p1[i].age;
        }
        System.out.println(sum/3);
    }
}