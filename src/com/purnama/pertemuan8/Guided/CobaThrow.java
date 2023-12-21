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
public class CobaThrow {
    public static void main(String[] args) {
        try{
            methodLainnya();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Penanganan Exception dalam Method Main");
        }
    }
    
    public static void methodLainnya(){
        try{
            throw new ArrayIndexOutOfBoundsException(1);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Penanganan Exception dalam Method Lainnya");
            throw e;
        }
    }
}
