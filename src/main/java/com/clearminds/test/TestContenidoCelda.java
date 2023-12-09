/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

/**
 *
 * @author Oscar
 */
public class TestContenidoCelda {
    public static void main(String[] args) {
        Celda celda = new Celda("A1");
        Producto producto = new Producto("Papitas", 0.85, "KE34");
        celda.ingresarProducto(producto, 5);

        System.out.println("CELDA:" + celda.getCodigo());
        System.out.println("*************************************");
        System.out.println("Nombre Producto:" + celda.getProducto().getNombre());
        System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
        System.out.println("Codigo Producto:" + celda.getProducto().getCodigo());
        System.out.println("STOCK:" + celda.getStock());
    }
}
