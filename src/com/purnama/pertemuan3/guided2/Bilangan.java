/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan3.guided2;

/**
 *
 * @author purna
 */
public class Bilangan {
    private int k;
    private int b;
    
    public Bilangan(int k, int b){
        this.k = k;
        this.b = b;
    }
    
    public void tampilLayar(){
        System.out.println("Nilai Bilangan K : " + k);
        System.out.println("Nilai Bilangan B : " + b);
    }
    
    // passed by value dengan parameter tipe data primitf
    public void operasi_pass_by_value(int x, int y){
        x *= 10;
        y += 10;
    }
    
    // passed by reference dengan parameter tipe data class
    public void operasi_pass_by_reference(Bilangan bil){
        bil.k = bil.k * 10;
        bil.b = bil.b + 15;
    }
    
    public static void main(String[] args) {
        int x, y;
        Bilangan bil = new Bilangan(10, 20);

        x = 15;
        y = 30;
        
        System.out.println("Nilai x, y sebelum passed by value");
        System.out.println("Nilai X : " + x);
        System.out.println("Nilai Y : " + y);
        
        bil.operasi_pass_by_value(x, y);
        
        System.out.println("Nilai x, y sesudah passed by value");
        System.out.println("Nilai X : " + x);
        System.out.println("Nilai Y : " + y);
        
        System.out.println("Nilai bil.k dan bil.b sebelum passed by reference");
        bil.tampilLayar();
        
        bil.operasi_pass_by_reference(bil);
        
        System.out.println("bil.k dan bil.b sesudah passed by reference");
        bil.tampilLayar();
    }
}
