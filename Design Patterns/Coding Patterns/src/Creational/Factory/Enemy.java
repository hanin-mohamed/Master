package Creational.Factory;

public abstract class Enemy {
    protected String name;
    protected int health;
    protected int damage;
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getDamage() {
        return damage;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void showUP(){
        System.out.println("Name: " + getName()+"\nHealth: " + getHealth()+"\nDamage: " + getDamage());
    }
}
