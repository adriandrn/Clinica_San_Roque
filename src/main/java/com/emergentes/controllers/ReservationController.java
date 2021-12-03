/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.emergentes.controllers;

import com.emergentes.dao.HourDAO;
import com.emergentes.dao.HourDAOimpl;
import com.emergentes.dao.ReservationDAO;
import com.emergentes.dao.ReservationDAOimpl;
import com.emergentes.dao.ServiceDAO;
import com.emergentes.dao.ServiceDAOimpl;
import com.emergentes.models.Hour;
import com.emergentes.models.Reservation;
import com.emergentes.models.Service;
import java.io.IOException;
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
@WebServlet(name = "ReservationController", urlPatterns = {"/ReservationController"})
public class ReservationController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            //HourDAO h = new HourDAOimpl();
            ServiceDAO s = new ServiceDAOimpl();
            List<Service> lists = s.getAll();
            //String op = (request.getParameter("op") != null)? request.getParameter("op"): "";
            HourDAO h = new HourDAOimpl();
            List<Hour> listh = h.getAll();

            request.setAttribute("services", lists);
            request.setAttribute("hours", listh);
            request.getRequestDispatcher("reservation.jsp").forward(request, response);

        } catch (Exception e) {
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ReservationDAO resdao = new ReservationDAOimpl();
        Reservation res = new Reservation();
        res.setReservation_date(request.getParameter("reservation_date"));
        res.setUser_id(Integer.parseInt(request.getParameter("user_id")));
        res.setHour_id(Integer.parseInt(request.getParameter("hour_id")));
        
        try {
            resdao.insert(res);
            response.sendRedirect("ReservationController");
        } catch (Exception ex) {
            Logger.getLogger(ReservationController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
