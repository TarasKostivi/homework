package homeWork15;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Person, Account> someAccounts = new HashMap<>();
        someAccounts.put(new Person("Alex", 21), new Account("Alex@gmail.com", "Alex1243"));
        someAccounts.put(new Person("Illa", 22), new Account("Illa@gmail.com", "Illa1243"));
        someAccounts.put(new Person("Sergei", 24), new Account("Sergei@gmail.com", "Sergei1243"));

        for (Map.Entry<Person, Account> deliteAccount : someAccounts.entrySet()){
            Person person = deliteAccount.getKey();
            if (person.getName().equals("Alex") && person.getAge() == 21)
            deliteAccount.setValue(null);
        }

        for (Map.Entry<Person, Account> myEntry : someAccounts.entrySet())
        {
            System.out.println(myEntry.getKey());
            if (myEntry.getValue() != null){
                System.out.println("Account : " + myEntry.getValue().getEmail() + " Password: " + myEntry.getValue().getPassword());
            }else {
                System.out.println("No Account");
            }
        }

        for (Map.Entry<Person, Account> deliteAccount : someAccounts.entrySet()){
            Person person = deliteAccount.getKey();
            if (person.getName().equals("Alex")){
                someAccounts.remove(person);
            }
        }

        for (Map.Entry<Person, Account> myEntryprint : someAccounts.entrySet())
        {
            System.out.println("Name: " + myEntryprint.getKey().getName() + " Age: " +
                    myEntryprint.getKey().getAge() + "; " + myEntryprint.getValue());
        }
    }
}
