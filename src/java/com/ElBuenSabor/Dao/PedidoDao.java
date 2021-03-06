
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

    int create(Pedido p);
    
 
   public List<Pedido> listarhistorial();

   

}
