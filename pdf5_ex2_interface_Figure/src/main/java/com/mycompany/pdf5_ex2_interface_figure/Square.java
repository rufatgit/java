/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pdf5_ex2_interface_figure;

/**
 *
 * @author rufat
 */
public class Square extends Rectangle {
    
    public Square(float side)
    {
        super(side,side);
    }
    
    @Override
    public float get_area()
    {
        return Side*Side;
    }
    
    @Override
    public float get_perimeter()
    {
        return 4*Side;
    }
}
