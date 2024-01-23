/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author acer
 */
public class KoneksiDB {
    Connection cn;

    public static Connection BukaKoneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            
            JOptionPane.showMessageDialog(null, "Koneksi ke database berhasil!");

            return cn;
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public static void main(String[] args) {
        
        Connection connection = BukaKoneksi();
        
    }
}
