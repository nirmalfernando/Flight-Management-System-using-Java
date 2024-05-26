/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.TravelModel;
import view.SignedForm;
import view.user;

/**
 *
 * @author User
 */
public class User {
    Connection conn = controller.TravelController.getConnection();
    
    public void insert(TravelModel tm){
        try{
            PreparedStatement ps = conn.prepareStatement("insert into register(UserName, Password) values (?,?)"); 
            
            ps.setString(1, tm.getUserName());
            ps.setString(2, tm.getPassword());
            
            int status = ps.executeUpdate();
            if (status == 1) {
                System.out.println("Sent!!");
            }
        }
        catch(Exception e){
            System.err.println(e.toString());
        }
    }
    
    public void check(TravelModel tm){
        try{
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM register WHERE UserName = ? AND Password = ?");
            ps.setString(1, tm.getUserName());
            ps.setString(2, tm.getPassword());
            
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Login successful!");
                    user.username = tm.getUserName();
                } else {
                    System.out.println("Invalid login credentials!");
                }
            }
        }
        catch (Exception e){
            System.err.println(e.toString());
        }
    }
}
