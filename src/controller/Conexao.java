/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author EtecMorato
 */
public class Conexao {
    //Atributos de conexão
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/Supermercado";
    public static final String USR = "root";
    public static final String PSW = "";
    
    //Metódos de conexão
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USR, PSW);
            
        } catch(SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog
            (null, "Erro ao estabelecer conexão" + e.getMessage());
            
            return null;
            
        }
    }
    
    // Close Connection - sobrecarga de métodos
    public static void closeConnection(Connection con){
        try{
            if(con != null){
                con.close();
            }
        
        }catch (SQLException e){
            JOptionPane.showMessageDialog
            (null, "Erro ao fechar conexão" + e.getMessage());
            
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        closeConnection(con);
        try{
            if(stmt != null){
                stmt.close();
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog
            (null, "Erro ao fechar statment " + e.getMessage());
        }
    }
    
    public static void closeConnection (Connection con, PreparedStatement stmt, ResultSet rs){
        closeConnection(con, stmt);
        try {
            if(rs != null){
                rs.close();
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar result set" + e.getMessage());
        }
    }
}
