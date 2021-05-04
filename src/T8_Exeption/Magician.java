package T8_Exeption;

public class Magician extends Character{
    public Magician(){
        super.setHP(100);
        super.setAttack(60);
        super.setDefense(10);
    }


    @Override
    public boolean attack() {
        boolean isAtaack = false;

        double acak = Math.random();
        if (acak<=0.35){
            isAtaack = true;
        }

        return isAtaack;
    }
}
