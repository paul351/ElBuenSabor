/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
