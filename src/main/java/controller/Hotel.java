/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import model.TravelModel;
import view.user;

/**
 *
 * @author User
 */
public class Hotel {
    
    Connection conn = controller.TravelController.getConnection();
    private java.sql.Date Date;
    
    public void insert(TravelModel tm){
        try {
            PreparedStatement ps = conn.prepareStatement("insert into hotel(Location,HDate,Type,UserName) values (?,?,?,?)");

            ps.setString(1, tm.getLocation());
            Date date = tm.gethDate();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            ps.setDate(2, sqlDate);
            ps.setString(3, tm.getType());
            ps.setString(4, user.username);

            int status = ps.executeUpdate();

            if (status == 1) {
                System.out.println("Sent!!");
            }

        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
