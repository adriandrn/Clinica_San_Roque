/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.emergentes.controllers;

import com.emergentes.dao.HelpersDAO;
import com.emergentes.dao.UserDAO;
import com.emergentes.dao.UserDAOimpl;
import com.emergentes.models.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DRN-PC
 */
@WebServlet(name = "AutenticationController", urlPatterns = {"/AutenticationController"})
public class AutenticationController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession ses = request.getSession();
            String op = request.getParameter("op");
            
            switch(op){
                case "login":
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                    break;
                case "register":
                    request.getRequestDispatcher("register.jsp").forward(request, response);
                    break;
                default:
                    ses.invalidate();
                    response.sendRedirect("HomeController");
            }

            /*if (op.equals("login")) {
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }*/
            System.out.println("Operacion ejecutada con exito ingresando a la opcion: " + op);
        } catch (IOException | ServletException e) {
            System.out.println("Error ------>" + e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            UserDAO user = new UserDAOimpl();
            User usu;

            String ci = request.getParameter("ci");
            String name = request.getParameter("name");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String role = request.getParameter("role");
            String path = "none";

            usu = new User();
            usu.setCi(ci);
            usu.setName(name);
            usu.setAddress(address);
            usu.setPhone(phone);
            usu.setEmail(email);
            usu.setPassword(password);
            usu.setRole(role);
            usu.setPath(path);
            

            if (ci == null) {
                HttpSession ses = request.getSession();
                HelpersDAO h = new HelpersDAO();
                usu = h.getAuth(email, password);
                System.out.println("Has iniciado sesion como: "+usu.getName());
                ses.setAttribute("ses", usu);
                //request.setAttribute("auth", usu);
                //request.getRequestDispatcher("admin/index.jsp").forward(request, response);
                response.sendRedirect("admin/index.jsp");
                
            } else {
                user.insert(usu);
                response.sendRedirect("HomeController");
                System.out.println("Registro insertado con exito");
            }

        } catch (Exception e) {
        }

    }
}
