/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ElBuenSabor.DaoImp;

import com.ElBuenSabor.Dao.HistorialDao;
import com.ElBuenSabor.Entity.Historial;
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
public class HistorialDaoImpl implements HistorialDao{
    
    private CallableStatement cst;
    private ResultSet rs;
    private Connection cx;

    @Override
    public List<Historial> readAll() {
        
        List<Historial> datos = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call LISTARPRODUCTO()}");
            rs = cst.executeQuery();
            while(rs.next()){
        
                Historial h = new Historial();
                h.setId_historial(rs.getInt("ID_PRODUCTO"));
                h.setPrecio(rs.getDouble("NOMBRE"));
                h.setPedido_id_pedido(rs.getInt("PRECIO"));
                datos.add(h);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return datos;

    }
    
}
