/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan4.guided.Guided2;

/**
 *
 * @author purna
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Duck bebek = new Duck();
        Adi adi = new Adi();
        Babayo babayo = new Babayo();
        Horse kudalumping = new Horse();
        Owl brgHantu = new Owl();
        
        System.out.println("Suara Pertama kita dengar suara dog");
        dog.speak();
        System.out.println("");
        System.out.println("Suara Kedua kita dengar suara bebek");
        bebek.speak();
        System.out.println("");
        System.out.println("Suara Ketiga kita dengar suara adi");
        adi.speak();
        System.out.println("");
        System.out.println("Suara Keempat kita dengar suara Babayo");
        babayo.speak();
        System.out.println("");
        System.out.println("Suara Kelima kita dengar suara Kuda Lumping");
        kudalumping.speak();
        System.out.println("");
        System.out.println("Suara Keenam kita dengar suara Burung Hantu");
        brgHantu.speak();
        System.out.println("");
        
        System.out.println("Suara Tidur Masing-Masing Mamalia");
        dog.sleep();
        bebek.sleep();
        adi.sleep();
        babayo.sleep();
        kudalumping.sleep();
        brgHantu.sleep();
    }
}
