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
public class Paket extends Buku implements InterfaceCD{
    long hargaPaket;
    InterfaceCD iniInterfaceCD;
    
    public Paket(String judul, String pengarang, long hargaBuku, String ukuran, long hargaCD){
        super(judul, pengarang, hargaBuku);
        iniInterfaceCD = new ChildCD(ukuran, hargaCD);
    }
    
    public void hitungHargaPaket(){
        hargaPaket = super.hargaBuku + getHargaCD();
    }
    
    public void cetakCD(){
        iniInterfaceCD.cetakCD();
    }
    
    public long getHargaCD(){
        return iniInterfaceCD.getHargaCD();
    }
    
    public void cetakPaket(){
        super.cetakLayar();
        cetakCD();
        System.out.println("Harga Paket Buku dan CD : Rp." + hargaPaket);
    }
}
