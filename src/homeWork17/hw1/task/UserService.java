package homeWork17.hw1.task;

import java.util.List;

public interface UserService <T extends Account, V>
{
    List<V> getAllUsers();
    List<T> getAllAccounts();
    double tax(V user);
}
