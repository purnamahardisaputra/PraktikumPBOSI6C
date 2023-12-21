/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan4.guided.guided1;

/**
 *
 * @author purna
 */
public class Circle extends Point{
    private float radius;
    
    public Circle(float r, float a, float b){
        super(a, b);
        radius = r;
        System.out.println("Konstruktor Circle Dijalankan...");
    }
    
    public void cetakPoint(){
        super.cetakPoint();
        System.out.println("Radius : " + radius);
    }
       
}
