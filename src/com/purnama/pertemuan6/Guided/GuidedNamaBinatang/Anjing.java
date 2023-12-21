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
public class Anjing extends Binatang {
    private String nama;
    
    Anjing(String nama){
        super("Anjing");
        this.nama = nama;
    }
    
    @Override
    public void suara(){
        System.out.println("Menggonggong");
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + nama;
    }
}
