
package com.ElBuenSabor.Dao;

import com.ElBuenSabor.Entity.Producto;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface ProductoDao {
    int create(Producto p);
    int update(Producto p);
    int delete(int id);
    Producto read(int id);
    List<Producto> readAll(String nombresss);
    List<Producto> readAll();
}
