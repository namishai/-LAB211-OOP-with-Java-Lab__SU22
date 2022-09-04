
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Data {
    public ArrayList<Task> inputDB(String name){
        ArrayList<Task> objectlist = new ArrayList<>();
        boolean isExist = true;
        try {
            File f = new File(name);
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (isExist) {
                Task task = null;
                try {
                    task = (Task) ois.readObject();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                if (task != null) {
                    objectlist.add(task);
                } else {
                    isExist = false;
                }
            }
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            System.out.println("Not found file");
        } catch (IOException ex) {

        }
        return objectlist;
    }
    
        public void saveDB(ArrayList<Task> tasks, String name) {
        File f = new File(name);
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Task task : tasks) {
                try {
                    oos.writeObject(task);
                } catch (Exception e) {
                    System.out.println("Error");
                }
            }
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Not found file");
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }
}
