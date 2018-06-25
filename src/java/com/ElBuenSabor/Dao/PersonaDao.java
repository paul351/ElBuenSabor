
package com.ElBuenSabor.Dao;

import com.ElBuenSabor.Entity.Persona;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface PersonaDao {
    int create(Persona p);
    int update(Persona p);
    int delete(int id);
    Persona read(int id);
    List<Persona> readAll(String dni);
    List<Persona> readAll();
}
