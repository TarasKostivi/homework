package homeWork18.hw2;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("F:\\Text.txt");
            String str = " ";
            while (inputStream.available() > 0){
                str += (char) inputStream.read();
            }
            System.out.println(str);
            String[] words = str.split(" ");
            Person person = new Person(words[0], Integer.valueOf(words[1]));
            inputStream.close();

            OutputStream outputStream = new FileOutputStream("F:\\Test.txt");
            byte[] bytesArr = person.toString().getBytes(StandardCharsets.UTF_8);

            for (byte byteElem : bytesArr) {
                outputStream.write(byteElem);
            }

            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
