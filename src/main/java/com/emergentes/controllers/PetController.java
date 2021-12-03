/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.emergentes.controllers;

import com.emergentes.dao.PetDAO;
import com.emergentes.dao.PetDAOimpl;
import com.emergentes.models.Pet;
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
@WebServlet(name = "PetController", urlPatterns = {"/PetController"})
public class PetController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            PetDAO pdao = new PetDAOimpl();
            int id;
            Pet p = new Pet();
            String op = (request.getParameter("op") != null) ? request.getParameter("op") : "view";
            switch (op) {
                case "add":
                    request.setAttribute("pet", p);
                    request.getRequestDispatcher("admin/pet.jsp").forward(request, response);
                    break;
                case "edit":
                    id = Integer.parseInt(request.getParameter("id"));
                    p = pdao.getById(id);
                    request.setAttribute("pet", p);
                    request.getRequestDispatcher("register.jsp").forward(request, response);
                    break;
                case "delete":
                    id = Integer.parseInt(request.getParameter("id"));
                    pdao.delete(id);
                    response.sendRedirect("PetController");
                    break;
                default:
                    List<Pet> list = pdao.getAll();
                    request.setAttribute("pets", list);
                    request.getRequestDispatcher("admin/pet.jsp").forward(request, response);
                    System.out.println("envia lista mascota");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error en el servlet UserController:  " + e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PetDAO pdao = new PetDAOimpl();

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String race = request.getParameter("race");
        String specie = request.getParameter("specie");
        String state = request.getParameter("state");
        int age = Integer.parseInt(request.getParameter("age"));
        String color = request.getParameter("color");

        Pet p = new Pet();
        p.setId(id);
        p.setName(name);
        p.setRace(race);
        p.setSpecie(specie);
        p.setState(state);
        p.setAge(age);
        p.setColor(color);

        if (id == 0) {
            try {
                pdao.insert(p);
                response.sendRedirect("PetController");
            } catch (Exception e) {
                System.out.println("Error al insertar " + e.getMessage());
            }
        } else {
            try {
                pdao.update(p);
                response.sendRedirect("PetController");
            } catch (Exception e) {
                System.out.println("Error al actualizar " + e.getMessage());
            }
        }
    }
}
