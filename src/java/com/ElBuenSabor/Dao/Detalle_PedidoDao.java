
package com.ElBuenSabor.Dao;

import com.ElBuenSabor.Entity.Detalle_Pedido;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Diego
 */
public interface Detalle_PedidoDao {

    public List<Map<String,?>> listarModal(int id);
}
