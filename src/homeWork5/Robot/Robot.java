package homeWork5.Robot;

public class Robot {
    private String justWork;

    Robot(String justWork){
        this.justWork = justWork;
    }

    public String getJustWork() {
        return justWork;
    }

    public void setJustWork(String justWork) {
        this.justWork = justWork;
    }

    public void work(){
        System.out.println("I just work" + justWork);
    }
}
//hometask
// 1) Створити клас homeWork5.Robot i класи CoffeRobot, RobotDancer, RobotCoocker, які будуть нащадками homeWork5.Robot.
// Оголосити в homeWork5.Robot метод work(), в якому слід описати роботу яку буде виконувати кожен з роботів
// (тобто, метод повинен пронаслідуватись):
//• Для homeWork5.Robot, щоб на консоль виводився текст «Я homeWork5.Robot – я просто працюю».
//• Для CoffeRobot, щоб на консоль виводився текст «Я CoffeRobot – я варю каву».
//• Для RobotDancer, щоб на консоль виводився текст «Я RobotDancer – я просто танцюю».
//• Для RobotCoocker, щоб на консоль виводився текст «Я RobotCoocker – я просто готую».
//Створити в Main класі екземпляри вищеописаних класів і викликати до кожного з них метод work().
//Створити в Main класі масив класу homeWork5.Robot , заповнити масив екземплярами вищеописаних класів.
// Створити цикл for , пройтись по всіх елементах масиву і викликати для кожного елемент масиву метод work().