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

public class BarangEx implements Externalizable{
    private int jumlahBarang;
    private String nama;
    
    public BarangEx(){
        // constructor kosong
    }
    
    public BarangEx(String namaBarang, int jmlhBarang){
        nama = namaBarang;
        jumlahBarang = jmlhBarang;
    }
    
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(nama);
        out.writeInt(jumlahBarang);
    }
    
    @Override
    public void readExternal (ObjectInput in) throws IOException, ClassNotFoundException {
        this.nama = (String) in.readObject();
        this.jumlahBarang = in.readInt();
    }
    
    @Override
    public String toString(){
        return "Data Barang :  " + nama + "\n" + "Jumlah Barang : " + jumlahBarang;
    }
    
    public static void simpanObject(BarangEx brg) throws IOException{
        FileOutputStream fOut = new FileOutputStream("DataExternalizable.txt");
        ObjectOutputStream oOs = new ObjectOutputStream(fOut);
        oOs.writeObject(brg);
        oOs.flush();
    }
    
    public static BarangEx bacaObject() throws ClassNotFoundException, IOException{
        FileInputStream fis = new FileInputStream("DataExternalizable.txt");
        ObjectInputStream oIs = new ObjectInputStream(fis);
        return (BarangEx) oIs.readObject();
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BarangEx barang = new BarangEx("Sepatu Super", 2);
        simpanObject(barang);
        System.out.println(bacaObject());
    }
}
