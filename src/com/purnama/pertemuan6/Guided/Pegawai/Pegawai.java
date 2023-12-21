/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan6.Guided.Pegawai;

/**
 *
 * @author purna
 */
public abstract class Pegawai {
    private String namaPegawainya;
    
    public Pegawai(String nama){
        this.namaPegawainya = nama;
    }
    
    public String namaPegawai(){
        return namaPegawainya;
    }
    
    public abstract double income();
}
