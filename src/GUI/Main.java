/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controllers.Serialize;
import Entities.User;
import EntitySets.SetOfUsers;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Kaashiff Ahamed
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //addAdmin();
        new OpenWindowAndroid().setVisible(true);
    }
    
    private static void addAdmin(){
        SetOfUsers<User> sOu;
        try{
            sOu = (SetOfUsers)Serialize.deserialize("SetOfUsers.ser");
        }catch(IOException | ClassNotFoundException e)
        {
            sOu = new SetOfUsers();
        }
        
        sOu.add(new User("Administrator", "admin", "poiuytrewq", "","","","",0));
        
            try {
                Serialize.serialize(sOu,"SetOfUsers.ser");
            } catch (IOException ex) {
                Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
