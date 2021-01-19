package hw10.hw3;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("3 + 56 = 59\n");
        stringBuilder.append("3 - 56 = -53\n");
        stringBuilder.append("3 * 56 = 168");
        stringBuilder.insert(6, " дорівнює");
        stringBuilder.deleteCharAt(16);
        stringBuilder.replace(27, 28, "дорівнює");
        System.out.println(stringBuilder.toString());
    }
}
