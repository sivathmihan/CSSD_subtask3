/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import EntitySets.SetOfVehicles;
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
public class vehicleTest {
      
    private static final String FILE_NAME = "testVehicles.ser";
    private static final SetOfVehicles<vehicle> sOv =new SetOfVehicles<vehicle>();
    
    static {
             
		sOv.add(new vehicle("Bus", "EPNB2748", "Tata", "05/08/2016", 1));
                sOv.add(new vehicle("Train", "NB274", "Nissan", "05/08/2016", 2));
                sOv.add(new vehicle("TRam", "TR27", "Yamaha", "05/08/2016", 3));
                    try {
			Serialize(sOv, FILE_NAME);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
    
    public vehicleTest() {
        
    }
    @Test
    public void creditCardTest() {
            
            try {
			int i = 0;
			for (vehicle v : deserialize(FILE_NAME)) {
                            Assert.assertEquals(v.getVehicleName(), sOv.get(i).getVehicleName());
                            Assert.assertEquals(v.getVehiID(), sOv.get(i).getVehiID());
                            Assert.assertEquals(v.getDate(), sOv.get(i).getDate());
                            Assert.assertEquals(v.getVehiModel(), sOv.get(i).getVehiModel());
                            Assert.assertEquals(v.getType(),sOv.get(i).getType());
                            
                           
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
    
    public static SetOfVehicles<vehicle> deserialize(String filename)
			throws IOException, ClassNotFoundException {

		FileInputStream in = new FileInputStream(filename);
		ObjectInputStream ois = new ObjectInputStream(in);
		SetOfVehicles<vehicle> sOv = (SetOfVehicles<vehicle>) ois.readObject();
		in.close();

		return sOv;
	}
    
    
}
