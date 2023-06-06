/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pdf5_ex2_interface_figure;

/**
 *
 * @author rufat
 */
public class Circle implements IFigure
{
    private float R;
    private final float pi=3.14f;
    
    public Circle(float r)
    {
        R=r;
    }
    
    @Override
    public float get_area()
    {
        return (float)(3.14*R*R);
    }
    
    @Override
    public float get_perimeter()
    {
        return (float)(2*3.14*R);
    }
}
