package main;

import customclass.Rectangle2;
import customclass.Rectangle;

import java.util.Scanner;

public class Rectanglemain {
    public static void main(String[] args) {
        Rectangle2 obj = new Rectangle2();
        System.out.println("Length = " + obj.getLength());
        System.out.println("Width = " + obj.getWidth());

        Rectangle2 obj2 = new Rectangle2(10,20);
        System.out.println("Length = " + obj2.getLength());
        System.out.println("Width = " + obj2.getWidth());

        //initializing object from user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers : ");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        Rectangle2 obj3 = new Rectangle2(no1,no2);
        System.out.println("Length = " + obj3.getLength());
        System.out.println("Width = " + obj3.getWidth());

        /*
        //create an object of rectangle
        //import Rectangle class
        Rectangle2 obj = new Rectangle2(); //default constructor by Java

      System.out.println("Length = " + obj.length);
        System.out.println("Width = " + obj.width);
        //changing values
        obj.length = 10;
        obj.width = 20;
        System.out.println("Length = " + obj.length);
        System.out.println("Width = " + obj.width);
        //call method
        System.out.println("Area = " + obj.Area());
        System.out.println("Perimeter = " + obj.Perimeter());

        System.out.println("Length = " + obj.getLength());
        System.out.println("Width = " + obj.getWidth());
        //updating length and width
        obj.setLength(10);
        obj.setWidth(15);
        System.out.println("Length = " + obj.getLength());
        System.out.println("Width = " + obj.getWidth());
    */
    }
}
