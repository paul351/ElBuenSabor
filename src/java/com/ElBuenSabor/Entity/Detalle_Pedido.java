
package com.ElBuenSabor.Entity;

public class Detalle_Pedido {
    private int id_det_pedido;
    private int pedido_id_pedido;
    private int producto_id_producto;
    private int promociones_id_promociones;
    private int cantidad;

    public Detalle_Pedido(int pedido_id_pedido, int producto_id_producto, int promociones_id_promociones, int cantidad) {
        this.pedido_id_pedido = pedido_id_pedido;
        this.producto_id_producto = producto_id_producto;
        this.promociones_id_promociones = promociones_id_promociones;
        this.cantidad = cantidad;
    }

    public Detalle_Pedido(int id_det_pedido, int pedido_id_pedido, int producto_id_producto, int promociones_id_promociones, int cantidad) {
        this.id_det_pedido = id_det_pedido;
        this.pedido_id_pedido = pedido_id_pedido;
        this.producto_id_producto = producto_id_producto;
        this.promociones_id_promociones = promociones_id_promociones;
        this.cantidad = cantidad;
    }

    public Detalle_Pedido() {
    }

    public int getId_det_pedido() {
        return id_det_pedido;
    }

    public void setId_det_pedido(int id_det_pedido) {
        this.id_det_pedido = id_det_pedido;
    }

    public int getPedido_id_pedido() {
        return pedido_id_pedido;
    }

    public void setPedido_id_pedido(int pedido_id_pedido) {
        this.pedido_id_pedido = pedido_id_pedido;
    }

    public int getProducto_id_producto() {
        return producto_id_producto;
    }

    public void setProducto_id_producto(int producto_id_producto) {
        this.producto_id_producto = producto_id_producto;
    }

    public int getPromociones_id_promociones() {
        return promociones_id_promociones;
    }

    public void setPromociones_id_promociones(int promociones_id_promociones) {
        this.promociones_id_promociones = promociones_id_promociones;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Detalle_Pedido{" + "id_det_pedido=" + id_det_pedido + ", pedido_id_pedido=" + pedido_id_pedido + ", producto_id_producto=" + producto_id_producto + ", promociones_id_promociones=" + promociones_id_promociones + ", cantidad=" + cantidad + '}';
    }
    
    
}
