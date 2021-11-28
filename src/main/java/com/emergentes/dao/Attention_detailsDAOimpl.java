/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.models.Attention_details;
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
public class Attention_detailsDAOimpl extends ConexionBD implements Attention_detailsDAO{

    private static final String SQL_INSERT = "INSERT INTO attention_details VALUES(null,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE attention_details SET history_id = ?, reservation_id = ?, diagnosis = ?, description = ?  WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM attention_details WHERE id = ?";
    private static final String SQL_GET_BY_ID = "SELECT * FROM attention_details WHERE id = ?";
    private static final String SQL_GET_ALL = "SELECT * FROM attention_details";
    
    @Override
    public void insert(Attention_details attention_details) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1,attention_details.getHistory_id());
            stmt.setInt(2, attention_details.getReservation_id());
            stmt.setString(3, attention_details.getDiagnosis());
            stmt.setString(4, attention_details.getDescription());
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
    }

    @Override
    public void update(Attention_details attention_details) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1,attention_details.getHistory_id());
            stmt.setInt(2, attention_details.getReservation_id());
            stmt.setString(3, attention_details.getDiagnosis());
            stmt.setString(4, attention_details.getDescription());
            stmt.setInt(5, attention_details.getId());
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
    public Attention_details getById(int id) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        Attention_details ad = new Attention_details();
        ResultSet rs = null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_BY_ID);
            stmt.setInt(1,id);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                ad.setId(rs.getInt("id"));
                ad.setHistory_id(rs.getInt("history_id"));
                ad.setReservation_id(rs.getInt("reservation_id"));
                ad.setDiagnosis(rs.getString("diagnosis"));
                ad.setDescription(rs.getString("description"));
            }
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        
        return ad;
    }

    @Override
    public List<Attention_details> getAll() throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        Attention_details ad ;
        ResultSet rs ;
        List<Attention_details> list = new ArrayList<>();
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) {   
                ad = new Attention_details();   
                
                ad.setId(rs.getInt("id"));
                ad.setHistory_id(rs.getInt("history_id"));
                ad.setReservation_id(rs.getInt("reservation_id"));
                ad.setDiagnosis(rs.getString("diagnosis"));
                ad.setDescription(rs.getString("description"));
                
                list.add(ad);
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
