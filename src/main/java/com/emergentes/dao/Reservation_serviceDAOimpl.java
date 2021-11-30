/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.models.Reservation_service;
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
public class Reservation_serviceDAOimpl extends ConexionBD implements Reservation_serviceDAO{

    private static final String SQL_INSERT = "INSERT INTO reservation_service VALUES(null,?,?)";
    private static final String SQL_UPDATE = "UPDATE reservation_service SET reservation_id = ?, service_id = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM reservation_service WHERE id = ?";
    private static final String SQL_GET_BY_ID = "SELECT * FROM reservation_service WHERE id = ?";
    private static final String SQL_GET_ALL = "SELECT * FROM reservation_service";
    
    @Override
    public void insert(Reservation_service reservation_service) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(2, reservation_service.getReservation_id());
            stmt.setInt(3, reservation_service.getService_id());
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
    }

    @Override
    public void update(Reservation_service reservation_service) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);            
            stmt.setInt(1, reservation_service.getReservation_id());
            stmt.setInt(2, reservation_service.getService_id());
            stmt.setInt(3, reservation_service.getId());
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
    public Reservation_service getById(int id) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        Reservation_service res = new Reservation_service();
        ResultSet rs = null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_BY_ID);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                res.setId(rs.getInt("id"));
                res.setReservation_id(rs.getInt("reservation_id"));
                res.setService_id(rs.getInt("service_id"));
            }
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        return res;
    }

    @Override
    public List<Reservation_service> getAll() throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs;
        Reservation_service res;
        List<Reservation_service> list = new ArrayList<>();
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                res= new Reservation_service();
                res.setId(rs.getInt("id"));
                res.setReservation_id(rs.getInt("reservation_id"));
                res.setService_id(rs.getInt("resvice_id"));
                list.add(res);
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
