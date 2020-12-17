package homeWork7.Salary;



public class ManthWage implements Salary{
    private int monthSalary;

    public ManthWage(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    public int getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(int monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public int salary() {
        return monthSalary;
    }
}
