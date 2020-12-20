package homeWork6.Game;

public class Warrior2 extends Warrior{

    public Warrior2(String name, int hp, String weapon, int number, int damage) {
        super(name, hp, weapon, number, damage);
    }

    @Override
    public boolean WarriorMen() {
        return false;
    }
}
