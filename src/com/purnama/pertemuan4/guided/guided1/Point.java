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
public class Point {
    protected float x, y;
    
    public Point(float a, float b){
        this.x = a;
        this.y = b;
    }
    
    public void cetakPoint(){
        System.out.println("Point : [" + "x:"+ x + "y:" + y + "]");
    }
}
