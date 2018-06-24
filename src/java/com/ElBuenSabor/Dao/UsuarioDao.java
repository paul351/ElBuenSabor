/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ElBuenSabor.Dao;

import com.ElBuenSabor.Entity.Persona;
import com.ElBuenSabor.Entity.Usuario;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Diego
 */
public interface UsuarioDao {
    List<Usuario> readAll();
    int crearUsuario(Usuario u, Persona p);    
}
