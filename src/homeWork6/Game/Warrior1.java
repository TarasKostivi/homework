package homeWork6.Game;

public class Warrior1  extends Warrior {


    public Warrior1(String name, int hp, String weapon, int damage) {
        super(name, hp, weapon, damage);
    }

    @Override
    public boolean WarriorMen() {
        return false;
    }
}

