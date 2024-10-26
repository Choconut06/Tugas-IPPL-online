/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author hp
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        AutoCarRPL car = new AutoCarRPL(50, 120);
        car.start();
        car.drive();

        mio mioCar = new mio(30, 80);
        mioCar.start();
        mioCar.drive();
    }
}
