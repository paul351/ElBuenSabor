/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ElBuenSabor.Entity;

/**
 *
 * @author Diego
 */
public class Pedido {
    private int id_pedido;
    private String fecha;
    private int usuario_id_usuario;
    private int estado;

    public Pedido(String fecha, int usuario_id_usuario, int estado) {
        this.fecha = fecha;
        this.usuario_id_usuario = usuario_id_usuario;
        this.estado = estado;
    }

    public Pedido(int id_pedido, String fecha, int usuario_id_usuario, int estado) {
        this.id_pedido = id_pedido;
        this.fecha = fecha;
        this.usuario_id_usuario = usuario_id_usuario;
        this.estado = estado;
    }

    public Pedido(int usuario_id_usuario) {
        this.usuario_id_usuario = usuario_id_usuario;
    }
    
    
    public Pedido(int id_pedido, int usuario_id_usuario) {
        this.id_pedido = id_pedido;
        this.usuario_id_usuario = usuario_id_usuario;
    }

    public Pedido() {
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getUsuario_id_usuario() {
        return usuario_id_usuario;
    }

    public void setUsuario_id_usuario(int usuario_id_usuario) {
        this.usuario_id_usuario = usuario_id_usuario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id_pedido=" + id_pedido + ", fecha=" + fecha + ", usuario_id_usuario=" + usuario_id_usuario + ", estado=" + estado + '}';
    }
    
    
}
