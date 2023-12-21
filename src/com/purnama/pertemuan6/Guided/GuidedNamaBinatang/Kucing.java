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
public class Kucing extends Binatang {
    private String nama;
    
    Kucing(String nama){
        super("Kucing");
        this.nama = nama;
    }
    
    @Override
    public void suara(){
        System.out.println("Meow Meow Meow");
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + nama;
    }
}
