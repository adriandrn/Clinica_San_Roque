/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.emergentes.controllers;

import com.emergentes.dao.HourDAO;
import com.emergentes.dao.HourDAOimpl;
import com.emergentes.models.Hour;
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
@WebServlet(name = "HourController", urlPatterns = {"/HourController"})
public class HourController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HourDAO hdao = new HourDAOimpl();
            int id;
            Hour h = new Hour();
            String op = (request.getParameter("op") != null) ? request.getParameter("op") : "view";
            switch (op) {
                case "add":
                    request.setAttribute("hour", h);
                    request.getRequestDispatcher("admin/hour.jsp").forward(request, response);
                    break;
                case "edit":
                    id = Integer.parseInt(request.getParameter("id"));
                    h = hdao.getById(id);
                    request.setAttribute("hour", h);
                    request.getRequestDispatcher("register.jsp").forward(request, response);
                    break;
                case "delete":
                    id = Integer.parseInt(request.getParameter("id"));
                    hdao.delete(id);
                    response.sendRedirect("HourController");
                    break;
                default:
                    List<Hour> list = hdao.getAll();
                    request.setAttribute("hours", list);
                    request.getRequestDispatcher("admin/hour.jsp").forward(request, response);
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
        HourDAO hdao = new HourDAOimpl();

        int id = Integer.parseInt(request.getParameter("id"));
        String hour = request.getParameter("hour");

        Hour h = new Hour();
        h.setId(id);
        h.setHour(hour);

        if (id == 0) {
            try {
                hdao.insert(h);
                response.sendRedirect("HourController");
            } catch (Exception e) {
                System.out.println("Error al insertar " + e.getMessage());
            }
        } else {
            try {
                hdao.update(h);
                response.sendRedirect("HourController");
            } catch (Exception e) {
                System.out.println("Error al actualizar " + e.getMessage());
            }
        }
    }
}
