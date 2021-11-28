/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.controllers;

import com.emergentes.dao.HelpersDAO;
import com.emergentes.models.Pet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DRN-PC
 */
@WebServlet(name = "PatientController", urlPatterns = {"/PatientController"})
public class PatientController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action") != null ? request.getParameter("action") : "index";
        HelpersDAO hd = new HelpersDAO();
        int total;
        int mark;
        int a;
        List<Pet> list;
        try {
            switch (action) {
                case "index":
                    a = request.getParameter("a") != null ? Integer.parseInt(request.getParameter("a")) * 10 : 0;                    
                    list = hd.getPaginateFilters(a);
                    total = hd.getTotalPets();
                    total = (int) Math.ceil((total * 1.0) / 10);
                    request.setAttribute("pets", list);
                    request.setAttribute("total", total);  
                    request.setAttribute("b", 1);
                    request.getRequestDispatcher("patient.jsp").forward(request, response);
                    break;
                case "ajax":
                    a = request.getParameter("a") != null ? Integer.parseInt(request.getParameter("a")) * 10 : 0;  
                    mark = -1;
                    String specie = request.getParameter("specie") != null ? request.getParameter("specie") : "";
                    list = hd.getByAyax(specie, a);
                    total = hd.getTotalPetsBySpecie(specie);
                    total = (int) Math.ceil((total * 1.0) / 10);
                    request.setAttribute("pets", list);
                    request.setAttribute("total", total);
                    request.setAttribute("b", -1);
                    request.setAttribute("specie", specie);
                    request.getRequestDispatcher("patient.jsp").forward(request, response);
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
        } catch (Exception ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
