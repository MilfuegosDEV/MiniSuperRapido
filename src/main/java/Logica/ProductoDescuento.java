/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author daniel
 */
public class ProductoDescuento extends Producto {
    private final double porcentajeDescuento;
    
    public ProductoDescuento(String codigo, String nombre, int cantidad, double precio, double porcentajeDescuento ) {
        super(codigo, nombre, cantidad, precio);
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    @Override
    public double calcularPrecio() {
        double subtotal = super.calcularPrecio();
        return subtotal * (1- this.porcentajeDescuento);
    }
    
    @Override
    public void Mostrar() {
        System.out.printf(
            "Código: %s, Nombre: %s, Cantidad: %d, Precio unitario: %.2f, Descuento: %.0f%%, Total: %.2f%n",
            getCodigo(), getNombre(), getCantidad(), getPrecio(),
            porcentajeDescuento * 100, calcularPrecio()
        );
    }
}
