/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan3.guided1;

/**
 *
 * @author purna
 */
public class Main {
    public static void main(String[] args) {
        Buku bukuSejarah = new Buku();
        
        bukuSejarah.setJudul("Homo Erektus");
        bukuSejarah.setPengarang("Darwin Nunez");
        bukuSejarah.setJumlahHalaman(500);
        bukuSejarah.setInfo(20f, 100000);
        bukuSejarah.setInfo(120000);
        
        bukuSejarah.cetakLayar();
        
        // PANGGIL MELALUI PUBLIK
        bukuSejarah.judul = "Pytecanthropus Erektus";
        bukuSejarah.pengarang = "Steven";
        bukuSejarah.jumlahHalaman = 421;
        bukuSejarah.diskon = 0.4f;
        bukuSejarah.harga = 120000;
        
        System.out.println("\nBuku Sejarah Ke 2");
        System.out.println("Judul Buku : " + bukuSejarah.judul);
        System.out.println("Pengarang Buku : " + bukuSejarah.pengarang);
        System.out.println("Jumlah Halaman : " + bukuSejarah.jumlahHalaman);
        System.out.println("Diskon Buku : " + bukuSejarah.diskon);
        System.out.println("Harga Buku : " + bukuSejarah.harga);
    }
}
