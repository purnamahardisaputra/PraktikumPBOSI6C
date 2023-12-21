/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.Pertemuan2.Guided.guided1;

/**
 *
 * @author purna
 */
public class Buku {
    private String judul;
    private String pengarang;
    
    public Buku(){
        judul = "Buku anak";
        pengarang = "Ahmad S";
    }
    
    public Buku(String judul, String pengarang){
        System.out.println("Konstruktor sedang dijalankan....");
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    public Buku(String judul, String pengarang, int tahun){
        this.judul = judul;
        this.pengarang = pengarang;
        System.out.println("Tahun Terbit : " + tahun);
    }
    
    public void cetakLayar(){
        if(judul == null && pengarang==null){
            return;
        }
        System.out.println("Nama Buku : " + judul);
        System.out.println("Nama Pengarang : " + pengarang);
    }
}
