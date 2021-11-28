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
    private static final String SQL_GET_PAGINATE_FILTERS = "select p.*, u.name as user_name from pets p left join users u on p.user_id =u.id limit ?, 10;";
    private static final String SQL_COUNT_PETS = "select count(*) as total from pets;";
    private static final String SQL_GET_BY_AJAX = "select p.*, u.name as user_name from pets p left join users u on p.user_id =u.id where p.specie = ? limit ?, 10;";
    private static final String SQL_COUNT_PETS_SPECIE = "select count(*) as total from pets where specie = ?;";

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
                p.setAge(rs.getInt("age"));
                p.setColor(rs.getString("color"));
                p.setPath(rs.getString("path"));
                p.setUser_name(rs.getString("user_name"));
                list.add(p);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }

        return list;
    }

    public List<Pet> getPaginateFilters(int a) throws Exception {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs;
        Pet p;
        List<Pet> list = new ArrayList<>();
        try {
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_PAGINATE_FILTERS);
            stmt.setInt(1, a);
            rs = stmt.executeQuery();

            while (rs.next()) {
                p = new Pet();
                p.setId(rs.getInt("id"));
                p.setUser_id(rs.getInt("user_id"));
                p.setName(rs.getString("name"));
                p.setRace(rs.getString("race"));
                p.setSpecie(rs.getString("specie"));
                p.setState(rs.getString("state"));
                p.setAge(rs.getInt("age"));
                p.setColor(rs.getString("color"));
                p.setPath(rs.getString("path"));
                p.setUser_name(rs.getString("user_name"));
                list.add(p);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }

        return list;
    }

    public int getTotalPets() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs;
        int total = 0;
        try {
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_COUNT_PETS);
            rs = stmt.executeQuery();
            //total pets
            if (rs.next()) {
                total = rs.getInt("total");
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }

        return total;
    }

    public int getTotalPetsBySpecie(String specie) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs;
        int total = 0;
        try {
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_COUNT_PETS_SPECIE);
            stmt.setString(1, specie);
            rs = stmt.executeQuery();
            //total pets
            if (rs.next()) {
                total = rs.getInt("total");
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }

        return total;
    }

    public List<Pet> getByAyax(String specie, int a) throws Exception {
        int aa = a;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs;
        Pet p;
        List<Pet> list = new ArrayList<>();
        try {
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_BY_AJAX);
            stmt.setString(1, specie);
            stmt.setInt(2, aa);
            rs = stmt.executeQuery();
            while (rs.next()) {
                p = new Pet();
                p.setId(rs.getInt("id"));
                p.setUser_id(rs.getInt("user_id"));
                p.setName(rs.getString("name"));
                p.setRace(rs.getString("race"));
                p.setSpecie(rs.getString("specie"));
                p.setState(rs.getString("state"));
                p.setAge(rs.getInt("age"));
                p.setColor(rs.getString("color"));
                p.setPath(rs.getString("path"));
                p.setUser_name(rs.getString("user_name"));
                list.add(p);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }

        return list;
    }
}
