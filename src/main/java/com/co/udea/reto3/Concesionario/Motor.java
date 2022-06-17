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
public class Motor {

    private double cilindraje;
    private String marca;
    private String referencia;
    private double peso;
    private String descripcion;

    public Motor(double cilindraje, String marca, String referencia, double peso, String descripcion) {
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.referencia = referencia;
        this.peso = peso;
        this.descripcion = descripcion;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
