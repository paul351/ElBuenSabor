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
/*
    @Override
    public List<Historial> readAll() {
        
        List<Historial> datos = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call HISTORIALDEPEDIDOS()}");
            rs = cst.executeQuery();
            while(rs.next()){
        
                Historial h = new Historial();
                h.setId_historial(rs.getInt("ID_PRODUCTO"));
                h.setPedido_id_pedido(rs.getString("NOMBRE"));
                h.setPrecio(rs.getDouble("PRECIO"));
                datos.add(h);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return datos;

    } */

    @Override
    public int create(Historial h) {

         int x =0;
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call INSERTARHISTORIAL(?,?)}");
            cst.setDouble(1, h.getPrecio());
            cst.setInt(2, h.getPedido_id_pedido());
            x = cst.executeUpdate();
        }catch(SQLException e) {
            System.out.println("Error:"+e);
        }
        return x;
    }

    @Override
    public List<Historial> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
