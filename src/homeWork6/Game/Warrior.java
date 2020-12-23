package homeWork6.Game;

public abstract class Warrior {
    private String name;
    private int hp;
    private String weapon;
    private int number;
    private int damage;


    public Warrior(String name, int hp, String weapon, int number, int damage) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
        this.number = number;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public abstract boolean WarriorMen();


    public void startFire(){
        System.out.println(name);
        System.out.println("hp: " + hp);
        System.out.println("Weapon: " + weapon + "("+ damage +")");
    }

    public void battle(){
        System.out.println("BATTLE ! ! !");
    }

    public void warriorDamage(){
        System.out.println(name + "поцілив в Warrior 1");
        System.out.print("Warrior 1 hp :" );
        System.out.println(hp -= damage);
    }
}
