/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.maquina.MaquinaDulces;

/**
 *
 * @author Oscar
 */
public class TestBusqueda {

    public static void main(String[] args) {
        MaquinaDulces maquina = new MaquinaDulces();
        maquina.agregarCelda("A");
        maquina.agregarCelda("B");
        maquina.agregarCelda("C");
        maquina.agregarCelda("D");
        maquina.mostrarConfiguracion();
        Celda celda = maquina.buscarCelda("C");
        System.out.println("Celda Encontrada: " + celda.getCodigo());
        Celda celda2 = maquina.buscarCelda("F");
        if (celda2 == null) {
            System.out.println("No existe la celda buscada");
        }
    }
}
