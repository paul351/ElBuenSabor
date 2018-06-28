/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ElBuenSabor.DaoImp;

import com.ElBuenSabor.Dao.PedidoDao;
import com.ElBuenSabor.Entity.Pedido;
import com.ElBuenSabor.Util.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Diego
 */
public class PedidoDaoImpl implements PedidoDao {
    
    private CallableStatement cst;
    private ResultSet rs;
    private Connection cx;

    @Override
    public List<Map<String, ?>> listarChef() {
       List<Map<String, ?>> ret = new ArrayList<>();
        Map<String,Object> datos = null;
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call LISTACHEF()}");
            rs = cst.executeQuery();
            while (rs.next()) {
                datos = new HashMap<>();
                datos.put("ID_PEDIDO", rs.getInt(1));
                datos.put("DNI", rs.getInt(2));
                
                ret.add(datos);
            }
        } catch (SQLException e) {
            System.out.println("Error:" + e);
        }
        return ret;
     }

    @Override
    public List<Map<String, ?>> listarPedido() {

        List<Map<String, ?>> ret = new ArrayList<>();
        Map<String,Object> datos = null;
        try{
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call LISTAVENTAS()}");
            rs = cst.executeQuery();
            while (rs.next()) {
                
                datos = new HashMap<>();
                datos.put("ID_PEDIDO",rs.getInt(1));
                datos.put("NOMBRE", rs.getString(2));
                datos.put("APELLIDO", rs.getString(3));
                datos.put("DNI", rs.getInt(4));
                datos.put("FECHA", rs.getString(5));
                ret.add(datos);
                
            }
        }catch (SQLException e) {
            System.out.println("Error:" + e);
        }
        return ret;


    }

    @Override
    public List<Map<String, ?>> listarDetalle(int id) {

              List<Map<String, ?>> ret = new ArrayList<>();
        Map<String,Object> datos = null;
        try{
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call LISTAPEDIDO2(?)}");
            cst.setInt(1, id);
            rs = cst.executeQuery();
            while (rs.next()) {
                
                datos = new HashMap<>();
                
                datos.put("NOMBRE", rs.getString(1));
                datos.put("PRECIO", rs.getString(2));
                datos.put("CANTIDAD", rs.getInt(3));
                ret.add(datos);
                
            }
        }catch (SQLException e) {
            System.out.println("Error:" + e);
        }
        return ret;



    }

    @Override
    public Pedido listarIdPedido(int key) {
       Pedido P = new Pedido();
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call LISTARIDPEDIDO(?)}");
            cst.setInt(1, key);
            rs = cst.executeQuery();
            while(rs.next()){
               P.setId_pedido(rs.getInt("ID_PEDIDO"));
               P.setEstado(rs.getInt("ESTADO"));
            }
        } catch (SQLException e) {
            System.out.println("Error:"+ e);
        }
        //call searchId(4);
        return P; 
    }

    
  
    
  
    
    
}
