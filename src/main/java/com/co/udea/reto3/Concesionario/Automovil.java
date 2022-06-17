
package com.co.udea.reto3.Concesionario;

public class Automovil {

    private String placa;
    private String marca;
    private int modelo;
    private int kilometraje;
    private double precio;
    private String descripcion;
    private String color;
    private Llanta[] llantas;
    private Vendedor vendedor;
    private Motor motor;
    private int anioFabricacion;

    public Automovil(String placa, String marca, int modelo, int kilometraje, double precio, String descripcion, String color, Llanta[] llantas, Motor motor, int anioFabricacion) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.precio = precio;
        this.descripcion = descripcion;
        this.color = color;
        if (llantas.length == 4) {
            this.llantas = llantas;
        }
        this.motor = motor;
        this.anioFabricacion = anioFabricacion;
    }

    public String calcularUso() {
        if (kilometraje == 0) {
            return "0 km";
        }
        if (kilometraje > 0 && kilometraje < 1000) {
            return "Nuevo";
        }
        if (kilometraje >= 1000 && kilometraje < 20000) {
            return "Casi nuevo";
        }
        if (kilometraje >= 20000 && kilometraje < 100000) {
            return "Usado";
        }
        if (kilometraje >= 100000) {
            return "Muy usado";
        }
        return "Valor del kilometraje incorrecto";
    }
    
    public String calcularEstado(){
        if(anioFabricacion>=2021){
            return "Último modelo";
        }
        if(anioFabricacion >= 2019 && anioFabricacion <2021){
            return "Nuevo";
        }
        if(anioFabricacion>=2015 && anioFabricacion<2019){
            return "Intermedio";
        }
        if(anioFabricacion < 2015){
            return "Antiguo";
        }
        return "Fecha incorrecta";
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

}
