/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan5.Guided.Guided1;

/**
 *
 * @author purna
 */
public class Main {
    public static void main(String[] args) {
        Paket Ashiap = new Paket("Rahasia Jualan Risol", "Rahayu", 60000, "700MB", 5000);
        Ashiap.hitungHargaPaket();
        Ashiap.cetakPaket();
    }
}
