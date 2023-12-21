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
public class CD {
    String ukuran;
    long hargaCD;
    
    public CD(String ukurannya, long hargaCDnya){
        this.ukuran = ukurannya;
        this.hargaCD = hargaCDnya;
    }
    
    public long getHargaCD(){
        return hargaCD;
    }
    
    public void cetakCD(){
        System.out.println("Ukuran CD   : " + ukuran);
        System.out.println("Harga CD    : " + hargaCD);
        System.out.println();
    }
}
