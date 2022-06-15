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
    
    public String calcularVenta(){
        if(valorVendido==0){
            return "Novato";
        }
        if(valorVendido>0 && valorVendido<500000000){
            return "intermedio";
        }
        if(valorVendido>=500000000 && valorVendido<2000000000){
            return "Avanzado";
        }
        return "El valor vendido no es correcto";
    }
    
}
