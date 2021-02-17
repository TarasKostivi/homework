package homeWork18;

import java.io.*;

public class Start {
    public static void main(String[] args) throws IOException {
        try {
            InputStream inputStream = new FileInputStream("F:\\Test.txt");

            String str = " ";
            while (inputStream.available() > 0) {
                str += (char) inputStream.read();
            }

            System.out.println(str);
            inputStream.close();

            OutputStream outputStream = new FileOutputStream("F:\\Test.txt");


            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
