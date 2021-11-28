/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes.dao;

import com.emergentes.models.Pet;
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
public class PetDAOimpl extends ConexionBD implements PetDAO{
    
    private static final String SQL_INSERT = "INSERT INTO pets VALUES(null,?,?,?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE pets SET user_id = ?, name = ?, race = ?, species = ?, state = ?, age = ?, color = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM pets WHERE id = ?";
    private static final String SQL_GET_BY_ID = "SELECT * FROM pets WHERE id = ?";
    private static final String SQL_GET_ALL = "select p.*, u.name as user_name from pets p left join users u on p.user_id =u.id ;";

    @Override
    public void insert(Pet pet) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, pet.getUser_id());
            stmt.setString(2, pet.getName());
            stmt.setString(3, pet.getRace());
            stmt.setString(4, pet.getSpecie());
            stmt.setString(5, pet.getState());
            stmt.setInt(6, pet.getAge());
            stmt.setString(7, pet.getColor());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
    }

    @Override
    public void update(Pet pet) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, pet.getUser_id());
            stmt.setString(2, pet.getName());
            stmt.setString(3, pet.getRace());
            stmt.setString(4, pet.getSpecie());
            stmt.setString(5, pet.getState());
            stmt.setInt(6, pet.getAge());
            stmt.setString(7, pet.getColor());
            stmt.setInt(8, pet.getId());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
    }

    @Override
    public void delete(int id) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
    }

    @Override
    public Pet getById(int id) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs;
        Pet p = new Pet();
        try {
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_BY_ID);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setRace(rs.getString("race"));
                p.setSpecie(rs.getString("species"));
                p.setState(rs.getString("state"));
                p.setAge(rs.getInt("age"));
                p.setColor(rs.getString("color"));
                p.setPath(rs.getString("path"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        
        return p;
    }

    @Override
    public List<Pet> getAll() throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs;
        Pet p;
        List<Pet> list = new ArrayList<>();
        try {
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                p = new Pet();
                p.setId(rs.getInt("id"));
                p.setUser_id(rs.getInt("user_id"));
                p.setName(rs.getString("name"));
                p.setRace(rs.getString("race"));
                p.setSpecie(rs.getString("species"));
                p.setState(rs.getString("state"));
                p.setId(rs.getInt("age"));
                p.setColor(rs.getString("color"));
                p.setPath(rs.getString("path"));
                p.setUser_name(rs.getString("user_name"));
                list.add(p);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        
        return list;
    }
}
