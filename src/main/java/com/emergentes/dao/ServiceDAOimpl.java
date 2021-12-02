/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.models.Service;
import com.emergentes.utiles.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DRN-PC
 */
public class ServiceDAOimpl extends ConexionBD implements ServiceDAO{

    private static final String SQL_INSERT = "INSERT INTO services VALUES(null,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE services SET name = ?, description = ?, coste = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM services WHERE id = ?";
    private static final String SQL_GET_BY_ID = "SELECT * FROM services WHERE id = ?";
    private static final String SQL_GET_ALL = "SELECT * FROM services";
    
    @Override
    public void insert(Service service) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, service.getName());
            stmt.setString(2, service.getDescription());
            stmt.setFloat(3, service.getCoste());
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
    }

    @Override
    public void update(Service service) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, service.getName());
            stmt.setString(2, service.getDescription());
            stmt.setFloat(3, service.getCoste());
            stmt.setInt(4, service.getId());
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
    }

    @Override
    public void delete(int id) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
    }

    @Override
    public Service getById(int id) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs = null;
        Service s = new Service();
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_BY_ID);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setDescription(rs.getString("description"));
                s.setCoste(rs.getFloat("coste"));
            }
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        return s;
    }

    @Override
    public List<Service> getAll() throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs;
        Service s;
        List<Service> list = new ArrayList<>();
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                s = new Service();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setDescription(rs.getString("description"));
                s.setCoste(rs.getFloat("coste"));
                list.add(s);
            }
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        return list;
    }
    
}
