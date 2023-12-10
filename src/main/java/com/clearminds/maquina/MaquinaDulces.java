/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import java.util.ArrayList;

/**
 *
 * @author Oscar
 */
public class MaquinaDulces {

    private ArrayList<Celda> celdas;
    private Celda celda1;
    private Celda celda2;
    private Celda celda3;
    private Celda celda4;
    private double saldo;

    public MaquinaDulces() {
        celdas = new ArrayList<>();
        saldo = 0.0;
    }

    public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
        celda1 = new Celda(codigo1);
        celda2 = new Celda(codigo2);
        celda3 = new Celda(codigo3);
        celda4 = new Celda(codigo4);
    }

    public ArrayList<Celda> getCeldas() {
        return celdas;
    }

    public void setCeldas(ArrayList<Celda> celdas) {
        this.celdas = celdas;
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

    public void agregarCelda(String codigoCelda) {
        Celda celda = new Celda(codigoCelda);
        celdas.add(celda);
    }

    public void mostrarConfiguracion() {
        System.out.println("CONFIGURACION DE LA MAQUINA");
        for (int i = 0; i < celdas.size(); i++) {
            Celda celda = celdas.get(i);
            System.out.println("Celda - Codigo: " + celda.getCodigo());
        }
        System.out.println("Saldo: " + saldo);
    }

    public Celda buscarCelda(String codigo) {
        for (int i = 0; i < celdas.size(); i++) {
            Celda celda = celdas.get(i);
            if (celda.getCodigo().equals(codigo)) {
                return celda;
            }
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
        for (int i = 0; i < celdas.size(); i++) {
            Celda celda = celdas.get(i);
            System.out.println("Celda - Código: " + celda.getCodigo());
            System.out.println("    Saldo: " + saldo);
            System.out.println("    Stock: " + celda.getStock());

            if (celda.getStock() != 0) {
                System.out.println("    Nombre: " + celda.getProducto().getNombre());
                System.out.println("    Precio: " + celda.getProducto().getPrecio());
                System.out.println("    Codigo: " + celda.getProducto().getCodigo());
            } else {
                System.out.println("    NO TIENE PRODUCTO!!");
            }
        }
    }

    public Producto buscarProductoEnCelda(String codigo) {
        for (int i = 0; i < celdas.size(); i++) {
            Celda celda = celdas.get(i);
            if (celda.getCodigo().equals(codigo)) {
                return celda.getProducto();
            }
        }
        return null;
    }

    public double consultarPrecio(String codigo) {
        for (int i = 0; i < celdas.size(); i++) {
            Celda celda = celdas.get(i);
            if (celda.getCodigo().equals(codigo)) {
                return celda.getProducto().getPrecio();
            }
        }
        return 0;
    }

    public Celda buscarCeldaProducto(String codigoProducto) {
        for (int i = 0; i < celdas.size(); i++) {
            Celda celda = celdas.get(i);
            if (celda != null && celda.getProducto() != null) {
                if (celda.getProducto().getCodigo().equals(codigoProducto)) {
                    return celda;
                }
            }
        }
        return null;
    }

    public void incrementarProductos(String codigoProducto, int cantidadItems) {
        Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
        if (celdaEncontrada != null) {
            int stockActual = celdaEncontrada.getStock();
            celdaEncontrada.setStock(stockActual + cantidadItems);
        }
    }

    public void vender(String codigo) {
        Celda celdaEncontrada = buscarCelda(codigo);
        if (celdaEncontrada != null) {
            celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
            saldo += celdaEncontrada.getProducto().getPrecio();
        }
    }

    public double venderConCambio(String codigoCelda, double valorIngresado) {
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

    public ArrayList<Producto> buscarMenores(double limite) {
        ArrayList<Producto> productosEncontrados = new ArrayList<>();

        for (int i = 0; i < celdas.size(); i++) {
            Celda celda = celdas.get(i);
            if (celda != null && celda.getProducto() != null) {
                Producto producto = celda.getProducto();
                if (producto.getPrecio() <= limite) {
                    productosEncontrados.add(producto);
                    System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
                }
            }
        }
        return productosEncontrados;
    }
}
