/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ElBuenSabor.Controller;

import com.ElBuenSabor.Dao.UsuarioDao;
import com.ElBuenSabor.DaoImp.UsuarioDaoImpl;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jhorman Rus
 */
@WebServlet(name = "UsuarioController", urlPatterns = {"/Usuario"})
public class UsuarioController extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    private UsuarioDao UDAO = new UsuarioDaoImpl();
    private Gson GSON = new Gson();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        int OP = Integer.parseInt(request.getParameter("OPC"));
        switch(OP){
            case 1:
                out.println(GSON.toJson(UDAO.LOGIN(request.getParameter("NICKNAME"), request.getParameter("PASSWORD"))));
                    break;
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}