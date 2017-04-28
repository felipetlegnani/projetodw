/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetodw.controler;

import Entidades.Cadastro;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author felipetarniowicz
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

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

        try (PrintWriter out = response.getWriter()) {
            String email = request.getParameter("email");
            String nome = request.getParameter("nome");
            String senha = request.getParameter("senha");
            List<Cadastro> lista = new ArrayList();
            lista = a(nome, email, senha);
            
            String aux[];
            aux = String.valueOf(lista).split(";");
            

//            
//               List<String> listaCadastro = new ArrayList();
//
//                        listaCadastro.add(String.valueOf(cadastro.getEmail()));
//                        listaCadastro.add(String.valueOf(cadastro.getNome()));
//                        listaCadastro.add(String.valueOf(cadastro.getSenha()));
//
//                        controle.inserir(cadastro);
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Senha: " + aux[0].substring(1) + "</h1>");
            out.println("<h1> Nome: " + aux[1] + "</h1>");
            out.println("<h1> Email: " + aux[2].substring(0, aux[2].length()-1) + "</h1>");
            out.println("</body>");
            out.println("</html>");

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

    public List<Cadastro> a(String nome, String email, String senha) {
        DAOs.DAOCadastro controle = new DAOs.DAOCadastro();
        List<Cadastro> lista = new ArrayList();
        Cadastro cadastro = new Cadastro();

        List<String> listaCadastro = new ArrayList();

//        listaCadastro.add(cadastro.getNome());
//        listaCadastro.add(cadastro.getEmail());
//        listaCadastro.add(String.valueOf(cadastro.getSenha()));
        if (nome != null) {
            cadastro.setNome(nome);
        }

        if (email != null) {
            cadastro.setEmail(email);
        }

        if (senha != null) {
            cadastro.setSenha(Integer.valueOf(senha));
        }

        controle.inserir(cadastro);
        lista = controle.listById(Integer.valueOf(senha));
        return lista;
    }
}//
