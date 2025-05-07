package com.digit.logical;

import java.util.ArrayList;

interface Functional{
    int operation(int a,int b);
}
class LambdaCheck {

    public static void main(String[] args){

        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

        //Simple print
        System.out.println(al);

        //Using lambda expression all the elements in the array
        System.out.println("Print all the elements in the array through lambda expression");
        //al.forEach(n-> System.out.println(n));//Lambda
        al.forEach(System.out::println);//Through method reference

        System.out.println("Filter out the even number through lambda & the numbers are as below ");
        al.forEach(n->{
            if(n%2==0)
                System.out.println(n);

        });

        Functional add=(a,b)->a+b;
        Functional mul=(a,b)->a*b;

        System.out.println("addition and multiplication as below ");
        System.out.println(add.operation(2,3));
        System.out.println(mul.operation(5,6));



    }
}
