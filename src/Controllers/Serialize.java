/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Kaashiff Ahamed
 */
public class Serialize {
    
    public static void serialize(Object o, String filename) throws IOException {
        try (FileOutputStream fosOutput = new FileOutputStream(filename)) {
            ObjectOutputStream oosOutput = new ObjectOutputStream(fosOutput);
            oosOutput.writeObject(o);
            oosOutput.flush();
        }
    }

    public static Object deserialize(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fisInput = new FileInputStream(filename);
        ObjectInputStream oisInput = new ObjectInputStream(fisInput);
        return oisInput.readObject();
    }
    
}
