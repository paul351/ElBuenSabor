/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ElBuenSabor.DaoImp;

import com.ElBuenSabor.Dao.ProductoDao;
import com.ElBuenSabor.Entity.Persona;
import com.ElBuenSabor.Entity.Producto;
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
public class ProductoDaoImpl implements ProductoDao{
    private CallableStatement cst;
    private ResultSet rs;
    private Connection cx;
    @Override
    public int create(Producto p) {
        int x =0;
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call CREARPRODUCTO(?,?)}");
            cst.setString(1, p.getNombre());
            cst.setDouble(2, p.getPrecio());
            x = cst.executeUpdate();
        }catch(SQLException e) {
            System.out.println("Error:"+e);
        }
        return x;
    }

    @Override
    public int update(Producto p) {

            int x = 0;
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call EDITARPRODUCTO(?,?,?)}");
            cst.setInt(1,p.getId_producto());
            cst.setString(2, p.getNombre());
            cst.setDouble(3,p.getPrecio());
            x = cst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
        return x;
    }

    @Override
    public int delete(int id) {

        int x = 0;
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call ELIMINARPRODUCTO(?)}");
            cst.setInt(1,id);
            x = cst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
        return x;

    }

    @Override
    public Producto read(int id) {
              Producto pro = new Producto();
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call IDPRODUCTO(?)}");
            cst.setInt(1, id);
            rs = cst.executeQuery();
            while(rs.next()){
               pro.setId_producto(rs.getInt("ID_PRODUCTO"));
               pro.setNombre(rs.getString( "NOMBRE"));
               pro.setPrecio(rs.getDouble( "PRECIO"));
            }
        } catch (SQLException e) {
            System.out.println("Error:"+ e);
        }
        //call searchId(4);
        return pro; 


    }

    @Override
    public List<Producto> readAll(String nombresss) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Producto> readAll() {
         List<Producto> datos = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call LISTARPRODUCTO()}");
            rs = cst.executeQuery();
            while(rs.next()){
        
                Producto p = new Producto();
                p.setId_producto(rs.getInt("ID_PRODUCTO"));
                p.setNombre(rs.getString("NOMBRE"));
                p.setPrecio(rs.getDouble("PRECIO"));
                datos.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return datos;



    }
    
}
