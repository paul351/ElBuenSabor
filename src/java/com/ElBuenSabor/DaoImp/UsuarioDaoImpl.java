/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ElBuenSabor.DaoImp;

import com.ElBuenSabor.Dao.UsuarioDao;
import com.ElBuenSabor.Entity.Persona;
import com.ElBuenSabor.Entity.Usuario;
import com.ElBuenSabor.Util.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author 
 */
public class UsuarioDaoImpl implements UsuarioDao {
    
    private CallableStatement cst;
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection cx;
    
    @Override
    public List<Usuario> readAll() {

        List<Usuario> datos = new ArrayList<>();
        
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call LISTARUSUARIO()}");
            rs = cst.executeQuery();
            while(rs.next()){
        
                Usuario u = new Usuario();
                u.setId_usuario(rs.getInt("ID_USUARIO"));
                u.setNickname(rs.getString("NICKNAME"));
                u.setPassword(rs.getString("PASSWORD"));
                datos.add(u);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return datos;

    }

    @Override
    public int crearUsuario(Usuario u, Persona p) {
    int x =0;
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call CREARUSUARIO(?,?,?,?,?,?,?,?,?)}");
            cst.setString(1, u.getNickname());
            cst.setString(2, u.getPassword());
            cst.setInt(3, u.getRol());
            cst.setString(4, p.getNombre());
            cst.setString(5,p.getApellido());
            cst.setString(6, p.getDireccion());
            cst.setInt(7, p.getTelefono());
            cst.setInt(8, p.getDni());
            cst.setString(9, p.getCorreo());
            x = cst.executeUpdate();
        }catch(SQLException e) {
            System.out.println("Error:"+e);
        }
        return x;    
    }

    @Override
    public Usuario LOGIN(String NICKNAME, String PASSWORD) {
        Usuario US = new Usuario();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareCall("SELECT * FROM USUARIO WHERE NICKNAME = ? AND PASSWORD = ?");
            ps.setString(1, NICKNAME);
            ps.setString(2, PASSWORD);
            rs = ps.executeQuery();
            while(rs.next()){
               US.setId_usuario(rs.getInt(1));
               US.setNickname(rs.getString(2));
               US.setPassword(rs.getString(3));
               US.setRol(rs.getInt(4));
            }
            return US;
        } catch (SQLException e) {
            System.out.println("Error:"+ e);
            return null;
        }
    }

    @Override
    public int CREAR(int DNI, String NOMBRES, String APELLIDOS) {
        Usuario US = new Usuario();
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call CREARUSUARIO(?,?,?,?)}");
            cst.setInt(1, DNI);
            cst.setInt(2, 4);
            cst.setString(3, NOMBRES);
            cst.setString(4, APELLIDOS);
            int x = cst.executeUpdate();
            return x;
        } catch (SQLException e) {
            System.out.println("Error:"+ e);
            return 0;
        }
    }
}
