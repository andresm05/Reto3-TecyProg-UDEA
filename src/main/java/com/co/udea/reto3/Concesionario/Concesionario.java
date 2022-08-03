/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.udea.reto3.Concesionario;

/**
 *
 * @author HOME
 */
public class Concesionario {

    public static void main(String[] args) {
        
        //Creación de llantas
        Llanta llantas[] = new Llanta[4];
        try {
            Llanta llantaDelantera1 = new Llanta("Firestone", "1254", 15);
            llantas[0] = llantaDelantera1;
        } catch (PesoException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            Llanta llantaDelantera2 = new Llanta("Firestone", "1254", 15);
            llantas[1] = llantaDelantera2;
        } catch (PesoException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            Llanta llantaTrasera1 = new Llanta("Bridgestone", "1015", 20);
            llantas[2] = llantaTrasera1;
        } catch (PesoException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            Llanta llantaTrasera2 = new Llanta("Bridgestone", "1015", 20);
            llantas[3] = llantaTrasera2;
        } catch (PesoException ex) {
            System.out.println(ex.getMessage());
        }
        //Creación de un motor y un auto
        try {
            Motor motor = new Motor(1500, "Bridgestone", "46867", 20, "no aplica");
            Automovil auto = new Automovil("LRD78R", "Porsche", 2020, 0, 150000000, "Nuevo", "Azul", llantas, motor, 2020);
            System.out.println("La marca del auto es: "+auto.getMarca());
        } catch (PesoException ex) {
            System.out.println(ex.getMessage());
        } catch (KilometrajeException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            //Crear un vendedor
            Vendedor juan = new Vendedor("1020478696", "Juan David", "Vásquez Ospina", 15, 15422888, 2022, "No aplica");
        } catch (yearException ex) {
            System.out.println(ex.getMessage());
        } catch (EdadException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
