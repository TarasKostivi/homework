package homeWork8.Phones;

public class Main {
    public static void main(String[] args) {
        for (Phones phones : Phones.values()){
            System.out.println(phones.ordinal() + " - "  +  phones.getTitle() + " " + phones.getPrice());
        }

        for (Phones phones: Phones.values()){
            System.out.println(phones);
            phones.getPhone();
        }
    }
}
//Зробити свій Enum , в main методі вивести всі значення цього enum
//та їх порядкові номери.
//
//Додати у свій enum змінну, конструктори, метод з реалізацією,
//абстрактний метод. В main() методі викликати ці методи.