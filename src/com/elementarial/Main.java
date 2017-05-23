package com.elementarial;

import com.elementarial.helpers.Drawer;
import com.elementarial.helpers.Factorizer;
import com.elementarial.helpers.FizzBuzz;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        try{
            n = Integer.parseInt(args[0]);
        }catch (Exception e){
            System.out.println("Invalid argument, please give an integer");
            return;
        }

        Drawer drawer = new Drawer();
        Factorizer factorizer = new Factorizer();
        FizzBuzz fizzBuzz = new FizzBuzz();


        System.out.println("Drawing Asterisk");
        drawer.printAsterisk();
        System.out.println();

        System.out.println("Drawing Horizontal Line");
        drawer.drawHorizontalAsterisksLine(n);
        System.out.println();

        System.out.println("Drawing Vertical Line");
        drawer.drawVerticalAsterisksLine(n);
        System.out.println();

        System.out.println("Drawing Right Triangle");
        drawer.drawRightTriangle(n);
        System.out.println();

        System.out.println("Drawing Isosceles Triangle");
        drawer.drawIsoscelesTriangle(n);
        System.out.println();

        System.out.println("Drawing Diamond");
        drawer.drawDiamond(n,null);
        System.out.println();

        System.out.println("Drawing Diamond With Name");
        drawer.drawDiamond(n,"Álvaro");
        System.out.println();

        System.out.println("Printing FizzBuzz");
        fizzBuzz.fizzBuzzA();
        System.out.println();

        System.out.println("Printing Factors");
        LinkedList<Integer> factorsList = factorizer.factors(n);
        System.out.println(factorsList);


    }
}
