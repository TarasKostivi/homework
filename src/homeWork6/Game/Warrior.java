package homeWork6.Game;

public abstract class Warrior {
    private String name;
    private int hp;
    private String weapon;
    private int damage;


    public Warrior(String name, int hp, String weapon, int damage) {
        this.name = name;
        this.hp = hp;
        this.weapon = weapon;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public abstract boolean WarriorMen();


    public void characteristic(){
        System.out.println(name);
        System.out.println("hp: " + hp);
        System.out.println("Weapon: " + weapon + "("+ this.getDamage() +")");
    }

    public void battle(){
        System.out.println("BATTLE ! ! !");
    }

    public void attack(Warrior warrior){
        System.out.println(this.getName() + " поцілив в " + warrior.getName());
    }
    public void kick( Warrior warrior){
        System.out.print(warrior.getName() + " ");
        System.out.println(warrior.getHp() - this.getDamage());
    }

    public void died(Warrior warrior){
        System.out.println(warrior.getName() + " помер.");
    }
    public void theEnd(){
        System.out.println("Битва закінчилась! Виграв воїн №2");
    }
}
