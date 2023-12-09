/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

/**
 *
 * @author Oscar
 */
public class TestBuscarProductoNull {

    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.configurarMaquina("A1", "A2", "B1", "B2");

        Producto producto = new Producto("Papitas", 0.85,"KE34");
        maquina.cargarProducto(producto, "B1", 4);

        Producto prod = maquina.buscarProductoEnCelda("A1");
        //En esta linea da un NullPointer porque prod es null(no hay productos en la celda y devuelve null el metodo). OJO!!!!!!!!!
        System.out.println("Producto encontrado:" + prod.getNombre());
    }
}
