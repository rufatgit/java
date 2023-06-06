/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pattern;

/**
 *
 * @author rufat
 */
public class OneLinePattern extends abstract_Pattern{
    private char A;
    private char B;
    private String Hi;
    public OneLinePattern()
    {
        Hi="Hellooo";
    }
    
    public OneLinePattern(char a)
    {
        A=a;
    }
    public OneLinePattern(char a, char b)
    {
        A=a;
        B=b;
    }
    
    @Override
    public String printPattern()
    {
            return "A: "+A+"B: "+B+"MEssage: "+Hi;
    }
    
}
