/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.models.Query;
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
public class QueryDAOimpl extends ConexionBD implements QueryDAO{
    
    private static final String SQL_INSERT = "INSERT INTO queries VALUES(null,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE queries SET description = ?, query_date =?, user_id = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM queries WHERE id = ?";
    private static final String SQL_GET_BY_ID = "SELECT * FROM queries WHERE id = ?";
    private static final String SQL_GET_ALL = "SELECT * FROM queries";

    @Override
    public void insert(Query query) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1,query.getDescription());
            stmt.setString(2, query.getQuery_date());
            stmt.setInt(3, query.getUser_id());
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
    }

    @Override
    public void update(Query query) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1,query.getDescription());
            stmt.setString(2, query.getQuery_date());
            stmt.setInt(3, query.getUser_id());
            stmt.setInt(4, query.getId());
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
    public Query getById(int id) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs = null;
        Query q = new Query();
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_BY_ID);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                q.setId(rs.getInt("id"));
                q.setDescription(rs.getString("description"));
                q.setQuery_date(rs.getString("query_date"));
                q.setUser_id(rs.getInt("user_id"));
            }
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        
        return q;
    }

    @Override
    public List<Query> getAll() throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs;
        Query q;
        List<Query> list = new ArrayList<>();
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                q = new Query();
                q.setId(rs.getInt("id"));
                q.setDescription(rs.getString("description"));
                q.setQuery_date(rs.getString("query_date"));
                q.setUser_id(rs.getInt("user_id"));
                list.add(q);
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
