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
public abstract class Binatang {
    public String jenis;
    
    Binatang(String jenis){
        this.jenis = jenis;
    }
    
    // abstract class kosong
    protected abstract void suara();
    
    public String toString(){
        return "Seekor " + jenis;
    }
}
