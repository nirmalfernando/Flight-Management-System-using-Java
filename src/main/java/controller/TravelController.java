/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import model.TravelModel;
import view.CreateAccount;

/**
 *
 * @author MSii
 */
public class TravelController {
    private static Connection conn;
    
    public static Connection getConnection()
    {
        if(conn == null){
            try {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/travel?useSSL=false","root","");
		
		}catch(Exception e) {
			System.err.println(e.toString());
		}
        }
        return conn;
    }

    
}
