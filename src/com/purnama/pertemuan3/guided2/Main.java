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
public class Main {
    public static void main(String[] args) {
        int x, y;
        Bilangan bil = new Bilangan(10, 20);

        x = 15;
        y = 30;
        
        System.out.println("Nilai x, y sebelum passed by value");
        System.out.println("Nilai X : " + x);
        System.out.println("Nilai Y : " + y);
        
        bil.operasi_pass_by_value(x, 20);
        
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
