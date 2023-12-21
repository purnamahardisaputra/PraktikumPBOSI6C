/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan6.Guided.Pegawai;
import java.text.DecimalFormat;

/**
 *
 * @author purna
 */
public class Main {
    public static void main(String[] args) {
        Pegawai pegawai;
        
        Direktur direktur = new Direktur(12000000.00, 7500000.00, "Joko Sembodo");
        DecimalFormat digitGajiPresisi = new DecimalFormat("0.00");
        
        pegawai = direktur;
        
        System.out.println("Demo Inheritance, Enkapulasi, Polimorfisme");
        System.out.println("===========================================");
        System.out.println("Nama    : " + direktur.nama());
        System.out.println("Jabatan : " + direktur.jabatan());
        System.out.println("Gaji    : " + digitGajiPresisi.format(direktur.gajiPerbulan()) );
        System.out.println("Dividen : " + digitGajiPresisi.format(direktur.labaDividen()) );
        System.out.println("Total   : " + digitGajiPresisi.format(direktur.income()) );
    }
}
