package homeWork5.Robot;

public class CoffeRobot extends Robot {
    private String coffeeMake;

    CoffeRobot(String justWork, String coffeeMake){
        super(justWork);

        this.coffeeMake = coffeeMake;
    }

    public String getCoffeeMake() {
        return coffeeMake;
    }

    public void setCoffeeMake(String coffeeMake) {
        this.coffeeMake = coffeeMake;
    }

    @Override
    public void work(){
        System.out.println("I make coffee" + coffeeMake);
    }
}
