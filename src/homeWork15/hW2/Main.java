package homeWork15.hW2;

import homeWork15.Account;

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


        for (Map.Entry<Person, List<Account>> deliteAccount : personAccountMap.entrySet()){
            Person person = deliteAccount.getKey();
            if (person.getName().equals("Alex") && person.getAge() == 34)
                deliteAccount.setValue(null);
        }

        for (Map.Entry<Person, List<Account>> myEntry : personAccountMap.entrySet())
        {
            System.out.println(myEntry.getKey());
            if (myEntry.getValue() != null){
                System.out.println("Account : " + myEntry.getValue());
            }else {
                System.out.println("No Account");
            }
        }

        for (Map.Entry<Person, List<Account>> delitePerson : personAccountMap.entrySet()){
            Person person1 = delitePerson.getKey();
            if (person1.getName().equals("Alex") && person1.getAge() == 34){
                personAccountMap.remove(person1);
            }
        }

        for (Map.Entry<Person, List<Account>> someEntry : personAccountMap.entrySet()){
            System.out.println("Key " + someEntry.getKey() + " Value::" + someEntry.getValue());
        }


    }
}
