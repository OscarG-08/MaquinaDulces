/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clearminds.componentes;

/**
 *
 * @author Oscar
 */
public class Celda {
    private Producto producto;
    private int stock;
    private String codigo;

    public Celda(String codigo) {
        this.codigo = codigo;
    }
    
    public void ingresarProducto(Producto producto, int stock){
        this.producto = producto;
        this.stock = stock;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}
