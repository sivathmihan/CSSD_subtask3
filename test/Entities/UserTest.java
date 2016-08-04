/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;


import static Entities.CreditCardTest.deserialize;
import EntitySets.SetOfUsers;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kaashiff Ahamed
 */
public class UserTest {
    
     private static final String FILE_NAME = "testUser.ser";
     private static final SetOfUsers<User> sOu=new SetOfUsers<User>();
     
     static {
             
		sOu.add(new User("Kaashiff", "makma9161", "1234", "makma9161@gmail.com", "Nintavur", "0767150199", "male", 1));
                sOu.add(new User("Siva", "siva", "1234", "siva@quwa.lk", "Kandy", "0770725253", "male", 2));
                sOu.add(new User("Dixon", "dixon", "1234", "dixon@quwa.lk", "Jaffna", "0773157112", "male", 3));
		try {
			Serialize(sOu, FILE_NAME);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
    public UserTest() {
    }
    
    @Test
    public void userTest() {
            
            try {
			int i = 0;
			for (User usr : deserialize(FILE_NAME)) {
                            Assert.assertEquals(usr.getUserID(), sOu.get(i).getUserID());
                            Assert.assertEquals(usr.getUserFulName(),sOu.get(i).getUserFulName());
                            Assert.assertEquals(usr.getUserName(),sOu.get(i).getUserName());
                            Assert.assertEquals(usr.getPassword(),sOu.get(i).getPassword());
                            Assert.assertEquals(usr.getAddress(),sOu.get(i).getAddress());
                            Assert.assertEquals(usr.getMobileNumber(),sOu.get(i).getMobileNumber());
                            Assert.assertEquals(usr.getGender(),sOu.get(i).getGender());
                            Assert.assertEquals(new Float(usr.getBalance()).intValue(),new Float(sOu.get(i).getBalance()).intValue());
                            Assert.assertEquals(new Float(usr.getLoanAmount()).intValue(),new Float(sOu.get(i).getLoanAmount()).intValue());
                           
                         i++;   
            
	}
            }catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        }
    
    @Test(expected = FileNotFoundException.class)
	public void negativeTestCaseForDeserialize() throws ClassNotFoundException,
			IOException {

		deserialize("invalid name");

	}
    public static void Serialize(Object object, String filename) throws IOException {

		FileOutputStream out = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(out);
		oos.writeObject(object);
		oos.flush();
		out.close();
	}
    
    public static SetOfUsers<User> deserialize(String filename)
			throws IOException, ClassNotFoundException {

		FileInputStream in = new FileInputStream(filename);
		ObjectInputStream ois = new ObjectInputStream(in);
		SetOfUsers<User> sOu =(SetOfUsers<User>) ois.readObject();
		in.close();
		return sOu;
	}
    
}
