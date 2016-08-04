/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntitySets;

import Controllers.Session;
import static Controllers.Session.currentUser;
import Entities.User;
import java.io.Serializable;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author Kaashiff Ahamed
 */
public class SetOfUsers<Usr> extends Vector<User> implements Serializable{
    
    
    public void updateBalance(SetOfUsers<Usr> sOu,String uname,float loanamt)
    {
        for(User usr:sOu)
        {
            if(usr.getUserName().equals(uname))
            {
                float balance=usr.getBalance();
                if(usr.isLoanStatus())
                {
                    JOptionPane.showMessageDialog(null,"You already got loan");
                }
                else{
                    usr.setBalance(balance+loanamt);
                    currentUser.setBalance(balance+loanamt);
                    usr.setLoanStatus(true);
                    currentUser.setLoanStatus(true);
                }
                
            }
        }
    }
    
}
