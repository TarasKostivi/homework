package homeWork3;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the letters");
        String string1 = scanner.nextLine();
        System.out.println("Enter the letters");
        String string2 = scanner.nextLine();
        String[][] matrix = new String[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(string1.toUpperCase());
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println(string2.toUpperCase());
            }
        }
    }
}

//    • String - одне слово
//Ваша програма має побудувати матрицю з string_1 і знайти в цій матриці слово string_2 . Програма має побудувати ланцюжок на основі індексів де в матриці знаходяться певні букви. Програма має працювати не залежно яку букву використав користувач (велику чи малу).
//
//Наприклад :
//
//користувач ввів слово_1 : QLGNAEKIRLRNGEAE
//і слово_2 : KING
//
//Розмір матриці буде : 4*4
//А матриця буде мати вигляд :
//Matrix :
//Q  L  G  N
//A  E  K  I
//R  L  R  N
//G  E  A  E
//
//Отже програма має видати такий результат :
//K -> [1][2]
//I -> [1][3]
//N -> [0][3]
//G -> [0][2]
//А також інформацію про те, чи слово побудоване повністю чи ні.