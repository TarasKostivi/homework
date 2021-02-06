package homeWork10.hw1;
import java.util.Scanner;

public class Main3 {

    void printWords(String s)
    {
        for (String word : s.split(" "))
            // if length is even
            if (word.length() % 2 == 0)
                // Print the word
                System.out.println(word);

        for(String st : s.split(" "))
        {
            if(st.startsWith("a"))
            {
                System.out.print(st);
            }
        }
    }
    // Driver Code
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        Main3 obj = new Main3();
        System.out.println("Enter a line to get shortest and longest word:");
        String str = scr.nextLine();

        str += "";
        obj.printWords(str);
    }
}

