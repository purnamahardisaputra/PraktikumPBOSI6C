/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan5.Guided.Guided1;

/**
 *
 * @author purna
 */
public class Buku {
    public String judul;
    public String pengarang;
    public long hargaBuku;
    
    public Buku(String judulnya, String pengarangnya, long hargaBukunya){
        this.judul = judulnya;
        this.pengarang = pengarangnya;
        this.hargaBuku = hargaBukunya;
    }
    
    public void cetakLayar(){
        System.out.println("Judul       : " + judul);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Harga Buku  : " + hargaBuku);
    }
}
