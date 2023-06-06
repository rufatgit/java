/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pdf5_ex2_interface_figure;

/**
 *
 * @author rufat
 */
public class Parallelogram implements IFigure{
    public float Base;
    public float Side;
    public float Height;
    
    
    public Parallelogram(float base, float side, float height)
    {
        Base=base;
        Side=side;
        Height=height;
    }
    
    @Override
    public float get_area()
    {
        return Base*Height;
    }
    
    @Override
    public float get_perimeter()
    {
        return 2*(Base+Side);
    }
    
    
    
}
