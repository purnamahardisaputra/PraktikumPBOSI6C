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
public class Pegawai {
    private String nama;
    private String NIP;
    
    public Pegawai(){
        System.out.println("Konstruktor pegawai dijalankan");
    }
    
    public Pegawai(String namanya, String NIPnya){
        this.NIP = NIPnya;
        this.nama = namanya;
        System.out.println("Konstruktor Pegawai Dijalankan.....");
    }
    
    public void tampilData(){
        System.out.println("NIP : " + NIP + "Nama : " + nama);
    }
}
