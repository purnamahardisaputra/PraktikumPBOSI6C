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
public class TryCatch2 {
    public static void main(String[] args) {
        try{
            int x = args.length; // 0
            int y = 100/x;
            int[] arr = {10, 11};
            System.out.println("Tidak Terjadi Exception");
        }catch(ArithmeticException e){ // catch apabila angka penjumlahan, (pembagian), pengurangan error
            System.out.println("Terjadi Exception karena "
                    + "pembagian dengan angka nol");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi exception karena "
                    + "indeks diluar kapasitas array");
        }
        System.out.println("Batas akhir program setelah blok try catch");
    }
}
