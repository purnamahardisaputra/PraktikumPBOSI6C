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
public class Main {
    public static void main(String[] args) {
        Buku konstruktorBukuKosong = new Buku();
        Buku konstruktorAdaBuku = new Buku();
        Buku konstruktorAdaTahun = new Buku ();
        
        konstruktorBukuKosong = new Buku();
        konstruktorAdaBuku = new Buku("Buku IPS", "Tito Sutisno");
        konstruktorAdaTahun = new Buku("Buku IPS", "Tito Sutisno", 2000);
        
        
        System.out.println("Ini Konstruktor 3 parameter hanya ada judul, pengarang, tahun");
        konstruktorAdaTahun.cetakLayar();
        System.out.println("Ini Konstruktor parameter kosong/default parameter");
        konstruktorBukuKosong.cetakLayar();
        System.out.println("Ini Konstruktor 2 parameter hanya ada judul dan pengarang");
        konstruktorAdaBuku.cetakLayar();
    }
}
