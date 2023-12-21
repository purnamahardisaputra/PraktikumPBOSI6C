/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan6.Guided.EkspresiWajah;

/**
 *
 * @author purna
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Demo Polimorfisme");
        System.out.println("==================");
        
        EkspresiWajah objEkspresi = new EkspresiWajah();
        Gembira objEkspresiGembira = new Gembira();
        Sedih objEkspresiSedih = new Sedih();
        
        EkspresiWajah[] ekspresi = new EkspresiWajah[3];
        ekspresi[0] = objEkspresi;
        ekspresi[1] = objEkspresiGembira;
        ekspresi[2] = objEkspresiSedih;
        
        System.out.println("Ekspresi[0] " + ekspresi[0].Respon());
        System.out.println("Ekspresi[1] " + ekspresi[1].Respon());
        System.out.println("Ekspresi[2] " + ekspresi[2].Respon());
    }
}
