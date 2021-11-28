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
public class HelpersDAO {
    
    private static final String SQL_GET_ALL = "select p.*, u.name as user_name from pets p left join users u on p.user_id =u.id limit 8;";
    
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
                p.setSpecie(rs.getString("specie"));
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
