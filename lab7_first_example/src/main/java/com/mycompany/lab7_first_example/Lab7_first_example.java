/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab7_first_example;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author rufat
 */
public class Lab7_first_example extends JFrame {

    Lab7_first_example()
    {
        init();
    }
    
    private void init()
    {
        setTitle("My Frame");
        setSize(400,300);
        JLabel label1=new JLabel();
        add(label1);
        label1.setBounds(30,10,250,100);
        
        label1.setText("The 1st label: MY Frame");
        JLabel label2=new JLabel("2nd Label");
        add(label2);
        label2.setBounds(30,50,250,100);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
    }
    

    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Lab7_first_example rufat=new Lab7_first_example();
        new Lab7_first_example();
        
        
        
        
    }
}
