/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.emergentes.controllers;

import com.emergentes.dao.ServiceDAO;
import com.emergentes.dao.ServiceDAOimpl;
import com.emergentes.models.Service;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ServiceController", urlPatterns = {"/ServiceController"})
public class ServiceController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            ServiceDAO sdao = new ServiceDAOimpl();
            int id;
            Service s = new Service();
            String op = (request.getParameter("op") != null) ? request.getParameter("op") : "view";
            switch (op) {
                case "add":
                    request.setAttribute("service", s);
                    request.getRequestDispatcher("admin/service.jsp").forward(request, response);
                    break;
                case "edit":
                    id = Integer.parseInt(request.getParameter("id"));
                    s = sdao.getById(id);
                    request.setAttribute("service", s);
                    request.getRequestDispatcher("register.jsp").forward(request, response);
                    break;
                case "delete":
                    id = Integer.parseInt(request.getParameter("id"));
                    sdao.delete(id);
                    response.sendRedirect("ServiceController");
                    break;
                default:
                    List<Service> list = sdao.getAll();
                    request.setAttribute("services", list);
                    request.getRequestDispatcher("admin/service.jsp").forward(request, response);
                    System.out.println("hola");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error en el servlet UserController:  " + e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServiceDAO sdao = new ServiceDAOimpl();

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        Float coste = Float.parseFloat(request.getParameter("coste"));

        Service s = new Service();
        s.setId(id);
        s.setName(name);
        s.setDescription(description);
        s.setCoste(coste);

        if (id == 0) {
            try {
                sdao.insert(s);
                response.sendRedirect("PetController");
            } catch (Exception e) {
                System.out.println("Error al insertar " + e.getMessage());
            }
        } else {
            try {
                sdao.update(s);
                response.sendRedirect("PetController");
            } catch (Exception e) {
                System.out.println("Error al actualizar " + e.getMessage());
            }
        }
    }

}
