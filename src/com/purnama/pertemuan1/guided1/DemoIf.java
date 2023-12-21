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
public class DemoIf {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        System.out.print("Masukan Bilangan : ");
        int bil = masukan.nextInt();
        
        if(bil > 0){
            System.out.println(bil + " Adalah bilangan positif");
        }else if(bil < 0){
            System.out.println(bil + " Adalah bilangan negatif");
        }else{
            System.out.println(bil + " Adalah 0!!!");
        }
        
    }
}
