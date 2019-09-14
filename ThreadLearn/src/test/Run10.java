package test;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;

/**
 * @AUTHOR :yuankejia
 * @DESCRIPTION:
 * @DATE:CRETED: IN 15:43 2019/9/8
 * @MODIFY:
 */
public class Run10 {
    public static void main(String[] args) {
        try {
            MyObject myObject = MyObject.getInstance();
            FileOutputStream fileOutputStream = new FileOutputStream(new File("myObject.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(myObject);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println(myObject.hashCode());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("myObject.txt"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            MyObject myObject1 = (MyObject)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(myObject1.hashCode());
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
