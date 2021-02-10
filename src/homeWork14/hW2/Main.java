package homeWork14.hW2;

import homeWork14.Account;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Account> val1 = new ArrayList<>();
        val1.add(new Account("Alex@gmail.com", "Alex1234"));
        List<Account> val2 = new ArrayList<>();
        val2.add(new Account("Igor@gmail.com", "Igor876541"));
        List<Account> val3 = new ArrayList<>();
        val3.add(new Account("Max@gmail.com", "Max545689"));
        List<Account> val4 = new ArrayList<>();
        val4.add(new Account("Dimon@gmail.com", "Dimon1234"));

        Map<Person, List<Account>> personAccountMap = new HashMap<>();
        personAccountMap.put(new Person("Alex", 34), val1);
        personAccountMap.put(new Person("Igor", 24), val2);
        personAccountMap.put(new Person("Max", 14),  val3);
        personAccountMap.put(new Person("Dimon", 54), val4);

        for (Map.Entry<Person, List<Account>> someEntry : personAccountMap.entrySet()){
            System.out.println("Key" + someEntry.getKey());
            for (Account account: someEntry.getValue()) {
                System.out.println(account);
            }
            System.out.println();
        }

        for (Map.Entry<Person, List<Account>> deleteAccount: personAccountMap.entrySet()){
            if (deleteAccount.getKey().equals("Dimon")){
                deleteAccount.getValue().remove(1);
            }
        }
        for (Map.Entry<Person, List<Account>> someEntry : personAccountMap.entrySet()){
            System.out.println("Key " + someEntry.getKey());
            for (Account account: someEntry.getValue()) {
                System.out.println(account);
            }
            System.out.println();
        }

        for (Map.Entry<Person, List<Account>> deletePerson : personAccountMap.entrySet()){
            Person person = deletePerson.getKey();
            if (person.getName().equals("Alex")){
                personAccountMap.remove(person);
            }
        }

        for (Map.Entry<Person, List<Account>> someEntry : personAccountMap.entrySet()){
            System.out.println("Key " + someEntry.getKey());
            for (Account account: someEntry.getValue()) {
                System.out.println(account);
            }
            System.out.println();
        }

    }
}
