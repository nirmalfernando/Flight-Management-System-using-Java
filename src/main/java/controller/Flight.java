/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.JOptionPane;
import model.TravelModel;
import view.user;

/**
 *
 * @author User
 */
public class Flight {

    Connection conn = controller.TravelController.getConnection();

    public void insert(TravelModel tm) {
        try {
            PreparedStatement ps = conn.prepareStatement("insert into flights(FType, AgeGroup, Class, FromThis, ToThis, FDate, UserName) values (?,?,?,?,?,?,?)");
            ps.setString(1, tm.getFlightType());
            ps.setString(2, tm.getFlightPerson());
            ps.setString(3, tm.getFlightClass());
            ps.setString(4, tm.getFrom());
            ps.setString(5, tm.getTo());

            Date date = tm.getfDate();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            ps.setDate(6, sqlDate);
            ps.setString(7, user.username);
            int status = ps.executeUpdate();

            if (status == 1) {
                System.out.println("Sent!!");
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
