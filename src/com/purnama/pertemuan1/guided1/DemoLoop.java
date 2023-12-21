/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan1.guided1;

/**
 *
 * @author purna
 */
public class DemoLoop {
    public static void main(String[] args) {
        
        // for loop
        for(int i=1; i<=5; i++)
        {
            System.out.println("Ini Perulangan For / For Loop (" + i + "/5)");
        }
        
        System.out.println("");
        
        // while loop
        int j = 1;
        
        while(j<=5){
            System.out.println("Perulanga While / While Loop (" + j + "/5)");
            j++;
        }
        
        System.out.println("");
        
        // do while loop
        
        int k = 1;
        
        do{
            System.out.println("Do-While Loop (" + k + "/5)");
            k++;
        }while(k<=5);
        
        // Break
        
        int x = 0;
        while(x<99999){
            System.out.println( x + "/99999");
            x++;
            
            if(x == 201){
                System.out.println("Santay dulu gak sih!!");
                break;
            }
        }
    }
}
