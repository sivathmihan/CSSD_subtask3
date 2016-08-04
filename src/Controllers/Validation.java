/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author Kaashiff Ahamed
 */
public class Validation {
    Border br= BorderFactory.createLineBorder(Color.red,2);;
    
    public boolean cardValidation(JTextField txtcardNo)
    {
        String cardNum=txtcardNo.getText();
        if(cardNum.substring(0,1).equalsIgnoreCase("4")&&cardNum.length()==12)
        {
            try
            {
            Long card=Long.parseLong(cardNum);
            return true;
            }
            catch (NumberFormatException e) {
            txtcardNo.setBorder(br);
            return false;
            }
                    
        }
        else if(cardNum.substring(0,1).equalsIgnoreCase("5")&&cardNum.length()==12)
        {
                 try
            {
            int card=Integer.parseInt(cardNum);
            return true;
            }
            catch (NumberFormatException e) {
            txtcardNo.setBorder(br);
            return false;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid Card Number");
        }
        {
        return false;
         }
    }
    public boolean pinCheck(JPasswordField txtpinNo)
    {
        boolean result = false;
       if(txtpinNo.getText().length()==4)
       {
           try{
           int pinNum=Integer.parseInt(txtpinNo.getText());
           result=true;
           }
           catch (NumberFormatException e) {
            txtpinNo.setBorder(br);
            result= false;
            }
               
           }
         return result;    
       }
    public boolean cvvNo(JPasswordField txtcvvNo)
    {
        boolean result = false;
       if(txtcvvNo.getText().length()==3)
       {
           try{
           int cvvNum=Integer.parseInt(txtcvvNo.getText());
           result=true;
           }
           catch (NumberFormatException e) {
            txtcvvNo.setBorder(br);
            result= false;
            }
               
           }
         return result;    
       }
    }
    

