/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author hp
 */
public class AutoCarRPL implements Transportasi {
    private int bahanBakar;
    private int kecepatan;
    private roda roda;
    private setir setir;
    private mesin mesin;

    public AutoCarRPL(int bahanBakar, int kecepatan) {
        this.bahanBakar = bahanBakar;
        this.kecepatan = kecepatan;
        this.roda = new roda();
        this.setir = new setir();
        this.mesin = new mesin();
    }

    public void start() {
        System.out.println("Mobil dimulai dengan bahan bakar: " + bahanBakar);
    }

    public void drive() {
        System.out.println("Mobil berjalan dengan kecepatan: " + kecepatan);
    }

    public int getBahanBakar() {
        return bahanBakar;
    }

    public int getKecepatan() {
        return kecepatan;
    }
}
