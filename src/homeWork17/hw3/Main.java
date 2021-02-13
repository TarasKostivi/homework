package homeWork17.hw3;

import java.io.InvalidObjectException;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee();
//        employee.setName("Igor");
//        employee.setId(2313);
//        employee.setSalary(213424);
//
//        Serializator serializator = new Serializator();
//        serializator.serialization(employee);
//        System.out.println(serializator.serialization(employee));
        Serializator serializator = new Serializator();
        try {
            Employee employee = serializator.deserialization();
            System.out.println(employee.getName());
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
    }
}
