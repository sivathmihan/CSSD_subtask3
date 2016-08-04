/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;

/**
 *
 * @author Kaashiff Ahamed
 */
public class User implements Serializable{
      
    private String userID;
    private String userFulName;
    private String userName;
    private String password;
    private String eMail;
    private String address;
    private String mobileNumber;
    private String gender;
    private float balance;
    private float loanAmount;
    private boolean loanStatus;
    public static int passCount=1;
    public static int driverCount=1;
    public static int insCount=1;
    private String type;

    
    public User(String name,String uname,String pw,String email,String address,String mobile,String gender,int type){
        if(type==0){
            this.userID=newPassengerID(type);
            this.type="admin";
        }
        if(type==1)
        {
            this.userID=newPassengerID(type);
            passCount++;
            this.type="passenger";
        }
        if(type==2){
            this.userID=newPassengerID(type);
            driverCount++;
            this.type="driver";
        }
        if(type==3){
            this.userID=newPassengerID(type);
            insCount++;
            this.type="inspector";
        }
      
        this.userFulName=name;
        this.userName=uname;
        this.password=pw;
        this.eMail=email;
        this.mobileNumber=mobile;
        this.address=address;
        this.gender=gender;
        this.balance=0;
        this.loanAmount=50;
        this.loanStatus=false;
            }

    
    
    private String newPassengerID(int type){
        int count=0;
        String prefix="";
        
        if(type==1){
            count=passCount;
            prefix="PAS";
        }
        else if(type==2){
            count=driverCount;
            prefix="DRI";
        }
        else if(type==3){
            count=insCount;
            prefix="INS";
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
        if(type==0){
            id="ADM0000000";
        }
        return id;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the userFulName
     */
    public String getUserFulName() {
        return userFulName;
    }

    /**
     * @param userFulName the userFulName to set
     */
    public void setUserFulName(String userFulName) {
        this.userFulName = userFulName;
    }

    /**
     * @return the userName
     */
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
     * @return the eMail
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * @param eMail the eMail to set
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the mobileNumber
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * @param mobileNumber the mobileNumber to set
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the balance
     */
    public float getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

    /**
     * @return the loanAmount
     */
    public float getLoanAmount() {
        return loanAmount;
    }

    /**
     * @param loanAmount the loanAmount to set
     */
    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * @return the loanStatus
     */
    public boolean isLoanStatus() {
        return loanStatus;
    }

    /**
     * @param loanStatus the loanStatus to set
     */
    public void setLoanStatus(boolean loanStatus) {
        this.loanStatus = loanStatus;
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
    
    public boolean login(String uname,String pass)
    {
        return(this.userName.equals(uname) && this.password.equals(pass));
    }
    
}
