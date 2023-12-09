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
public class TestCelda {
    public static void main(String[] args) {
        Celda celda = new Celda("A1");
        celda.ingresarProducto(new Producto("Papitas", 0.85, "KE34"), 5);
        //Aqui se genera un NUllPointer porque producto aun no esta inicializado y ya estamos ocupando un metodo.
        System.out.println(celda.getProducto().getNombre());
        System.out.println("CELDA:" + celda.getProducto());
        System.out.println("Nombre Producto:" + celda.getProducto().getNombre());
        System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
        System.out.println("C�digo Producto:" + celda.getProducto().getCodigo());
        System.out.println("STOCK:" + celda.getStock());
        System.out.println("*************************************");
    }
}
