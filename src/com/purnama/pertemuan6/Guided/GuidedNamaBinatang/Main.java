/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan6.Guided.GuidedNamaBinatang;

import java.util.Random;

/**
 *
 * @author purna
 */
public class Main {
    public static void main(String[] args) {
        Binatang[] peliharaanku = {
            new Burung("Perkutut"),
            new Kambing("Wedhus Gembel"),
            new Anjing("Pitbul"),
            new Kucing("Oren")
        };
        
        Binatang kesayangan;
        Random binatangku = new Random();
        kesayangan = peliharaanku[binatangku.nextInt(peliharaanku.length)];
        
        System.out.println("Binatang Kesayangan Temen-Temen : " + kesayangan);
        System.out.print("Suaranya : ") ;
        kesayangan.suara();
    }
}
