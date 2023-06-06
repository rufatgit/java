/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pattern;

/**
 *
 * @author rufat
 */
public class Two extends abstract_Pattern{
    private char C;
    String a;
    public Two()
    {
        a="jajaj";
    }
    
    public Two(char c)
    {
        C=c;
    }
    
    @Override
    public String printPattern()
    {
        return "Hello: "+C;
    }
    
}
