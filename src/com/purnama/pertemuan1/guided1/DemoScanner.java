/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan1.guided1;

import java.util.Scanner;

/**
 *
 * @author purna
 */
public class DemoScanner {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.println("<=== EDIT PROFILE ===>");
        System.out.println("\n");
        
        System.out.print("Masukan Nama : ");
        String nama = masukan.nextLine();
        
        System.out.print("Masukan Inisial : ");
        char inisial = masukan.nextLine().charAt(0);
        
        System.out.print("Masukan Usia : ");
        int usia = masukan.nextInt();
        
        System.out.print("Masukan Tinggi Badan : ");
        float tinggi = masukan.nextFloat();
        
        System.out.println("");
        
        System.out.println("<=== PROFILE SAYA ===>");
        System.out.println("");
        System.out.println("Nama : " + nama);
        System.out.println("Inisial: " + inisial);
        System.out.println("Usia : " + usia);
        System.out.println("Tinggi Badan : " + tinggi + " cm");
        
    }
}
