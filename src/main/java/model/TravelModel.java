/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author MSii
 */
public class TravelModel {

    /**
     * @return the hDate
     */
    public Date gethDate() {
        return hDate;
    }

    /**
     * @param hDate the hDate to set
     */
    public void sethDate(Date hDate) {
        this.hDate = hDate;
    }

    /**
     * @return the fDate
     */
    public Date getfDate() {
        return fDate;
    }

    /**
     * @param fDate the fDate to set
     */
    public void setfDate(Date fDate) {
        this.fDate = fDate;
    }

    /**
     * @return the userName
     */
    private String userName;
    private String password;
    private String location;
    private String type;
    private String flightType;
    private String flightClass;
    private String flightPerson;
    private String from;
    private String to;
    private Date hDate;
    private Date fDate;
    
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the flightType
     */
    public String getFlightType() {
        return flightType;
    }

    /**
     * @param flightType the flightType to set
     */
    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    /**
     * @return the flightClass
     */
    public String getFlightClass() {
        return flightClass;
    }

    /**
     * @param flightClass the flightClass to set
     */
    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    /**
     * @return the flightPerson
     */
    public String getFlightPerson() {
        return flightPerson;
    }

    /**
     * @param flightPerson the flightPerson to set
     */
    public void setFlightPerson(String flightPerson) {
        this.flightPerson = flightPerson;
    }

    /**
     * @return the from
     */
    public String getFrom() {
        return from;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * @return the to
     */
    public String getTo() {
        return to;
    }

    /**
     * @param to the to to set
     */
    public void setTo(String to) {
        this.to = to;
    }
    
}
