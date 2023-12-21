/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.purnama.pertemuan7.Guided.Agregasi;

/**
 *
 * @author purna
 */
public class Relasi {
    public static void main(String[] args) {
        Perusahaan perusahaanku = new Perusahaan("PT. Cinta Mencari Sejati");
        Pegawai pegawai1, pegawai2, pegawai3;
        
        pegawai1 = new Pegawai("Budi Andi", "P0001 ");
        pegawai2 = new Pegawai("Toni Skuter", "P0002 ");
        pegawai3 = new Pegawai("Ani Ani", "P0003 ");
        
        perusahaanku.insertPegawai(pegawai1);
        perusahaanku.insertPegawai(pegawai2);
        perusahaanku.insertPegawai(pegawai3);
        
        System.out.println("");
        perusahaanku.tampilPerusahaan();
        
    }
}
