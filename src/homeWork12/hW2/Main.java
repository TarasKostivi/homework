package homeWork12.hW2;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        User user = new User("James", 21, "JamesLo@gmail.com");
        User user1 = new User("Ivan", 28, "Ivanol@gmail.com");
        User user2 = new User("Bob", 18, "Bob@gmail.com");
        User user3 = new User("Solomia", 25, "Solomsya@gmail.com");

        LinkedList<User> linkedList = new LinkedList<>();
        linkedList.add(user);
        linkedList.add(user1);
        linkedList.add(user2);
        linkedList.add(user3);

        Collections.sort(linkedList);

        for (User strSortUser : linkedList) {
            System.out.println(strSortUser);
        }

    }
}
