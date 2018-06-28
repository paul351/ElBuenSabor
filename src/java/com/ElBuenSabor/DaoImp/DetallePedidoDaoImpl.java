
package com.ElBuenSabor.DaoImp;

import com.ElBuenSabor.Dao.Detalle_PedidoDao;
import com.ElBuenSabor.Entity.Detalle_Pedido;
import com.ElBuenSabor.Util.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DetallePedidoDaoImpl implements Detalle_PedidoDao{

    
    private CallableStatement cst;
    private ResultSet rs;
    private Connection cx;
    
    @Override
    public List<Detalle_Pedido> readAll() {
        
    List<Detalle_Pedido> datos = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            cst = cx.prepareCall("{call listarRol()}");
            rs = cst.executeQuery();
            while(rs.next()){
                Detalle_Pedido dp = new Detalle_Pedido();
                /*dp.setIdr(rs.getInt("idrol"));
                dp.setNomrol(rs.getString("nom_rol"));*/
                datos.add(dp);
            }
        } catch (SQLException e) {
            System.out.println("Error: "+e);
        }
        return datos;
    
    }
    
  
}
