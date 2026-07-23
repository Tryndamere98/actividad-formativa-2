package com.mycompany.actividad.formativa;

/**
 * Clase derivada que hereda de Producto.
 */
public class ProductoElectronico extends Producto {
    private int mesesGarantia;

    public ProductoElectronico(String nombre, double precio, int cantidadEnStock, int mesesGarantia) {
        super(nombre, precio, cantidadEnStock);
        this.mesesGarantia = mesesGarantia;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public void setMesesGarantia(int mesesGarantia) {
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Garantía: " + mesesGarantia + " meses");
    }

    public void extenderGarantia(int mesesExtra) {
        this.mesesGarantia += mesesExtra;
        System.out.println("Garantía extendida a " + this.mesesGarantia + " meses para " + getNombre());
    }
}
