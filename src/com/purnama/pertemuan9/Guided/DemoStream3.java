/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan9.Guided;

import java.io.*;

/**
 *
 * @author purna
 */
public class DemoStream3 {
    public static void main(String[] args) throws IOException {
        char data;
        String str = "";
        
        BufferedReader buffRead = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ketik : ");
        data = (char) buffRead.read();
        while(data!='\n'){
            str += data;
            data = (char) buffRead.read();
        }
        System.out.println("Yang anda ketikan : " + str);
        System.out.println("Program Telah Selesai");
    }
}
