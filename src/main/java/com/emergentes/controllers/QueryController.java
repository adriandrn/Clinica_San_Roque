package com.emergentes.controllers;

import com.emergentes.dao.QueryDAOimpl;
import com.emergentes.models.Query;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "QueryController", urlPatterns = {"/QueryController"})
public class QueryController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action") != null ? request.getParameter("action") : "index";
        QueryDAOimpl queryDao = new QueryDAOimpl();
        List<Query> queries = new ArrayList<>();
        try{
            switch(action){
            case "index":
                queries = queryDao.getAll();
                request.setAttribute("queries",queries);
                request.getRequestDispatcher("queries.jsp").forward(request, response);
                break;
            default:
                break;
        }
        }catch(Exception ex){
            ex.printStackTrace(System.out);
        }
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action") != null ? request.getParameter("action") : "";
        QueryDAOimpl queryDao = new QueryDAOimpl();
        Query query = new Query();
        int i;
        try{
            switch(action){
            case "store":
                System.out.println("Llega store");
                String description = request.getParameter("description");
                int user_id = Integer.parseInt(request.getParameter("user_id"));
                System.out.println(request.getParameter("description"));
                System.out.println(request.getParameter("user_id"));
                query.setDescription(description);
                query.setUser_id(user_id);
                i = queryDao.insert(query);
                System.out.println(i);
                response.sendRedirect("QueryController");
                            
                
                break;
            default:
                break;
            }
        }catch(Exception ex){
            ex.printStackTrace(System.out);
        }        
       
    }
}
