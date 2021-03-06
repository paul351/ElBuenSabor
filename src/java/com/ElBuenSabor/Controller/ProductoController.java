
package com.ElBuenSabor.Controller;

import com.ElBuenSabor.Dao.HistorialDao;
import com.ElBuenSabor.Dao.PedidoDao;
import com.ElBuenSabor.Dao.ProductoDao;
import com.ElBuenSabor.DaoImp.HistorialDaoImpl;
import com.ElBuenSabor.DaoImp.PedidoDaoImpl;
import com.ElBuenSabor.DaoImp.ProductoDaoImpl;
import com.ElBuenSabor.Entity.Historial;
import com.ElBuenSabor.Entity.Producto;
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
 * @author Diego
 */
@WebServlet(name = "ProductoController", urlPatterns = {"/pc"})
public class ProductoController extends HttpServlet{
 private ProductoDao pr = new ProductoDaoImpl();
 private HistorialDao hd=new HistorialDaoImpl();
 private PedidoDao pd=new PedidoDaoImpl();
    private Gson g = new Gson();
 
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int op = Integer.parseInt(request.getParameter("opc"));
        switch(op){
            case 1: out.println(g.toJson(pr.readAll()));
                    break;
            case 2: out.println(g.toJson(pr.read(Integer.parseInt(request.getParameter("id")))));
                    break;
            case 3: Producto pro = new Producto(request.getParameter("nombre"),Double.parseDouble(request.getParameter("precio"))); 
                    pr.create(pro);
                    break;
            case 4: Producto prod = new Producto(Integer.parseInt(request.getParameter("idproducto")),request.getParameter("nombre"),Double.parseDouble(request.getParameter("precio")));
                    pr.update(prod);
                    break;
            case 5: pr.delete(Integer.parseInt(request.getParameter("id")));
                    break;  
            case 6 :out.println(g.toJson(pd.listarPedido())); 
                    break;
            case 7 :out.println(g.toJson(pd.listarDetalle(Integer.parseInt(request.getParameter("id"))))); 
                    break;        
            case 8: Historial ht=new Historial(Double.parseDouble(request.getParameter("precio")),Integer.parseInt(request.getParameter("id")));
                    hd.create(ht);
                    
                    break;        
                    
                    
                
        }
}
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
