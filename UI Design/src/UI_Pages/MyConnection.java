/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UI_Pages;
import java.sql.*;
/**
 *
 * @author Windows
 */
public class MyConnection {
    public static Connection getConnection(){
        Connection con =null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/filemanagementdb","root","salifu");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }
}
