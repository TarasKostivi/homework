package homeWork5.Robot;

public class RobotCoocer extends Robot{
    private String cook;

    RobotCoocer(String justWork, String cook){
        super(justWork);

        this.cook = cook;
    }

    public String getCook() {
        return cook;
    }

    public void setCook(String cook) {
        this.cook = cook;
    }
    @Override
    public void work(){
        System.out.println("I cooking" + cook);
    }
}
