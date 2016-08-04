/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;


import EntitySets.SetOfRoutes;
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
public class RoutesTest {
    
    private static final String FILE_NAME = "testRoutes.ser";
     private static final SetOfRoutes<Routes> sOr=new SetOfRoutes<Routes>();
     
     static {
             
		sOr.add(new Routes("Jaffna", "Kandy", "NB-2748", "14", "DRI0000001", "INS0000001", "11/08/2016"));
                sOr.add(new Routes("Colombo", "Kandy", "NB-6788", "14", "DRI0000002", "INS0000002", "09/08/2016"));
                sOr.add(new Routes("Kandy", "Jaffna", "NB-2748", "14", "DRI0000001", "INS0000001", "07/08/2016"));
                try {
			Serialize(sOr, FILE_NAME);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
    public RoutesTest() {
    }
    
    @Test
    public void routesTest() {
            
            try {
			int i = 0;
			for (Routes rt : deserialize(FILE_NAME)) {
                            Assert.assertEquals(rt.getFrom(), sOr.get(i).getFrom());
                            Assert.assertEquals(rt.getTo(),sOr.get(i).getTo());
                            Assert.assertEquals(rt.getVehicalNo(),sOr.get(i).getVehicalNo());
                            Assert.assertEquals(rt.getDate(),sOr.get(i).getDate());
                            Assert.assertEquals(rt.getDriverID(),sOr.get(i).getDriverID());
                            Assert.assertEquals(rt.getInspectorID(),sOr.get(i).getInspectorID());
                            Assert.assertEquals(rt.getNoOfStops(),sOr.get(i).getNoOfStops());
                            
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
    
    public static SetOfRoutes<Routes> deserialize(String filename)
			throws IOException, ClassNotFoundException {

		FileInputStream in = new FileInputStream(filename);
		ObjectInputStream ois = new ObjectInputStream(in);
		SetOfRoutes<Routes> sOu =(SetOfRoutes<Routes>) ois.readObject();
		in.close();
		return sOu;
	}
}
