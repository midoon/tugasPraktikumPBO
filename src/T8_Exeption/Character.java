package T8_Exeption;

import java.lang.*;

public abstract class Character {
    private int defense;
    private int attack;
    private int HP;

    public Character(){
    }

    public abstract boolean attack();
    public void receiveDAmage(int damage){
        int damaageTerima = damage - getDefense();
        setHP(getHP()-damaageTerima);
        if (getHP()<0){
            setHP(0);
        }
    };

    public void info(){
        System.out.println("-------------------STATUS-------------------");
        System.out.println("Role\t: " +this.getClass().getSimpleName());
        System.out.println("HP\t\t: "+getHP());
        System.out.println("Attack\t: "+getAttack());
        System.out.println("Defence\t: "+getDefense());

    }

    public int getDefense() {
        return defense;
    }

    //getter setter================================

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
