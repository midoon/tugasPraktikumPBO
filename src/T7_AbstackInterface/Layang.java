package T7_AbstackInterface;

public class Layang extends BangunDatar implements Hitung{

    private double diagonal1;
    private double diagonal2;
    private double sisiMIring1;
    private double sisiMIring2;

    public Layang(String nama, double diagonal1, double diagonal2, double sisiMIring1, double sisiMIring2) {
        for (int i = 0; i < listBangunDatar.length; i++){
            if (listBangunDatar[i] == null){
                listBangunDatar[i] = nama;
                break;
            }
        }
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiMIring1 = sisiMIring1;
        this.sisiMIring2 = sisiMIring2;
    }

    @Override
    public void info() {
        System.out.println("Nama Bangun Datar : Layang-Layang");
        System.out.println("Panjang diagonal 1\t\t: " +this.diagonal1);
        System.out.println("Panjang diagonal 2\t\t: " +this.diagonal2);
        System.out.println("Panjang sisi miring 1\t: "+this.sisiMIring1);
        System.out.println("Panjang sisi miring 2\t: "+this.sisiMIring2);
        System.out.println("NIlai luas\t\t\t\t: " + hitungLuas());
        System.out.println("Nilai keliling\t\t\t: " +hitungKeliling());
        System.out.println("Nilai Spesial\t\t\t: "+hitungSpesial());
        System.out.println("=========================================");
    }

    @Override
    public void search(String bd) {

    }

    @Override
    public double hitungLuas() {

        double luas = 0.5 * diagonal1 * diagonal2;

        return luas;
    }

    @Override
    public double hitungKeliling() {
        double keliling = 2 * (sisiMIring1+sisiMIring2);


        return keliling;
    }

    @Override
    public double hitungSpesial() {
        double setd1 = this.diagonal1*0.5;

        double t_abd1 = Math.sqrt((this.sisiMIring1*this.sisiMIring1)-(setd1*setd1));

        double abd1 = 0.5 *this.diagonal1 * t_abd1;


        return abd1;
    }
}
