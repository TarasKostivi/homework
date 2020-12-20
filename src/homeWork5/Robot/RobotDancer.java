package homeWork5.Robot;

public class RobotDancer extends Robot {
    private String dancing;

    RobotDancer(String justWork, String dancing){
        super(justWork);

        this.dancing = dancing;
    }

    public String getDancing() {
        return dancing;
    }

    public void setDancing(String dancing) {
        this.dancing = dancing;
    }
    @Override
    public void work(){
        System.out.println("I dancing" + dancing);
    }
}
