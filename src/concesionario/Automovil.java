/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author jaime.munozq
 */
public class Automovil {
    private String placa;
    private String marca;
    private int modelo;
    private int kilometraje;
    private double precio;
    private String descripcion;
    private Llanta [] llantas;
    private Vendedor vendedor;
    private Motor motor;

    public Automovil(String placa, String marca, int modelo, int kilometraje, double precio, String descripcion, Llanta[] llantas,Motor motor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.precio = precio;
        this.descripcion = descripcion;
        if(llantas.length==4){
         this.llantas = llantas;   
        }
        this.motor = motor;
    }
    
    
    
    public String calcularUso(){
        if(kilometraje==0){
            return "0 km";
        }
        if(kilometraje >0 && kilometraje<1000){
            return "Nuevo";
        }
        if(kilometraje>=1000 && kilometraje<20000){
            return "Casi nuevo";
        }
        if(kilometraje>=20000 && kilometraje<100000){
            return "Usado";
        }
        if(kilometraje>=100000){
            return "Muy usado";
        }
        return "Valor del kilometraje incorrecto";
    }
}
