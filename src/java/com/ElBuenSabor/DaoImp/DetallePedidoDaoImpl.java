
package com.ElBuenSabor.DaoImp;

import com.ElBuenSabor.Dao.Detalle_PedidoDao;
import com.ElBuenSabor.Entity.Detalle_Pedido;
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


public class DetallePedidoDaoImpl implements Detalle_PedidoDao{

    
    private CallableStatement cst;
    private ResultSet rs;
    private Connection cx;

    @Override
    public List<Map<String, ?>> listarModal(int id) {
      
    List<Map<String, ?>> ret = new ArrayList<>();
        Map<String,Object> datos = null;
        try{
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call LISTAMODALCHEF(?)}");
            cst.setInt(1, id);
            rs = cst.executeQuery();
            while (rs.next()) {
                
                datos = new HashMap<>();
                
                datos.put("NOMBRE", rs.getString(1));
                
                datos.put("CANTIDAD", rs.getInt(2));
                ret.add(datos);
                
            }
        }catch (SQLException e) {
            System.out.println("Error:" + e);
        }
        return ret;
    }

    @Override
    public int estadoEdit(int id) {
       
        int x = 0;
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call editarEstadoA2(?)}");
            cst.setInt(1, id);
            x = cst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
        return x;
    }  

    @Override
    public int estadoEdit2(int id) {
   int x = 0;
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call EDITARESTADO0(?)}");
            cst.setInt(1, id);
            x = cst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
        return x;

    }
    }
 
  

