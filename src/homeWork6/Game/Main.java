package homeWork6.Game;

public class Main {
    public static void main(String[] args) {

        Warrior1 warrior1 = new Warrior1("Warrior 1", 1000, "Knife", 1, 200);
        Warrior2 warrior2 = new Warrior2("Warrior 2", 800, "Saber", 2, 300);
        Warrior3 warrior3 = new Warrior3("Warrior 3", 500, "Pistol", 3, 500);

        warrior1.setName("Warrior 1");
        warrior1.setHp(1000);
        warrior1.setWeapon("Knife");
        warrior1.startFire();

        warrior2.setName("Warrior 2");
        warrior2.setHp(800);
        warrior2.setWeapon("Saber");
        warrior2.startFire();

        warrior3.setName("Warrior 3");
        warrior3.setHp(500);
        warrior3.setWeapon("Pistol");
        warrior3.startFire();

        warrior3.battle();


        warrior1.warriorDamage();
        warrior2.warriorDamage();
        warrior3.warriorDamage();
    }
}
