/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pd5_ex1_pattern;

/**
 *
 * @author rufat
 */
public class Pd5_ex1_pattern {

    public static class OneLinePattern extends A_Pattern {

        @Override
        String printPattern() {
            return "Pattern: 1 Line";
        }
    }

    public static class TwoLinePattern extends A_Pattern {

        @Override
        String printPattern() {
            return "Pattern: 2 Line";
        }
    }

    public static class ThreeLinePattern extends A_Pattern {

        @Override
        String printPattern() {
            return "PAttern: 3 Line";
        }
    }

    public static void main(String[] args) {
        A_Pattern p = new OneLinePattern();
        System.out.println(p.printPattern());
A_Pattern p2=new TwoLinePattern();
        System.out.println(p2.printPattern());
    }
}
