/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.pdf5_ex2_interface_figure;

/**
 *
 * @author rufat
 */
public class Pdf5_ex2_interface_Figure {

    public static void main(String[] args) {
        IFigure c = new Circle(10);
        System.out.println("Area Circle: " + c.get_area());
        System.out.println("Perimeter Circle: " + c.get_perimeter());

        IFigure p = new Parallelogram(4, 5, 2);
        System.out.println("Area of Parallelogram: " + p.get_area());
        System.out.println("Perimeter of Parallelogram: " + p.get_perimeter());

        IFigure r = new Rectangle(4, 5);
        System.out.println("Area of Rectangle: " + r.get_area());
        System.out.println("Perimeter of Rectangle: " + r.get_perimeter());

        IFigure s = new Square(4);
        System.out.println("Area of Square: " + s.get_area());
        System.out.println("Perimeter of Rectangle: " + s.get_perimeter());

        IFigure t=new Triangle(3,4,5,2);
        System.out.println("Area of Triangle: " +t.get_area() );
        System.out.println("Perimeter of Triangle: " +t.get_perimeter() );

        IFigure e=new Equilateral(5,2);
        System.out.println("Area of Equilateral: " +e.get_area() );
        System.out.println("Perimeter of Equilateral: " +e.get_perimeter()  );

    }
}
