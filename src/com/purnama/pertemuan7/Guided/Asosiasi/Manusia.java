/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan7.Guided.Asosiasi;

/**
 *
 * @author purna
 */
public class Manusia {
    private String nama;
    private int umur;
    private Manusia ibu;
    private Manusia anak;
    
    public Manusia(){
        // default konstruktor
    }
    
    public Manusia(String namanya, int umurnya){
        nama = namanya;
        umur = umurnya;
        ibu = new Manusia();
        anak = new Manusia();
        
        ibu = null;
        anak = null;
    }
    
    public Manusia(String namanya, int umurnya, Manusia ibuAngkat){
        nama = namanya;
        umur = umurnya;
        ibu = new Manusia();
        anak = new Manusia();
        ibuAngkat = this;
    }
    
    public void adopsi(Manusia anakAngkat){
        anak = anakAngkat;
        anakAngkat.ibu = this;
    }
    
    public void tampil(){
        System.out.println("===Data Pribadi===");
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        
        if(ibu != null){
            System.out.println("Nama Ibu : " + ibu.nama);
        }else if(anak != null){
            System.out.println("Nama Anak : " + anak.nama);
        }
    }
}
