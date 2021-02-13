package homeWork17.hw3;

import java.io.*;

public class Serializator {

    public boolean serialization(Employee employee){
        boolean flag = false;

        File file = new File("F:\\input out\\out.txt");

        ObjectOutputStream oos = null;

        try {
            FileOutputStream fos = new FileOutputStream(file);
            if (fos !=null){
                oos = new ObjectOutputStream(fos);
                oos.writeObject(employee);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
            }finally {
            if (oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    public Employee deserialization() throws InvalidObjectException {
        File file = new File("F:\\input out\\out.txt");
        ObjectInputStream ois = null;
        Employee employee = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis !=null){
               ois = new ObjectInputStream(fis);
               employee = (Employee) ois.readObject();
               return employee;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        throw new InvalidObjectException("Object fail");
    }
}
