package homeWork17;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Start {
    public static void main(String[] args) throws IOException {
        try
        {
            InputStream inputStream = new FileInputStream("F:\\Test.txt");

            String str = " ";
            while (inputStream.available() > 0){
                str += (char) inputStream.read();
            }

            System.out.println(str);
            inputStream.close();

            OutputStream outputStream = new FileOutputStream("F:\\Test.txt");


            outputStream.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


//        FileInputStream fileInputStream = new FileInputStream("F:\\Test.txt");
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(FilterInputStream, 200);
//
//        int i;
//        while ((i = bufferedInputStream.read()) != 1){
//            System.out.println((char)i);
//        }

//        FileReader fileReader = new FileReader("F:\\input out\\in.txt");
//        FileWriter fileWriter = new FileWriter("F:\\input out\\out.txt");
//
//        while (fileReader.ready()){
//            int data = fileReader.read();
//            fileWriter.write(data);
//        }
//        fileReader.close();
//        fileWriter.close();



        // збереження об"єкта у файл


    }
//    public void serializeObject(Object o) throws IOException{
//        FileOutputStream fileOutputStream = new FileOutputStream("F:\\input out\\out.txt");
//        ObjectOutputStream objectOutputStream = new ObjectInputStream(fileOutputStream);
//
//        // записуємо об"єкт
//        objectOutputStream.writeObject(o);
//
//        // закриваємо потоки
//        objectOutputStream.close();
//        fileOutputStream.close();
//        System.out.println("Object was serialized!");


    }
