package com.emergentes.dao;
import com.emergentes.models.User;
import com.emergentes.utiles.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAOimpl extends ConexionBD implements UserDAO{

    private static final String SQL_INSERT = "INSERT INTO users SET ci = ?,name=?,address=?,phone=?,email=?,password=?,role='user',path='empty'";
    private static final String SQL_UPDATE = "UPDATE users SET ci = ?, name = ?, address = ?, phone = ?, email = ?, password = ?, role = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM users WHERE id = ?";
    private static final String SQL_GET_BY_ID = "SELECT * FROM users WHERE id = ?";
    private static final String SQL_GET_ALL = "SELECT * FROM users";
    private static final String SQL_GET_EMAIL = "SELECT * FROM users WHERE email = ?;";
    

    @Override
    public void update(User user) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, user.getCi());
            stmt.setString(2, user.getName());
            stmt.setString(3, user.getAddress());
            stmt.setString(4, user.getPhone());
            stmt.setString(5, user.getEmail());
            stmt.setString(6, user.getPassword());
            stmt.setString(7, user.getRole());
            //stmt.setString(8, user.getPath());
            stmt.setInt(8, user.getId());
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
    public User getById(int id) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs = null;
        User u = new User();
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_BY_ID);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while (rs.next()) {                   
                u.setId(rs.getInt("id"));
                u.setCi(rs.getString("ci"));
                u.setName(rs.getString("name"));
                u.setAddress(rs.getString("address"));
                u.setPhone(rs.getString("phone"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setRole(rs.getString("role"));
                u.setPath(rs.getString("path"));
            }
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        
        return u;
    }

    @Override
    public List<User> getAll() throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs;
        List<User> list = new ArrayList<>();
        User u;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_ALL);
            rs = stmt.executeQuery();
            while (rs.next()) {   
                u = new User();
                u.setId(rs.getInt("id"));
                u.setCi(rs.getString("ci"));
                u.setName(rs.getString("name"));
                u.setAddress(rs.getString("address"));
                u.setPhone(rs.getString("phone"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                u.setRole(rs.getString("role"));
                u.setPath(rs.getString("path"));
                list.add(u);
            }
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        
        return list;
    }
    
    @Override
    public User getEmailResult(String email) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        ResultSet rs = null;
        User user = new User();
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_GET_EMAIL);
            stmt.setString(1, email);
            rs = stmt.executeQuery();
            if(rs.next()){    
                user.setId(rs.getInt("id"));
                user.setCi(rs.getString("ci"));
                user.setName(rs.getString("name"));
                user.setAddress(rs.getString("address"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setPassword(rs.getString("password"));
                user.setRole(rs.getString("role"));
                user.setPath(rs.getString("path"));
            }
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        return user;
    }
    public int insert(User user) throws Exception {
        Connection conn=null;
        PreparedStatement stmt=null;
        int i=0;
        try{
            conn = ConexionBD.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, user.getCi());
            stmt.setString(2, user.getName());
            stmt.setString(3, user.getAddress());
            stmt.setString(4, user.getPhone());
            stmt.setString(5, user.getEmail());
            stmt.setString(6, user.getPassword());
            i = stmt.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }finally{
            ConexionBD.close(stmt);
            ConexionBD.close(conn);
        }
        return i;
    }
}
