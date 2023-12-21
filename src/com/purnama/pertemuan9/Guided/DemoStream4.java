/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan9.Guided;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author purna
 */
public class DemoStream4 {
    public static void main(String[] args) throws IOException {
        byte data;
        String namaFile = "file.txt";
        FileOutputStream fOut = null;
        try{
            fOut = new FileOutputStream(namaFile, true);
            System.out.print("Ketik : ");
            data = (byte) System.in.read();
            while(data != (byte) '\r'){
                fOut.write(data);
                data = (byte) System.in.read();
            }
        }catch(FileNotFoundException e){
            System.out.println("File : " + namaFile + " tidak "
                    + "dapat di create");
        }finally{
            if(fOut != null){
                try{
                    fOut.close();
                }catch(IOException e){
                    System.out.println("Terjadi Exception");
                }
            }
        }
        
    }
}
