package T8_Exeption;

public class Healer extends Character {

    public Healer(){
        super.setHP(70);
        super.setAttack(10);
        super.setDefense(10);
    }

    public void heal(){
        setHP(getHP()+25);
    }

    @Override
    public boolean attack() {
        boolean isAtaack = false;

        double acak = Math.random();
        if (acak<=0.85){
            isAtaack = true;
        }

        return isAtaack;
    }
}
