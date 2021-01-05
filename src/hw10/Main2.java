package hw10;
import java.util.Scanner;

public class Main2 {
    void shortAndLongWord(String str)
    {
        String sw = "", lw = "";
        String words[] = str.split(" ");

        for(String word:words)
        {
            if(word.length()<str.length())
            {
                sw = word;
            }
            if(word.length()>5)
            {
                lw = word;
            }
        }
        // Print the SHORTEST WORD, LONGEST WORD
        System.out.println("SHORTEST WORD : "+sw);
        System.out.println("LONGEST WORD : "+lw);
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        Main2 obj = new Main2();
        System.out.println("Enter a line to get shortest and longest word:");
        String str = scr.nextLine();

        str += " ";
        obj.shortAndLongWord(str);
    }
}
