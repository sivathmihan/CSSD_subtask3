/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;

/**
 *
 * @author Sivathmihan
 */
public class Routes implements Serializable{
    
    private String from;
    private String to;
    private String vehicalNo;
    private String noOfStops;
    private String driverID;
    private String inspectorID;
    private String date;

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

    /**
     * @return the vehicalNo
     */
    public String getVehicalNo() {
        return vehicalNo;
    }

    /**
     * @param vehicalNo the vehicalNo to set
     */
    public void setVehicalNo(String vehicalNo) {
        this.vehicalNo = vehicalNo;
    }

    /**
     * @return the noOfStops
     */
    public String getNoOfStops() {
        return noOfStops;
    }

    /**
     * @param noOfStops the noOfStops to set
     */
    public void setNoOfStops(String noOfStops) {
        this.noOfStops = noOfStops;
    }

    /**
     * @return the driverID
     */
    public String getDriverID() {
        return driverID;
    }

    /**
     * @param driverID the driverID to set
     */
    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    /**
     * @return the inspectorID
     */
    public String getInspectorID() {
        return inspectorID;
    }

    /**
     * @param inspectorID the inspectorID to set
     */
    public void setInspectorID(String inspectorID) {
        this.inspectorID = inspectorID;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    public Routes(String from, String to, String vehicalNo, String noOfStops, String driverID, String inspectorID, String date) {
        this.from = from;
        this.to = to;
        this.vehicalNo = vehicalNo;
        this.noOfStops = noOfStops;
        this.driverID = driverID;
        this.inspectorID = inspectorID;
        this.date = date;
    }
    
    
}
