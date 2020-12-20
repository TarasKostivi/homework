package homeWork5.someMotocyrcle;

public class Motorcycle {
    private String modelNO;
    private String specification;
    private int year;
    private String color;
    private int wheels;

    public Motorcycle(){

    }

    public Motorcycle(String modelNO, String specification, int year, String color, int wheels) {
        this.modelNO = modelNO;
        this.specification = specification;
        this.year = year;
        this.color = color;
        this.wheels = wheels;
    }

    public String getModelNO() {
        return modelNO;
    }

    public void setModelNO(String modelNO) {
        this.modelNO = modelNO;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void redesign(String color, int wheels){
        System.out.println("Change color");
        this.setColor(color);
        System.out.println("Chang number doors");
        this.setWheels(wheels);
    }

    public boolean start(){
        System.out.println("let's go");
        return true;
    }
    public void redesigned(int wheels){
        System.out.println("Change wheels");
        this.setWheels(wheels);
    }
    public void redesigned(String color, int wheels ){
        System.out.print(" Change color bike ");
        this.setColor(color);
        System.out.print(" Change color wheels ");
        this.setWheels(wheels);
    }

}
//Codetime
// 1) Створити клас на свій розсуд, зробити для нього мінімум 2 нащадки ,
// перевизначити методи батьківського класу в класах-нащадках , зробити
// overloading методів в батьківському класі.