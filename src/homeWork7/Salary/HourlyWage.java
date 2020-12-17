package homeWork7.Salary;

public class HourlyWage implements Salary{

    private int hourlySalary;

    public HourlyWage(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    public int getHourlySalary() {
        return hourlySalary;
    }

    public void setHourlySalary(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    @Override
    public int salary() {
        return hourlySalary;
    }


}
