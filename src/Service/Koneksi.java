/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author smart user
 */
public class Koneksi {
    Connection con;
    Statement stm;
    
    public void config(){
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/db_toko?useSSL=false","root","");
            stm = con.createStatement();
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi gagal:" + e.getMessage());
        }
    }
}
