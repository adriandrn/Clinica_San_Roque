
package com.emergentes.controllers;

import com.emergentes.dao.UserDAO;
import com.emergentes.dao.UserDAOimpl;
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
@WebServlet(name = "UserController", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            UserDAO udao = new UserDAOimpl();
            int id;
            User u = new User();
            String op = (request.getParameter("op") != null)? request.getParameter("op") : "view";
            switch(op){
                case "add":
                    request.setAttribute("user", u);
                    request.getRequestDispatcher("admin/user.jsp").forward(request, response);
                    break;
                case "edit":
                    id = Integer.parseInt(request.getParameter("id"));
                    u = udao.getById(id);
                    request.setAttribute("user", u);
                    request.getRequestDispatcher("register.jsp").forward(request, response);
                    break;
                case "delete":
                    id = Integer.parseInt(request.getParameter("id"));
                    udao.delete(id);
                    response.sendRedirect("UserController");
                    break;
                default:
                    List<User> list = udao.getAll();
                    request.setAttribute("users",list);
                    request.getRequestDispatcher("admin/user.jsp").forward(request, response);
                    break;
            }
            
            
        } catch (Exception e) {
            System.out.println("Error en el servlet UserController:  "+ e.getMessage());
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        UserDAO udao = new UserDAOimpl();
        
        int id = Integer.parseInt(request.getParameter("id"));
        String ci = request.getParameter("ci");
        String name = request.getParameter("name");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String role = request.getParameter("role");
        
        User u = new User();
        u.setId(id);
        u.setCi(ci);
        u.setName(name);
        u.setAddress(address);
        u.setPhone(phone);
        u.setEmail(email);
        u.setPassword(password);
        u.setRole(role);
        
        if (id == 0) {
            try {
                udao.insert(u);
                response.sendRedirect("UserController");
            } catch (Exception e) {
                System.out.println("Error al insertar "+e.getMessage());
            }
        }else{
            try {
                udao.update(u);
                response.sendRedirect("UserController");
            } catch (Exception e) {
                System.out.println("Error al actualizar "+e.getMessage());
            }
        }
    }
}
