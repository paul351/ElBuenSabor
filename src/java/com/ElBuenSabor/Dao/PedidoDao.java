
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
    
    
     
    
    public List<Map<String,?>> listarPedido();
    public List<Map<String,?>> listarDetalle(int id);
   
    Pedido listarIdPedido(int key);
<<<<<<< HEAD
    int create(Pedido p);
    
 
=======

   
>>>>>>> a61b882c95a8320fee2ca8f10eae857d8881bbe9
}
