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
public class Buku {
    
    public String judul;
    public String pengarang;
    public int jumlahHalaman;
    public float diskon;
    public double harga;

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public float getDiskon() {
        return diskon;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
    public void setInfo(float dskon, double hargaBuku){
        this.diskon = dskon;
        this.harga = hargaBuku - (hargaBuku * this.diskon);
    }
    
    public void setInfo(double hargaBuku){
        this.diskon = 0.01f;
        this.harga = hargaBuku - (hargaBuku * this.diskon);
    }
    
    public void cetakLayar(){
        System.out.println("Judul Buku : " + getJudul());
        System.out.println("Pengarang Buku : " + getPengarang());
        System.out.println("Jumlah Halaman Buku : " + getJumlahHalaman());
        System.out.println("Diskon Buku : " + getDiskon());
        System.out.println("Harga Buku : " + getHarga());
    }
    
}
