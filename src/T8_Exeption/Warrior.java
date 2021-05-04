package T8_Exeption;

public class Warrior extends Character{

    public Warrior(){
        super.setHP(80);
        super.setAttack(25);
        super.setDefense(30);
    }


    @Override
    public boolean attack() {
        boolean isAtaack = false;

        double acak = Math.random();
        if (acak<=0.60){
            isAtaack = true;
        }

        return isAtaack;
    }
}
