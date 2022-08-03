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
public class EdadException extends Exception{

    public EdadException() {
        super("La edad no puede ser inferior a 18");
    }
    
}
