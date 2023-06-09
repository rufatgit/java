/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab3_pdf_exercises;

import java.util.*;

/**
 *
 * @author rufat

Exercise 1. Create a class Rectangle, which maintains the data about the
rectangle (height, width) and the methods returning the area and
perimeter. Write also the appropriate constructors. Test the class by
creating some objects, anonymous objects and invoke the methods.

Exercise 2. Create a class Pattern, so that it is possible to execute the
following code:
Pattern p1 = new Pattern();
Pattern p2 = new Pattern(’o’,’$’,5);
System.out.println(p1.giveDescription());
p1.print();
System.out.println(p2.giveDescription());
p2.print();
p1.changeData(’-’,’+’,7);
p1.print();
The result should be as follows:
Pattern: 1 x (?,?).
??
Pattern: 5 x (o,$).
o$o$o$o$o$
-+-+-+-+-+-+-+
* 
*/


public class Lab3_pdf_exercises {

    public static class Rect {

        private float Height;
        private float Width;

        public Rect() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("HEight: ");
            Height = scanner.nextFloat();
            System.out.println("Width: ");
            Width = scanner.nextFloat();

        }

        public Rect(float height, float width) {
            Height = height;
            Width = width;

        }

        public float Perimeter() {
            float perimt = 2 * (Height + Width);

            return perimt;
        }

        public float Area() {
            float area = Height * Width;
            return area;
        }

    }

    public static class Pattern {
        private char C1;
        private char C2;
        private int Rep;
        
        public Pattern() {
            C1='?';
            C2='?';
            Rep=1;
        }
        
        public Pattern(char c1, char c2, int rep)
        {
            C1=c1;
            C2=c2;
            Rep=rep;
        }
        
        public void change_data(char c1, char c2, int rep)
        {
            C1=c1;
            C2=c2;
            Rep=rep;
        }
        
        public void give_description()
        {
            System.out.println("Pattern: "+Rep+ " x "+"("+C1+","+C2+").");
        }
        
        public void print()
        {
            for (int i = 0; i < Rep; i++) {
                System.out.print(C1+""+C2);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //1
//        System.out.println("Hello World!");
//        Scanner scanner = new Scanner(System.in);
//
//        Rect mine = new Rect();
////        mine.Height=scanner.nextFloat();
////        mine.Width=scanner.nextFloat();
//        System.out.println("Perimeter: " + mine.Perimeter());
//        System.out.println("Area: " + mine.Area());
//        System.out.println("Area:: "+new Rect().Area());

        //2
        
        Pattern p1=new Pattern();
        p1.give_description();
        p1.print();
        p1.change_data('o', '#', 5);
        p1.print();
        Pattern p2=new Pattern('o', '$', 5);
        p2.print();
    }
}
