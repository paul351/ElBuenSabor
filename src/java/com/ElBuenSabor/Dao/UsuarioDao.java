/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ElBuenSabor.Dao;

import com.ElBuenSabor.Entity.Persona;
import com.ElBuenSabor.Entity.Producto;
import com.ElBuenSabor.Entity.Usuario;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Diego
 */
public interface UsuarioDao {
    List<Usuario> readAll();
    int crearUsuario(Usuario u, Persona p);  
    public Usuario LOGIN(String NICKNAME, String PASSWORD);
    public int CREAR(int DNI, String NOMBRES, String APELLIDOS);
    public List<Map<String,?>> LISTAR();
    List<Producto> COMBO();
}
