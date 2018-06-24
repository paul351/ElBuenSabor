/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ElBuenSabor.DaoImp;

import com.ElBuenSabor.Dao.PersonaDao;
import com.ElBuenSabor.Entity.Persona;
import com.ElBuenSabor.Util.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class PersonaDaoImpl implements PersonaDao{
    
    private CallableStatement cst;
    private ResultSet rs;
    private Connection cx;
    

    @Override
    public int create(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Persona p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Persona> readAll(String dni) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Persona> readAll() {
       List<Persona> datos = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call LISTARPERSONA()}");
            rs = cst.executeQuery();
            while(rs.next()){
        
                Persona p = new Persona();
                p.setId_persona(rs.getInt("ID_PERSONA"));
                p.setNombre(rs.getString("NOMBRE"));
                p.setApellido(rs.getString("APELLIDO"));
                p.setCorreo(rs.getString("CORREO"));
                p.setDni(rs.getInt("DNI"));
                p.setTelefono(rs.getInt("TELEFONO"));
                p.setDireccion(rs.getString("DIRECCION"));
                p.setUsuario_id_usuario(rs.getInt("USUARIO_ID_USUARIO"));
                datos.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return datos;
    }
    }
    
