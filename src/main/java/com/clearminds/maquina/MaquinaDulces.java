/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

/**
 *
 * @author Oscar
 */
public class MaquinaDulces {
    private Celda celda1;
    private Celda celda2;
    private Celda celda3;
    private Celda celda4;
    private double saldo;
    
    public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4){
        celda1 = new Celda(codigo1);
        celda2 = new Celda(codigo2);
        celda3 = new Celda(codigo3);
        celda4 = new Celda(codigo4);
    }

    public Celda getCelda1() {
        return celda1;
    }

    public void setCelda1(Celda celda1) {
        this.celda1 = celda1;
    }

    public Celda getCelda2() {
        return celda2;
    }

    public void setCelda2(Celda celda2) {
        this.celda2 = celda2;
    }

    public Celda getCelda3() {
        return celda3;
    }

    public void setCelda3(Celda celda3) {
        this.celda3 = celda3;
    }

    public Celda getCelda4() {
        return celda4;
    }

    public void setCelda4(Celda celda4) {
        this.celda4 = celda4;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void mostrarConfiguracion(){
        System.out.println("CONFIGURACION DE LA MAQUINA");
        if (celda1 != null) {
            System.out.println("Celda 1 - Código: " + celda1.getCodigo());
        }
        if (celda2 != null) {
            System.out.println("Celda 2 - Código: " + celda2.getCodigo());
        }
        if (celda3 != null) {
            System.out.println("Celda 3 - Código: " + celda3.getCodigo());
        }
        if (celda4 != null) {
            System.out.println("Celda 4 - Código: " + celda4.getCodigo());
        }

        System.out.println("Saldo: " + saldo);
    }
    public Celda buscarCelda(String codigo) {
        if (celda1 != null && celda1.getCodigo().equals(codigo)) {
            return celda1;
        }

        if (celda2 != null && celda2.getCodigo().equals(codigo)) {
            return celda2;
        }

        if (celda3 != null && celda3.getCodigo().equals(codigo)) {
            return celda3;
        }

        if (celda4 != null && celda4.getCodigo().equals(codigo)) {
            return celda4;
        }

        // Si no se encontró ninguna celda con el código proporcionado
        return null;
    }
    public void cargarProducto(Producto producto, String codigoCelda, int cantidadInicial) {
        Celda celdaRecuperada = buscarCelda(codigoCelda);
        if (celdaRecuperada != null) {
            celdaRecuperada.ingresarProducto(producto, cantidadInicial);
        }
    }

    public void mostrarProductos() {
        System.out.println("Productos en la Máquina:");

        if (celda1 != null) {
            System.out.println("Celda 1 - Código: " + celda1.getCodigo());
            System.out.println("    Saldo: " + saldo);
            System.out.println("    Stock: " + celda1.getStock());
            if (!(celda1.getStock()==0)) {
                System.out.println("    Nombre: " + celda1.getProducto().getNombre());
                System.out.println("    Precio: " + celda1.getProducto().getPrecio());
                System.out.println("    Codigo: " + celda1.getProducto().getCodigo());
            }else{
                System.out.println("    NO TIENE PRODUCTO!!");
            }
        }

        if (celda2 != null) {
            System.out.println("Celda 2 - Código: " + celda2.getCodigo());
            System.out.println("    Saldo: " + saldo);
            System.out.println("    Stock: " + celda2.getStock());
            if (!(celda2.getStock()==0)) {
                System.out.println("    Nombre: " + celda2.getProducto().getNombre());
                System.out.println("    Precio: " + celda2.getProducto().getPrecio());
                System.out.println("    Codigo: " + celda2.getProducto().getCodigo());
            }else{
                System.out.println("    NO TIENE PRODUCTO!!");
            }
        }

        if (celda3 != null) {
            System.out.println("Celda 3 - Código: " + celda3.getCodigo());
            System.out.println("    Saldo: " + saldo);
            System.out.println("    Stock: " + celda3.getStock());
            if (!(celda3.getStock()==0)) {
                System.out.println("    Nombre: " + celda3.getProducto().getNombre());
                System.out.println("    Precio: " + celda3.getProducto().getPrecio());
                System.out.println("    Codigo: " + celda3.getProducto().getCodigo());
            }else{
                System.out.println("    NO TIENE PRODUCTO!!");
            }
        }

        if (celda4 != null) {
            System.out.println("Celda 4 - Código: " + celda4.getCodigo());
            System.out.println("    Saldo: " + saldo);
            System.out.println("    Stock: " + celda4.getStock());
            if (!(celda4.getStock()==0)) {
                System.out.println("    Nombre: " + celda4.getProducto().getNombre());
                System.out.println("    Precio: " + celda4.getProducto().getPrecio());
                System.out.println("    Codigo: " + celda4.getProducto().getCodigo());
            }else{
                System.out.println("    NO TIENE PRODUCTO!!");
            }
        }
    }
    public Producto buscarProductoEnCelda(String codigo){
        if (celda1 != null && celda1.getCodigo().equals(codigo)) {
            return celda1.getProducto();
        }

        if (celda2 != null && celda2.getCodigo().equals(codigo)) {
            return celda2.getProducto();
        }

        if (celda3 != null && celda3.getCodigo().equals(codigo)) {
            return celda3.getProducto();
        }

        if (celda4 != null && celda4.getCodigo().equals(codigo)) {
            return celda4.getProducto();
        }
        return null;
    }
    public double consultarPrecio(String codigo){
        if (celda1 != null && celda1.getCodigo().equals(codigo)) {
            return celda1.getProducto().getPrecio();
        }

        if (celda2 != null && celda2.getCodigo().equals(codigo)) {
            return celda2.getProducto().getPrecio();
        }

        if (celda3 != null && celda3.getCodigo().equals(codigo)) {
            return celda3.getProducto().getPrecio();
        }

        if (celda4 != null && celda4.getCodigo().equals(codigo)) {
            return celda4.getProducto().getPrecio();
        }
        return 0;
    }
    public Celda buscarCeldaProducto(String codigoProducto){
    if (celda1 != null && celda1.getProducto() != null && celda1.getProducto().getCodigo().equals(codigoProducto)) {
        return celda1;
    }

    if (celda2 != null && celda2.getProducto() != null && celda2.getProducto().getCodigo().equals(codigoProducto)) {
        return celda2;
    }

    if (celda3 != null && celda3.getProducto() != null && celda3.getProducto().getCodigo().equals(codigoProducto)) {
        return celda3;
    }

    if (celda4 != null && celda4.getProducto() != null && celda4.getProducto().getCodigo().equals(codigoProducto)) {
        return celda4;
    }
    return null;
}
    public void incrementarProductos(String codigoProducto, int cantidadItems){
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
        if (celdaEncontrada != null) {
            int stockActual = celdaEncontrada.getStock();
            celdaEncontrada.setStock(stockActual + cantidadItems);
        }
    }
    public void vender(String codigo){
        Celda celdaEncontrada = buscarCelda(codigo);
        if (celdaEncontrada != null) {
            celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
            saldo += celdaEncontrada.getProducto().getPrecio();
        }
    }
    public double venderConCambio(String codigoCelda, double valorIngresado){
        Celda celdaVendida = buscarCelda(codigoCelda);
        if (celdaVendida != null && celdaVendida.getStock() > 0) {
            Producto productoVendido = celdaVendida.getProducto();
            double precioProducto = productoVendido.getPrecio();
            if (valorIngresado >= precioProducto) {
                celdaVendida.setStock(celdaVendida.getStock() - 1);
                double cambio = valorIngresado - precioProducto;
                double nuevoSaldo = getSaldo() + precioProducto;
                setSaldo(nuevoSaldo);
                return cambio;
            } else {
                System.out.println("El valor ingresado no es suficiente para comprar el producto.");
            }
        } else {
            System.out.println("La celda no existe o no tiene stock disponible.");
        }
        return 0.0;
    }
}
