/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.emergentes.controllers;

import com.emergentes.dao.HourDAO;
import com.emergentes.dao.HourDAOimpl;
import com.emergentes.dao.PetDAO;
import com.emergentes.dao.PetDAOimpl;
import com.emergentes.dao.ServiceDAO;
import com.emergentes.dao.ServiceDAOimpl;
import com.emergentes.dao.UserDAO;
import com.emergentes.dao.UserDAOimpl;
import com.emergentes.models.Hour;
import com.emergentes.models.Pet;
import com.emergentes.models.Service;
import com.emergentes.models.User;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DRN-PC
 */
@WebServlet(name = "AdminController", urlPatterns = {"/AdminController"})
public class AdminController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UserDAO user = new UserDAOimpl();
        PetDAO pet = new PetDAOimpl();
        ServiceDAO serv = new ServiceDAOimpl();
        HourDAO hour = new HourDAOimpl();

        try {
            List<User> users = user.getAll();
            List<Pet> pets = pet.getAll();
            List<Service> servs = serv.getAll();
            List<Hour> hours = hour.getAll();
            
            request.setAttribute("users", users);
            request.setAttribute("pets", pets);
            request.setAttribute("services", servs);
            request.setAttribute("hours", hours);
            
            request.getRequestDispatcher("admin/index.jsp").forward(request, response);
        } catch (Exception ex) {
            System.out.println("Error en: "+ex.getMessage());
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
