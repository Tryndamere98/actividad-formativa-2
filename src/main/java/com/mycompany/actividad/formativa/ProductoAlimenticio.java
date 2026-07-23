package com.mycompany.actividad.formativa;

/**
 * Clase derivada que hereda de Producto.
 */
public class ProductoAlimenticio extends Producto {
    private String fechaCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int cantidadEnStock, String fechaCaducidad) {
        super(nombre, precio, cantidadEnStock);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Fecha de Caducidad: " + fechaCaducidad);
    }

    public void verificarCaducidad() {
        System.out.println("Revisando frescura de " + getNombre() + ". Caduca el: " + fechaCaducidad);
    }
}