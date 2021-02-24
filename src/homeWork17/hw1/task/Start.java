package homeWork17.hw1.task;

import java.util.HashMap;
import java.util.Map;

public class Start
{
    public static void main(String[] args)
    {
        Map<User, Account> map = new HashMap<>();
        map.put(
                new User("RR", "LL", 33),
                new DebitAccount("423", "active", 21343)
        );
        map.put(
                new User("fd", "dfdf", 34),
                new Account<Double>(5354.546, "active", 345)
        );
        map.put(
                new User("dgds", "ds", 33),
                new CreditAccount(453, "active", 45665)
        );


        UserService<Account, User> userService = new UserServiceImpl(map);

//        System.out.println(userService.getAllUsers());
//        System.out.println(userService.getAllAccounts());
        System.out.println(userService.tax(new User("dgds", "ds", 33)));



    }
}
