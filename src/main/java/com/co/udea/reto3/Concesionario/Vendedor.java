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
public class Vendedor {

    private String documento;
    private String nombres;
    private String apellidos;
    private int edad;
    private double valorVendido;
    private int anioIngreso;
    private String descripcion;

    public Vendedor(String documento, String nombres, String apellidos, int edad, double valorVendido, int anioIngreso, String descripcion) {
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.valorVendido = valorVendido;
        this.anioIngreso = anioIngreso;
        this.descripcion = descripcion;
    }

    public String calcularVenta() {
        if (valorVendido == 0) {
            return "Novato";
        }
        if (valorVendido > 0 && valorVendido < 500000000) {
            return "principiante";
        }
        if (valorVendido >= 500000000 && valorVendido < 2000000000) {
            return "intermedio";
        }
        if(valorVendido >= 2000000000){
            return "Avanzado";
        }
        return "El valor vendido no es correcto";
    }
    
    public String calcularCalidad(){
        if(anioIngreso>= 2021){
            if(valorVendido>=500000000){
                return "Bueno";
            }
            if(valorVendido>0 && valorVendido<500000000){
                return "Regular";
            }
            if(valorVendido == 0){
                return "malo";
            }
        }
        if(anioIngreso>=2018 && anioIngreso<2021){
            if(valorVendido >=1500000000){
                return "Bueno";
            }
            if(valorVendido>=250000000 && valorVendido<1500000000){
                return "Regular";
            }
            if(valorVendido < 250000000){
                return "malo";
            }
        }
        if(anioIngreso<2017){
            if(valorVendido>= 2000000000){
                return "Bueno";
            }
            if(valorVendido>=500000000 && valorVendido<2000000000){
                return "Regular";
            }
            if(valorVendido< 500000000){
                return "Malo";
            }
        }
        return "año de ingreso o ventas totales incorrectas";
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getValorVendido() {
        return valorVendido;
    }

    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
