/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author smart user
 */
public class Database {

    private String query;
    private ResultSet rs;
    private Koneksi conn = new Koneksi();

    public void Query(String query) {
        this.query = query;
    }

    public ResultSet resultSet() {
        conn.config();
        try {
            String sql = query;
            rs = conn.stm.executeQuery(sql);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return rs;
    }
//    
//    public int RowCount(){
//        int result = 0;
//        conn.config();
//        try{
//            String sql = query;
//            result = conn.stm.exec
//        }
//    }

    public int AddData() {
        int result = 0;
        conn.config();
        try {
            String sql = query;
            result = conn.stm.executeUpdate(sql);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return result;
    }
}
