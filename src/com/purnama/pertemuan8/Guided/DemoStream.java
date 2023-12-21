/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan8.Guided;

import java.io.IOException;

/**
 *
 * @author purna
 */
public class DemoStream {
    public static void main(String[] args) {
        byte[] data = new byte[10];
        System.out.print("Masukan Data : ");
        try{
            System.in.read(data);
        }catch(IOException exception){
            System.out.println("Terjadi Exception");
        }
        System.out.println("Yang Anda Ketikan : ");
        for(int i = 0; i < data.length; i++){
            System.out.println((char) data[i]);
            // char diatas dalah casting, casting yaitu 
            // digunakan untuk mengubah format array menjadi char
        }
    }
}


