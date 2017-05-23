package com.elementarial.helpers;

import java.util.LinkedList;

/**
 * Created by alvarohernandez on 5/22/17.
 */
public class FizzBuzz {

    public void fizzBuzzA(){
        for (int i = 1; i <= 100; i++) {
            if(i%3==0 || i%5==0){
                if(i%3==0){
                    System.out.print("Fizz");
                }
                if(i%5==0){
                    System.out.print("Buzz");
                }
                System.out.println();
            }else{
                System.out.println(i);
            }
        }
    }


    public void fizzBuzzB(){
        for (int i = 1; i <= 100; i++) {
            StringBuilder toPrint = new StringBuilder();
            if(i%3==0)
                toPrint.append("Fizz");
            if(i%5==0)
                toPrint.append("Buzz");

            if(toPrint.length()==0)
                System.out.println(i);
            else
                System.out.println(toPrint);
        }
    }

    public void fizzBuzzC(){
        for (int i = 1; i <= 100; i++) {
            if(i%15==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }



}
