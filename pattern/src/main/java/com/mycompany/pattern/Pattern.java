/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pattern;

/**
 *
 * @author rufat
 */
public class Pattern {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        OneLinePattern one=new OneLinePattern('F','R');
        System.out.println(one.printPattern());
        
        Two twoo=new Two('B');
        System.out.println("Mess: "+twoo.printblow("Bobobobo") );
    }
}
