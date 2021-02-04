package homeWork10.hw4;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Object-oriented programming is a programming language model ");
        stringBuilder.append("organized around objects rather than \"actions\" and data rather than logic ");
        stringBuilder.append("Object-oriented programming blabla. Object-oriented programming bla.");
        stringBuilder.delete(134 , 161);
        stringBuilder.insert(135, "OOP ");
        System.out.println(stringBuilder.toString());
    }
}
