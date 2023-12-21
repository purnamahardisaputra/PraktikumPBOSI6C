/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan7.Guided.Asosiasi;

/**
 *
 * @author purna
 */
public class IbuAnak {
    public static void main(String[] args) {
        Manusia ibu1 = new Manusia("Rohim", 70);
        Manusia anak1 = new Manusia("Jono", 90);
        Manusia ibu2 = new Manusia("Wati", 33);
        Manusia anak2 = new Manusia("Adi", 20);
        
        System.out.println("=========================");
        ibu1.tampil();
        anak1.tampil();
        System.out.println("==========================");
        ibu1.adopsi(anak1);
        ibu1.tampil();
        System.out.println("==========================");
        ibu2.tampil();
        anak2.tampil();
    }
}
