/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan9.Guided;

import java.io.IOException;

/**
 *
 * @author purna
 */
public class DemoStream2 {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];
        int panjang = 0;
        
        System.out.print("Masukan Data: ");
        
        try{
            panjang = System.in.read(data);
            System.out.print("Yang anda ketik : ");
            System.out.write(data);
            System.out.println("");
            System.out.println("Panjang data karakter : " + panjang);
            System.out.print("Index 0 sampai 4 : ");
            System.out.write(data, 0, 4);
        }catch(IOException e){
            System.out.println("Terjadi Exception");
        }
    }
}
