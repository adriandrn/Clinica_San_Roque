/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.models.History;
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
public class HistoryDAOimpl extends ConexionBD implements HistoryDAO{
    
    private static final String SQL_INSERT = "INSERT INTO histories VALUES(null,?,?)";
    private static final String SQL_UPDATE = "UPDATE histories SET user_id = ?, pet_id = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM histories WHERE id = ?";
    private static final String SQL_GET_BY_ID = "SELECT * FROM histories WHERE id = ?";
    private static final String SQL_GET_ALL = "SELECT * FROM histories";

    @Override
    public void insert(History history) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1,history.getUser_id());
            stmt.setInt(2, history.getPet_id());
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
    }

    @Override
    public void update(History history) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1,history.getUser_id());
            stmt.setInt(2, history.getPet_id());
            stmt.setInt(3, history.getId());
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
            stmt.setInt(1,id);
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
    }

    @Override
    public History getById(int id) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs = null;
        History h = new History();
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_BY_ID);
            stmt.setInt(3, id);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                h.setId(rs.getInt("id"));
                h.setUser_id(rs.getInt("user_id"));
                h.setPet_id(rs.getInt("pet_id"));
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
    public List<History> getAll() throws Exception {
        Connection conn=null;
        PreparedStatement stmt = null ;
        ResultSet rs;
        History h;
        List<History> list = new  ArrayList<>();
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                h = new History();
                h.setId(rs.getInt("id"));
                h.setUser_id(rs.getInt("user_id"));
                h.setPet_id(rs.getInt("pet_id"));
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
