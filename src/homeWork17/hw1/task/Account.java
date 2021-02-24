package homeWork17.hw1.task;

public class Account<T>
{
private T id;
private String status;
private int money;


public Account(T id, String status, int money) {
    this.id = id;
    this.status = status;
    this.money = money;
}

public T getId() {
    return id;
}

public void setId(T id) {
    this.id = id;
}

public String getStatus() {
    return status;
}

public void setStatus(String status) {
    this.status = status;
}

public int getMoney() {
    return money;
}

public void setMoney(int money) {
    this.money = money;
}
}
