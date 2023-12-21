/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan6.Guided.GuidedNamaBinatang;

/**
 *
 * @author purna
 */
public class Burung extends Binatang {
    private String nama;
    
    Burung(String nama){
        super("Burung");
        this.nama = nama;
    }
    
    @Override
    public void suara(){
        System.out.println("Cukurukuk");
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + nama;
    }
}
