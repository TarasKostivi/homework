package homeWork10.hw5;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("string\n");
        System.out.println(stringBuilder.substring(2, 4));
        stringBuilder.append("code \n");
        System.out.println(stringBuilder.substring(8, 10));
        stringBuilder.append("Practice \n");
        System.out.println(stringBuilder.substring(16, 18));
    }
}
