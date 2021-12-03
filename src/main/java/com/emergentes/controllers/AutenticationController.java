/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.emergentes.controllers;

import com.emergentes.dao.UserDAO;
import com.emergentes.dao.UserDAOimpl;
import com.emergentes.models.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
        String action = request.getParameter("action")!=null ? request.getParameter("action") : "";
        HttpSession session = request.getSession();

        switch(action){
            case "exit":
                session.invalidate();
                request.setAttribute("message","exit-success");
                request.getRequestDispatcher("HomeController").forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action")!=null ? request.getParameter("action") : "";
        UserDAO userDao = new UserDAOimpl();
        List<String> errors = new ArrayList<>();
        User user = new User();
        HttpSession session = request.getSession();
        String email,password;
        try {
            switch(action){
                case "login":
                    email = request.getParameter("email");
                    password = request.getParameter("password");
                    user = userDao.getEmailResult(email);
                    if(user.getId()==0){
                        errors.add("email");
                    }else if(!user.getPassword().equals(password)){
                        errors.add("password");
                    }

                    if(errors.isEmpty()){
                        session.setAttribute("user",user);
                        //request.setAttribute("message","success");
                        //request.getRequestDispatcher("admin/index.jsp").forward(request, response);
                        response.sendRedirect("HomeController");
                        System.out.println("Login in------------------------------");
                    }else{
                        request.setAttribute("errors",errors);
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                    }                    
                    break;
                case "register":
                    String name = request.getParameter("name");
                    String address = request.getParameter("address");
                    String ci = request.getParameter("ci");
                    String phone = request.getParameter("phone");
                    email = request.getParameter("email");
                    password = request.getParameter("password");
                    
                    user.setName(name);
                    user.setCi(ci);
                    user.setAddress(address);
                    user.setPhone(phone);
                    user.setEmail(email);
                    user.setPassword(password);
                    
                    int i = userDao.insert(user);
                    System.out.println(i);
                    if(i==1){
                        request.setAttribute("message","success");
                        request.getRequestDispatcher("login.jsp").forward(request, response);
                    }else{
                        request.setAttribute("message","reject");
                        request.getRequestDispatcher("register.jsp").forward(request, response);
                    }
                    break;
                default:
                    System.out.println("Default");
                    response.sendRedirect("HomeController");
                    break;
            }
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }
}
