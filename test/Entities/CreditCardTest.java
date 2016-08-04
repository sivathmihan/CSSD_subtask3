/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import EntitySets.SetOfCreditCards;
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
public class CreditCardTest {
    
    private static final String FILE_NAME = "testCreditCard.ser";
    private static final SetOfCreditCards<CreditCard> sOc =new SetOfCreditCards<CreditCard>();
    
    static {
             
		sOc.add(new CreditCard(Long.parseLong("4216768765243614"), "V Sivathmihan", "09/2019", 818, "siva"));
                sOc.add(new CreditCard(Long.parseLong("4283456728476497"), "MAKM Ahamed", "10/2018", 234, "kaash"));
                sOc.add(new CreditCard(Long.parseLong("4136829376346829"), "T Jeyadilkshan", "04/2020", 456, "dixon"));
		try {
			Serialize(sOc, FILE_NAME);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
    
    public CreditCardTest() {
        
    }
    @Test
    public void creditCardTest() {
            
            try {
			int i = 0;
			for (CreditCard crd : deserialize(FILE_NAME)) {
                            Assert.assertEquals(crd.getCardNo(), sOc.get(i).getCardNo());
                            Assert.assertEquals(crd.getCardName(), sOc.get(i).getCardName());
                            Assert.assertEquals(crd.getExpDate(), sOc.get(i).getExpDate());
                            Assert.assertEquals(crd.getcVVno(), sOc.get(i).getcVVno());
                            Assert.assertEquals(crd.getUserID(),sOc.get(i).getUserID());
                            Assert.assertTrue(Long.toString(crd.getCardNo()).length()==16);
                            
                           
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
    
    public static SetOfCreditCards<CreditCard> deserialize(String filename)
			throws IOException, ClassNotFoundException {

		FileInputStream in = new FileInputStream(filename);
		ObjectInputStream ois = new ObjectInputStream(in);
		SetOfCreditCards<CreditCard> sOc =(SetOfCreditCards<CreditCard>) ois.readObject();
		in.close();

		return sOc;
	}
    
}
