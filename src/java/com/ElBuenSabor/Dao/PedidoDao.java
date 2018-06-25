/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ElBuenSabor.Dao;

import com.ElBuenSabor.Entity.Pedido;
import com.ElBuenSabor.Entity.Persona;
import com.ElBuenSabor.Entity.Usuario;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Diego
 */
public interface PedidoDao {
    public List<Map<String,?>> listarChef();
    
    
    //copia diego   
    
    public List<Map<String,?>> listarPedido();
    
    
    
    
    
}
