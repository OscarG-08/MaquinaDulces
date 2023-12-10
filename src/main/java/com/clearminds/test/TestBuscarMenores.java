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
public class TestBuscarMenores {
    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.agregarCelda("A1");
        maquina.agregarCelda("A2");
        maquina.agregarCelda("B1");
        maquina.agregarCelda("B2");
        Producto producto = new Producto("Papitas", 0.85, "KE34");
        maquina.cargarProducto(producto, "A1", 4);
        Producto producto2 = new Producto("Doritos", 0.5, "D456");
        maquina.cargarProducto(producto2, "A2", 4);
        Producto producto3 = new Producto("Jet", 0.25, "KE34");
        maquina.cargarProducto(producto3, "B1", 4);
        Producto producto4 = new Producto("DeTodito", 0.6, "D456");
        maquina.cargarProducto(producto4, "B2", 4);
        maquina.buscarMenores(2);
    }
}
