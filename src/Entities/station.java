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
public class station implements Serializable{
    
    
    private String staId;
    private String staName;
    private String date;
    private static int staCount=1;
    private String type;
    
    
    public station(String name,String date,int type){
    
        if(type==1)
        {
            this.staId=newStationID(type);
            this.staCount++;
            this.type="station";
        }    
            this.staName=name;
            this.date=date;
            
    
        }
    
    private String newStationID(int type){
        int count=0;
        String prefix="";
        
        if(type==1){
            count=getStaCount();
            prefix="STA";
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
     * @return the staCount
     */
    public static int getStaCount() {
        return staCount;
    }

    /**
     * @param aStaCount the staCount to set
     */
    public static void setStaCount(int aStaCount) {
        staCount = aStaCount;
    }
    
    

    /**
     * @return the staId
     */
    public String getStaId() {
        return staId;
    }

    /**
     * @param staId the staId to set
     */
    public void setStaId(String staId) {
        this.staId = staId;
    }

    /**
     * @return the staName
     */
    public String getStaName() {
        return staName;
    }

    /**
     * @param staName the staName to set
     */
    public void setStaName(String staName) {
        this.staName = staName;
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
