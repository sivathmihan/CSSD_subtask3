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
public class CreditCard implements Serializable{
    
    private long cardNo;
    private String cardName;
    private String expDate;
    private int cVVno;
    private String userID;

    public CreditCard(long cardNo,String cardName,String expDate,int cVVno, String userID)
    {
        this.cardName=cardName;
        this.cardNo=cardNo;
        this.cVVno=cVVno;
        this.expDate=expDate;
        this.userID=userID;
    }
    /**
     * @return the cardNo
     */
    public long getCardNo() {
        return cardNo;
    }

    /**
     * @param cardNo the cardNo to set
     */
    public void setCardNo(long cardNo) {
        this.cardNo = cardNo;
    }

    /**
     * @return the cardName
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * @param cardName the cardName to set
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     * @return the expDate
     */
    public String getExpDate() {
        return expDate;
    }

    /**
     * @param expDate the expDate to set
     */
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    /**
     * @return the cVVno
     */
    public int getcVVno() {
        return cVVno;
    }

    /**
     * @param cVVno the cVVno to set
     */
    public void setcVVno(int cVVno) {
        this.cVVno = cVVno;
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

    
    
    
}
