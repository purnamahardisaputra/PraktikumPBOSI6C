/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan7.Guided.Agregasi;

/**
 *
 * @author purna
 */
public class Perusahaan {
    private String namaPerusahaan;
    private Pegawai peg[];
    private int counter;
    
    public Perusahaan(String namaPerusahaannya){
        this.namaPerusahaan = namaPerusahaannya;
        counter = 0;
        peg = new Pegawai[3];
        System.out.println("Konstruktor Perusahaan Dijalankan");
    }
    
    public void insertPegawai(Pegawai p){
        peg[counter] = p;
        counter++;
    }
    
    public void tampilPerusahaan(){
        System.out.println("Perusahaan : " + namaPerusahaan + " memiliki Pegawai : " );
        System.out.println(counter);
        for(int i = 0; i<counter; i++){
            peg[i].tampilData();
        }
    }
}
