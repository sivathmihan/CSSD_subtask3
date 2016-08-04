/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;

/**
 *
 * @author Jeya1993
 */
public class vehicle implements Serializable{
    
    
    
    private String vehiID;
    private String vehicleName;
    private String vehiNo;
    private String vehiModel;
    private String date;   
    private static int busCount=1;
    private static int trainCount=1;
    private static int tramCount=1;
    private String type;

    /**
     * @return the busCount
     */
    public static int getBusCount() {
        return busCount;
    }

    /**
     * @param aBusCount the busCount to set
     */
    public static void setBusCount(int aBusCount) {
        busCount = aBusCount;
    }

    /**
     * @return the trainCount
     */
    public static int getTrainCount() {
        return trainCount;
    }

    /**
     * @param aTrainCount the trainCount to set
     */
    public static void setTrainCount(int aTrainCount) {
        trainCount = aTrainCount;
    }

    /**
     * @return the tramCount
     */
    public static int getTramCount() {
        return tramCount;
    }

    /**
     * @param aTramCount the tramCount to set
     */
    public static void setTramCount(int aTramCount) {
        tramCount = aTramCount;
    }


    
   
    
    
    public vehicle(String name,String veNo,String veModel,String dat,int type){
        if(type==1)
        {
            this.vehiID=newVehicleID(type);
            this.busCount++;
            this.type="bus";
        }
        if(type==2){
            this.vehiID=newVehicleID(type);
            this.trainCount++;
            this.type="train";
        }
        if(type==3){
            this.vehiID=newVehicleID(type);
            this.tramCount++;
            this.type="tram";
        }
      
        this.vehicleName=name;
        this.vehiNo=veNo;
        this.vehiModel=veModel;
        this.date=dat;
 
            }
    
    
    private String newVehicleID(int type){
        int count=0;
        String prefix="";
        
        if(type==1){
            count=this.busCount;
            prefix="BUS";
        }
        else if(type==2){
            count=this.trainCount;
            prefix="TRN";
        }
        else if(type==3){
            count=this.tramCount;
            prefix="TRM";
        }
        
        String id="";
        String countstr=Integer.toString(count);
        int passCountl=countstr.length();
        String zeroes="";
        int len=7-passCountl;
        for (int i=0;i<len;i++)
        {
            zeroes+="0";
        }
        id=prefix+zeroes+countstr;
        
        return id;
    }

    /**
     * @return the vehiID
     */
    public String getVehiID() {
        return vehiID;
    }

    /**
     * @param vehiID the vehiID to set
     */
    public void setVehiID(String vehiID) {
        this.vehiID = vehiID;
    }

    /**
     * @return the vehicleName
     */
    public String getVehicleName() {
        return vehicleName;
    }

    /**
     * @param vehicleName the vehicleName to set
     */
    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    /**
     * @return the vehiNo
     */
    public String getVehiNo() {
        return vehiNo;
    }

    /**
     * @param vehiNo the vehiNo to set
     */
    public void setVehiNo(String vehiNo) {
        this.vehiNo = vehiNo;
    }

    /**
     * @return the vehiModel
     */
    public String getVehiModel() {
        return vehiModel;
    }

    /**
     * @param vehiModel the vehiModel to set
     */
    public void setVehiModel(String vehiModel) {
        this.vehiModel = vehiModel;
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

    
}


