package homeWork6.Game;

public class Main {
    public static void main(String[] args) {

        Warrior1 warrior1 = new Warrior1("Warrior 1", 1000, "Knife",  200);
        Warrior2 warrior2 = new Warrior2("Warrior 2", 800, "Saber",  300);
        Warrior3 warrior3 = new Warrior3("Warrior 3", 500, "Pistol", 500);

        warrior1.getName();
        warrior1.getHp();
        warrior1.getWeapon();
        warrior1.getDamage();
        warrior1.setWeapon("M4 SK");
        warrior1.setDamage(400);
        warrior1.characteristic();

        warrior2.getName();
        warrior2.getHp();
        warrior2.getWeapon();
        warrior2.characteristic();

        warrior3.getName();;
        warrior3.getHp();
        warrior3.getWeapon();
        warrior3.characteristic();


        warrior3.battle();

        warrior2.attack(warrior1);
        warrior2.kick(warrior1);
        warrior1.getHp();
        warrior1.setHp(700);

        warrior1.attack(warrior3);
        warrior1.kick(warrior3);
        warrior3.setHp(300);

        warrior3.attack(warrior1);
        warrior3.kick(warrior1);
        warrior1.setHp(200);

        warrior2.attack(warrior3);
        warrior2.kick(warrior3);
        warrior2.died(warrior3);

        warrior2.attack(warrior1);
        warrior2.kick(warrior1);
        warrior2.died(warrior1);

        warrior2.theEnd();








    }
}
