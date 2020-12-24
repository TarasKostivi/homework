package homeWork5.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot("someWork");
        CoffeRobot robot1 = new CoffeRobot("someWork", "someCoffee");
        RobotDancer robot2 = new RobotDancer("someWork", "someDancing");
        RobotCoocer robot3 = new RobotCoocer("someWork", "someCooking");

        robot.setJustWork(" some Work ");
        robot1.setCoffeeMake(" some Coffee ");
        robot2.setDancing(" some Dancing ");
        robot3.setCook(" some Cooking ");

        robot.work();
        robot1.work();
        robot2.work();
        robot3.work();

        Robot[] robots = {robot, robot1, robot2, robot3};

        for (int i = 0; i < robots.length; i++) {
            robots[i].work();
        }

    }

}
