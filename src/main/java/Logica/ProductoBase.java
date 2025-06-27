/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author daniel
 */
public class ProductoBase extends Producto {
    public ProductoBase () {
        
    }
    public ProductoBase(String codigo, String nombre, int cantidad, double precio) {
        super(codigo, nombre, cantidad, precio);
    }
    
    @Override
    public double calcularPrecio() {
        return this.getPrecio() * this.getCantidad();
    }
    
    @Override
    public void Mostrar() {
        System.out.printf(
            "Código: %s, Nombre: %s, Cantidad: %d, Precio unitario: %.2f, Subtotal: %.2f%n",
            this.getCodigo(), this.getNombre(), this.getCantidad(), this.getPrecio(), this.calcularPrecio()
        );
    }

}
