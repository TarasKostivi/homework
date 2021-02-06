package homeWork14;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Person, Account> someAccounts = new HashMap<>();
        someAccounts.put(new Person("Alex", 21), new Account("Alex@gmail.com", "Alex1243"));
        someAccounts.put(new Person("Illa", 22), new Account("Illa@gmail.com", "Illa1243"));
        someAccounts.put(new Person("Sergei", 24), new Account("Sergei@gmail.com", "Sergei1243"));




        for (Map.Entry<Person, Account> myEntry : someAccounts.entrySet())
        {
            System.out.println(myEntry.getKey() + " - " + myEntry.getValue());
        }

    }
}
