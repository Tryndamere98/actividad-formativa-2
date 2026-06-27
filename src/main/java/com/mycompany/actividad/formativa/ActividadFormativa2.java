/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad.formativa;

/**
 * Clase principal que ejecuta la aplicación.
 * Realiza la instanciación de objetos y la prueba de métodos.
 */
public class ActividadFormativa2 {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE INVENTARIO ===\n");

        // Instanciación: Creamos dos objetos usando la palabra clave 'new'
        Producto producto1 = new Producto("Laptop ASUS", 15499.99, 10);
        Producto producto2 = new Producto("Smartphone Poco X6", 5200.00, 5);

        // Prueba de métodos: Mostrar estado inicial
        System.out.println("--- Inventario Inicial ---");
        producto1.mostrarDetalles();
        producto2.mostrarDetalles();

        // Simulación de operaciones: Ventas y reabastecimiento
        System.out.println("--- Procesando Operaciones ---");
        producto1.vender(3);       // Compra exitosa
        producto2.vender(6);       // Fallará por falta de stock
        producto2.reabastecer(10); // Añadimos stock
        producto2.vender(2);       // Ahora sí se puede vender

        // Estado final: Verificamos los cambios
        System.out.println("\n--- Inventario Actualizado ---");
        producto1.mostrarDetalles();
        producto2.mostrarDetalles();
    }
}
