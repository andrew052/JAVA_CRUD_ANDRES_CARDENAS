package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Usuario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("entro al doget");
        String a=req.getParameter("accion");

        switch (a) {
            case "regisFace":
            req.getRequestDispatcher("../webapp/views/Facebook/Usuario/regisFace.jsp").forward(req, resp);
                
                break;
                case "regisInsta":
            req.getRequestDispatcher("../webapp/views/Facebook/Usuario/regisIns.jsp").forward(req, resp);
                
                break;
        
            default:
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
    
}
