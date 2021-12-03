
package com.emergentes.utiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.dbcp2.BasicDataSource;

public class ConexionBD {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bd_pets";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";
    private static BasicDataSource getDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName(JDBC_DRIVER);
        ds.setUrl(JDBC_URL);
        ds.setUsername(JDBC_USER);
        ds.setPassword(JDBC_PASSWORD);
        return ds;
    }
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
    }
    public static void close(ResultSet rs){
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void close(PreparedStatement stmt){
        try {
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void close(Connection conn){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
