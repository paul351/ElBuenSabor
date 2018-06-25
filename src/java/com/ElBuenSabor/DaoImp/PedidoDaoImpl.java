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
                datos.put("DNI", rs.getString(2));
                
                ret.add(datos);
            }
        } catch (SQLException e) {
            System.out.println("Error:" + e);
        }
        return ret;
     }
    
  
    
    
}
