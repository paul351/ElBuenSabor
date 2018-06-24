/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
