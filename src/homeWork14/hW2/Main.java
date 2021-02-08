package homeWork14.hW2;

import homeWork14.Account;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("Vasilius@gmail.com", "Vasilius210"));
        
        Map<Person, List<Account>> personAccountMap = new HashMap<>();
        personAccountMap.put(new Person("Alex", 34), accounts);
        personAccountMap.put(new Person("Ilex", 24), accounts);
        personAccountMap.put(new Person("Klex", 54), accounts);
        personAccountMap.put(new Person("Llex", 14), accounts);

        for (Map.Entry<Person, List<Account>> someEntry1 : personAccountMap.entrySet()){
            System.out.println("key: " + someEntry1.getKey());
            for (Account f : someEntry1.getValue()){
                System.out.println(f + " ");
            }
            System.out.println();
        }

        for (Map.Entry<Person, List<Account>> someEntry : personAccountMap.entrySet()){
            if (someEntry.getKey().equals("Alex")){
                someEntry.getValue().remove(0);
            }
        }

        for (Map.Entry<Person, List<Account>> myEntry : personAccountMap.entrySet())
        {
            System.out.println("Name: " + myEntry .getKey().getName() + " Age: " +
                    myEntry.getKey().getAge() + "; " + myEntry .getValue());
        }

        for (Map.Entry<Person, List<Account>> deliteAccount : personAccountMap.entrySet()){
            Person person = deliteAccount.getKey();
            if (person.getName().equals("Alex") && person.getAge() == 21)
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
    }
}
