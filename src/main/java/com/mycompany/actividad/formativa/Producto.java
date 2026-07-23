/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad.formativa;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    // --- AGREGA ESTE MÉTODO GETTER ---
    public String getNombre() {
        return nombre;
    }

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock disponible: " + cantidadEnStock + " unidades");
        System.out.println("----------------------------------");
    }

    public void vender(int cantidad) {
        if (cantidad <= cantidadEnStock) {
            cantidadEnStock -= cantidad;
            System.out.println("VENTA: Se vendieron " + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("ERROR: Stock insuficiente para vender " + cantidad + " unidades de " + nombre);
        }
    }

    public void reabastecer(int cantidad) {
        if (cantidad > 0) {
            cantidadEnStock += cantidad;
            System.out.println("REABASTECIMIENTO: Se añadieron " + cantidad + " unidades a " + nombre);
        }
    }
}
