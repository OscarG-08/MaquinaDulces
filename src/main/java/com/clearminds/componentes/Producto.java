/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clearminds.componentes;

/**
 *
 * @author Oscar
 */
public class Producto {
    private String nombre;
    private double precio;
    private String codigo;

    public Producto(String nombre, double precio, String codigo) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void incrementarPrecio(int porcentaje){
        double precioFinal = (1 + porcentaje / 100.0) * this.precio;
        this.precio = precioFinal;
    }
    public void disminuirPrecio(double descuento){
        double precioFinal = (1 - descuento / 100.0) * this.precio;
        this.precio = precioFinal;
    }
}
