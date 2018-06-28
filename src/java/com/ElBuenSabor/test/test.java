/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ElBuenSabor.test;

import com.ElBuenSabor.Dao.HistorialDao;
import com.ElBuenSabor.Dao.PedidoDao;
import com.ElBuenSabor.Dao.PersonaDao;
import com.ElBuenSabor.Dao.ProductoDao;
import com.ElBuenSabor.Dao.UsuarioDao;
import com.ElBuenSabor.DaoImp.DetallePedidoDaoImpl;
import com.ElBuenSabor.DaoImp.HistorialDaoImpl;
import com.ElBuenSabor.DaoImp.PedidoDaoImpl;
import com.ElBuenSabor.DaoImp.PersonaDaoImpl;
import com.ElBuenSabor.DaoImp.ProductoDaoImpl;
import com.ElBuenSabor.DaoImp.UsuarioDaoImpl;
import com.ElBuenSabor.Entity.Detalle_Pedido;
import com.ElBuenSabor.Entity.Pedido;
import com.ElBuenSabor.Entity.Persona;
import com.ElBuenSabor.Entity.Producto;
import com.ElBuenSabor.Entity.Usuario;
import com.ElBuenSabor.Util.Conexion;
import com.google.gson.Gson;

/**
 *
 * @author Diego
 */
public class test {
    private static  DetallePedidoDaoImpl dpd = new DetallePedidoDaoImpl();
    private static PersonaDao pe=new PersonaDaoImpl();
    private static ProductoDao pr=new ProductoDaoImpl();
    private static UsuarioDao us=new UsuarioDaoImpl();
    private static HistorialDao h=new HistorialDaoImpl();
    private static PedidoDao pd=new PedidoDaoImpl(); 
    private static Gson gs=new Gson();
    
    public static void main(String[] args) {
        
        //conex();
        //listpe();
        //listpr();
        //crearpro();
        //CrearUsuario();
        //listarHisotrial();
        //listachef();
        //listaPe();
        //listal();
        //friocomosucorazon();
        //listaid();
        edit1();
    }
      
    
    private static void conex() {
		
      if (Conexion.getConexion() != null) {
	System.out.println("TE AMA");
      } else {
	System.out.println("NO TE AMA");	
      } 
    }
    
    private static void listpe(){
        
        System.out.println(us.readAll());
    }
    private static void listpr(){
        
        System.out.println(pr.readAll());
    }
    
    //KEvin
    
    
    private static void crearpro(){
        Producto pt=new Producto(2,"Chaufa",150.0 );
        if (pr.update(pt)>0) {
            System.out.println("GUARDO PE");
        }else{
            System.out.println("NANY?");
        }
    }
    //EDITAR Y CREAR
    
    
    //diego
    
    private static void CrearUsuario(){
        Usuario u=new Usuario("maincra","123",4);
        Persona p=new Persona("Paul","Alcca","sjfklsjflds",12345678,12345678,"paulcitotuchikitomasna@hotmail.com");
        if (us.crearUsuario(u, p)>0) {
            System.out.println("GUARDO PE");
        }else{
            System.out.println("NANY?");
        }
        
        
        
    }

    private static void listarHisotrial() {
        System.out.println(h.readAll());
    }

    private static void listachef() {
       
        System.out.println(gs.toJson(pd.listarChef()));
        
    }
    private static void listaPe() {
       
        System.out.println(gs.toJson(pd.listarPedido()));
        
    }
    
    private static void listal(){
        System.out.println(gs.toJson(pd.listarDetalle(1)));
    }

    private static void friocomosucorazon() {
        System.out.println(gs.toJson(us.COMBO()));
    }

    private static void listaid() {
        System.out.println(gs.toJson(dpd.listarModal(1)));
    }
    
    
    private static void edit(){
        
   
        System.out.println(dpd.estadoEdit(2));
    }
    
       
    private static void edit1(){
        
   
        System.out.println(dpd.estadoEdit2(1));
    }

}
