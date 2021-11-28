/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.models.Hour;
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
public class HourDAOimpl extends ConexionBD implements HourDAO{
    
    private static final String SQL_INSERT = "INSERT INTO hours VALUES(null,?)";
    private static final String SQL_UPDATE = "UPDATE hours SET hour = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM hours WHERE id = ?";
    private static final String SQL_GET_BY_ID = "SELECT * FROM hours WHERE id = ?";
    private static final String SQL_GET_ALL = "SELECT * FROM hours";

    @Override
    public void insert(Hour hour) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,hour.getHour());
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
    }

    @Override
    public void update(Hour hour) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1,hour.getHour());
            stmt.setInt(2, hour.getId());
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
    public Hour getById(int id) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs = null;
        Hour h = new Hour();
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_BY_ID);
            stmt.setInt(1,id);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                h.setId(rs.getInt("id"));
                h.setHour(rs.getString("hour"));
            }
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        
        return h;
    }

    @Override
    public List<Hour> getAll() throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs;
        Hour h;
        List<Hour> list = new ArrayList<>();
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                h = new Hour();
                h.setId(rs.getInt("id"));
                h.setHour(rs.getString("hour"));
                list.add(h);
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
