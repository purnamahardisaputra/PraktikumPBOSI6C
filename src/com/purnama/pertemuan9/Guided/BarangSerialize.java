/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan9.Guided;

/**
 *
 * @author purna
 */

import java.io.*;

public class BarangSerialize implements Serializable {
    private String nama;
    private int jumlahBrg;
    
    public BarangSerialize(String namaBarang, int jumlahBarang){
        nama = namaBarang;
        jumlahBrg = jumlahBarang;
    }
    
    public void tampilKan(){
        System.out.println("Data Ke212");
        System.out.println("Nama Barang : " + nama);
        System.out.println("Jumlah Barang : " + jumlahBrg);
    }
    
    public void simpanObject(BarangSerialize obj){
        try{
            FileOutputStream fOut = new FileOutputStream("DataBarang.txt");
            ObjectOutputStream OOS = new ObjectOutputStream(fOut);
            OOS.writeObject(obj);
            OOS.flush();
        }catch(IOException e){
            System.out.println("Error " + e);
        }
    }
    
    public void bacaObject(BarangSerialize obj){
        try{
            FileInputStream fIn = new FileInputStream("DataBarang.txt");
            ObjectInputStream OIS = new ObjectInputStream(fIn);
            while((obj = (BarangSerialize) OIS.readObject()) != null){
                obj.tampilKan();
            }
        }catch(IOException e){
            System.out.println("");
            System.exit(1);
        }catch(Exception e){
            System.out.println("Error " + e);
        }
    }
    
    public static void main(String[] args) {
        BarangSerialize brg = new BarangSerialize("Baju Kemeja Panjang", 20);
        brg.bacaObject(brg);
    }
}
