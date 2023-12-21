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
public class Direktur extends Pegawai{
    private double gajiDirektur;
    private double dividenSaham;
    
    public Direktur(double gajiDirektur, double dividenSaham, String nama){
        super(nama);
        this.gajiDirektur = gajiDirektur;
        this.dividenSaham = dividenSaham;
    }
    
    public void setDividen(double dividen){
        if(dividen>0){
            dividenSaham = dividen;
        }
        else{
            dividenSaham = 0;
        }
    }
    
    public void setGaji(double gaji){
        if(gaji > 0){
            gajiDirektur = gaji;
        }
        else{
            gajiDirektur = 0;
        }
    }
    
    public String nama(){
        return super.namaPegawai();
    }
    
    public String jabatan(){
        return ("Direktur");
    }
    
    public double gajiPerbulan(){
        return gajiDirektur;
    }
    
    public double labaDividen(){
        return dividenSaham;
    }
    
    @Override
    public double income(){
        return(gajiDirektur+dividenSaham);
    }
}
