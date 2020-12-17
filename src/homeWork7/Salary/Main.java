package homeWork7.Salary;

public class Main {
    public static void main(String[] args) {
        HourlyWage hourlyWage = new HourlyWage(10);
        ManthWage manthWage = new ManthWage(300);

        hourlyWage.setHourlySalary(20);
        manthWage.setMonthSalary(100);

        hourlyWage.salary();
        manthWage.salary();

        int a = hourlyWage.salary();
        int b = manthWage.salary();

        System.out.println(a*b);
    }
}
