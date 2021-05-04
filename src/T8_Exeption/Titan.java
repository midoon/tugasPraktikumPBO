package T8_Exeption;

public class Titan extends Character{

    public Titan(){
        super.setHP(200);
        super.setAttack(40);
        super.setDefense(0);
    }


    @Override
    public boolean attack() {
        boolean isAtaack = false;

        double acak = Math.random();
        if (acak<=0.40){
            isAtaack = true;
        }

        return isAtaack;
    }
}
