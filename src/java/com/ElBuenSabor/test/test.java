/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ElBuenSabor.test;

import com.ElBuenSabor.Dao.PersonaDao;
import com.ElBuenSabor.Dao.ProductoDao;
import com.ElBuenSabor.Dao.UsuarioDao;
import com.ElBuenSabor.DaoImp.PersonaDaoImpl;
import com.ElBuenSabor.DaoImp.ProductoDaoImpl;
import com.ElBuenSabor.DaoImp.UsuarioDaoImpl;
import com.ElBuenSabor.Entity.Persona;
import com.ElBuenSabor.Entity.Producto;
import com.ElBuenSabor.Entity.Usuario;
import com.ElBuenSabor.Util.Conexion;

/**
 *
 * @author Diego
 */
public class test {
    private static PersonaDao pe=new PersonaDaoImpl();
    private static ProductoDao pr=new ProductoDaoImpl();
    private static UsuarioDao us=new UsuarioDaoImpl();
    public static void main(String[] args) {
        //conex();
        //listpe();
        //listpr();
        //crearpro();
        CrearUsuario();
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
    
}
