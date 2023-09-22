/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;
import java.sql.Connection;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ushat
 */
public class DBConnection {
    public static Connection connect(){
        Connection conn=null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/stoktakipsistemi?user=postgres&password=");
           // JOptionPane.showMessageDialog(null, "connection success");
        } catch (Exception e){
            
        }
        return conn;
    }
            
    
}
