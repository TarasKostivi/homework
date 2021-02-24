package homeWork17.hw1.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UserServiceImpl implements UserService<Account, User>
{
    private Map<User, Account> accounts;

    public UserServiceImpl(Map<User, Account> accounts)
    {
        this.accounts = accounts;
    }

    @Override
    public List<User> getAllUsers()
    {
        Set<User> users = accounts.keySet();
        return new ArrayList<>(users);
    }

    @Override
    public List<Account> getAllAccounts()
    {
        Collection<Account> set = accounts.values();
        return new ArrayList<>(set);
    }

    @Override
    public double tax(User user)
    {
        for (Map.Entry<User, Account> entry : accounts.entrySet()) {
            if (entry.getKey().getSurname().equals(user.getSurname())
                    && entry.getKey().getName().equals(user.getName())) {
                if (entry.getValue().getStatus().equals("active"))
                {
                    return entry.getValue().getMoney() * 0.05;
                }
            }
        }
        return 0;
    }
}
