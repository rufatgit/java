/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pdf5_ex2_interface_figure;

/**
 *
 * @author rufat
 */
public class Triangle implements IFigure{
    public float Base;
    public float Side1;
    public float Side2;
    public float Height;
    public Triangle(float base, float side1, float side2, float height)
    {
        Base=base;
        Side1=side1;
        Side2=side2;
        Height=height;
    }
    
    @Override
    public float get_area()
    {
        return (Height*Base)/2;
    }
    
    @Override
    public float get_perimeter()
    {
        return Base+Side1+Side2;
    }
    
}
