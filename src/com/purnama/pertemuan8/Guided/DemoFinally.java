/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan8.Guided;

/**
 *
 * @author purna
 */
public class DemoFinally {
    public static void main(String[] args) {
        int x = 3;
        int[] array = {10, 11, 12, 13};
        
        try{ 
            // jalankan fungsi try dahulu
            System.out.println(array[x]);
            System.out.println("Tidak Terjadi Exception");
        }catch(ArrayIndexOutOfBoundsException e){
            // jalankan fungsi catch sebagai penangkap error
            // yang terjadi apabila fungsi try terdapat error
            System.out.println("Terjadi Exception");
            System.out.println(array[x-2]);
        }finally{
            // jalankan fungsi finally apabila catch 
            // sudah selesai dijalankan
            System.out.println("Program Selesai");
        }
    }
}
