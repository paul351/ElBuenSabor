/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ElBuenSabor.Entity;

/**
 *
 * @author 
 */
public class Historial {
    private int id_historial;
    private double precio;
    private int pedido_id_pedido;  

    public Historial(double precio, int pedido_id_pedido) {
        this.precio = precio;
        this.pedido_id_pedido = pedido_id_pedido;
    }

    public Historial(int id_historial, double precio, int pedido_id_pedido) {
        this.id_historial = id_historial;
        this.precio = precio;
        this.pedido_id_pedido = pedido_id_pedido;
    }

    public Historial() {
    }

    public int getId_historial() {
        return id_historial;
    }

    public void setId_historial(int id_historial) {
        this.id_historial = id_historial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPedido_id_pedido() {
        return pedido_id_pedido;
    }

    public void setPedido_id_pedido(int pedido_id_pedido) {
        this.pedido_id_pedido = pedido_id_pedido;
    }

    @Override
    public String toString() {
        return "Historial{" + "id_historial=" + id_historial + ", precio=" + precio + ", pedido_id_pedido=" + pedido_id_pedido + '}';
    }
    
    
}
