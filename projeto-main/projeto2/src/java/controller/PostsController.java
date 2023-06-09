package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Posts;
import model.PostsDAO;

@WebServlet(name = "PostsController", urlPatterns = {"/PostsController"})
public class PostsController extends HttpServlet {
    private int cod;
    private String conteudo;
    private String data;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //Verificar se o código está sendo enviado
        if(request.getParameter("cod") != null) {
            this.cod = Integer.parseInt(request.getParameter("cod"));
        }
        
        //Recebendo dados do formulário de cadastro
        this.conteudo = request.getParameter("conteudo");
        this.data = request.getParameter("data");
        
        try {
            if(request.getParameter("cod") == null) {
                Posts pos = new Posts(
                        this.conteudo, 
                            this.data
                );

                PostsDAO postDAO = new PostsDAO();
                postDAO.insertPosts(pos);
                response.sendRedirect("home.jsp");
            } else {
                Posts pos = new Posts(
                        this.cod,
                 this.conteudo, 
                       this.data
                );

                PostsDAO postDAO = new PostsDAO();
                postDAO.updatePosts(pos);
                response.sendRedirect("home.jsp");
            }
            
        } catch(SQLException | ClassNotFoundException erro) {
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>TipsPoint</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ocorreu algum erro :(</h1>");
            out.println("</body>");
            out.println("</html>");
            }
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