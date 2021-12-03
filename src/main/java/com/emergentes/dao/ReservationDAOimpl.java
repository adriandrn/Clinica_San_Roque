/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.models.Reservation;
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
public class ReservationDAOimpl extends ConexionBD implements ReservationDAO{
    
    private static final String SQL_INSERT = "INSERT INTO reservations VALUES(null,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE reservations SET reservation_date = ?, user_id = ?, hour_id = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM reservations WHERE id = ?";
    private static final String SQL_GET_BY_ID = "SELECT * FROM reservations WHERE id = ?";
    private static final String SQL_GET_ALL = "SELECT * FROM reservations";
            
    @Override
    public void insert(Reservation reservation) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, reservation.getReservation_date());
            stmt.setInt(2, reservation.getUser_id());
            stmt.setInt(3, reservation.getHour_id());
            stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
    }

    @Override
    public void update(Reservation reservation) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, reservation.getReservation_date());
            stmt.setInt(2, reservation.getUser_id());
            stmt.setInt(3, reservation.getHour_id());
            stmt.setInt(4, reservation.getId());
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
    public Reservation getById(int id) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs = null;
        Reservation r = new Reservation();
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_BY_ID);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                r.setId(rs.getInt("id"));
                r.setReservation_date(rs.getString("reservation_date"));
                r.setUser_id(rs.getInt("user_id"));
                r.setHour_id(rs.getInt("hour_id"));
            }
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        
        return r;
    }

    @Override
    public List<Reservation> getAll() throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs;
        Reservation r;
        List<Reservation> list  = new ArrayList<>();
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                r = new Reservation();
                r.setId(rs.getInt("id"));
                r.setReservation_date(rs.getString("reservation_date"));
                r.setUser_id(rs.getInt("user_id"));
                r.setHour_id(rs.getInt("hour_id"));
                list.add(r);
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
