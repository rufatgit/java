/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab_2_exercises;

import java.util.*;

/**
 *
 * @author rufat
 */
public class Lab_2_exercises {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter 2 integers");
//        float a=scanner.nextFloat();
//        float b=scanner.nextFloat();
//        System.out.println("Addition: "+(a+b));
//        System.out.println("Subtraction: "+(a-b));
//        System.out.println("Multiplication: "+(a*b));
//        System.out.println("Division: "+(a/b));
//        
        //2
//            for (int i = 0; i < 5; i++) {
//                for (int j = 0; j < i+1; j++) {
//                    System.out.print("*");
//                }
//                System.out.println("");
//        }
//            
        //3
//        System.out.println("Enter coefficients of quadratic equation in same order respectively - a,b,c : ");
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        double c = scanner.nextDouble();
//
//        double d = b * b - 4 * a * c;
//
//        if (d > 0) {
//            System.out.println("The quadratic equation has two distinct real roots");
//            double root1 = (-b + Math.sqrt(d)) / (2 * a);
//            double root2 = (-b - Math.sqrt(d)) / (2 * a);
//            System.out.println("Root 1: " + root1);
//            System.out.println("Root 2: " + root2);
//
//        }
//        else if(d==0)
//        {
//            double root=-b/2*a;
//            System.out.println("It has 1 real root: "+root);
//        }
//        else
//        {
//            System.out.println("The quadratic equation does not have real roots.");
//        }
        //4
//            Random random=new Random();
//            System.out.println("Input limit of the random numbers can be generated: ");
//            int r=scanner.nextInt();
//            while(true)
//            {
//                int ran=random.nextInt(r+1);
//                if (ran==0) {
//                    System.out.println(ran);
//                    break;
//                }
//                System.out.println(ran);
//            }
//            
        //5
//        System.out.println("1. Option 1");
//        System.out.println("2 . Option 2");
//        System.out.println("3. Option 3");
//        System.out.println("The end");
//        System.out.println("Choose: ");
//        int input = scanner.nextInt();
//        if (input == 1) {
//            System.out.println("You have chosen Option 1");
//        } else if (input == 2) {
//            System.out.println("You have chosen Option 2");
//
//        } else if (input == 3) {
//            System.out.println("You have chosen Option 3");
//
//        } else {
//            System.out.println("You choosed the end !!!");
//        }
//
//        


            //6
           
         Random random=new Random();
         int[] array=new int[5];
        
         for (int i = 0; i < 5; i++) {
            array[i]=random.nextInt(1000);
        }
         System.out.println("");
         for(int a : array)
         {
             System.out.print(a+" ");
         }
 
           new Me().Message("rufat");
    }
    
    public static class Me{
        public void Message(String mess)
        {
            System.out.println("Message: "+mess);
        }
    }
    
}
