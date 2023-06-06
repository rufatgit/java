/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pdf5_ex2_interface_figure;

/**
 *
 * @author rufat
 */
public class Rectangle extends Parallelogram {

    
    public Rectangle(float base, float side) {
        super(base, side, base);
    }

    @Override
    public float get_area() {
        return Base*Side;
    }

    @Override
    public float get_perimeter()
    {
        return 2*(Base+Side);
    }
    
    
    
    
}
