package T7_AbstackInterface;


public class Lingkaran extends BangunDatar implements Hitung{
    private double jari;
    final double pi = 3.14;

    public Lingkaran(String nama, double jari) {
        for (int i = 0; i < listBangunDatar.length; i++){
            if (listBangunDatar[i] == null){
                listBangunDatar[i] = nama;
                break;
            }
        }
        this.jari = jari;
    }

    @Override
    public void info() {
        System.out.println("Nama Bangun Datar\t: Lingkaran");
        System.out.println("Panjang jari-jari\t: " +this.jari);
        System.out.println("NIlai luas\t\t\t: " + hitungLuas());
        System.out.println("Nilai keliling\t\t: " +hitungKeliling());
        System.out.println("Nilai Spesial\t\t: "+hitungSpesial());
        System.out.println("=========================================");
    }

    @Override
    public void search(String bd) {

    }

    @Override
    public double hitungLuas() {

        double luas = 0;

        luas = this.pi*this.jari*this.jari;

        return luas;
    }

    @Override
    public double hitungKeliling() {
        double keliling = 0;

        keliling = this.pi * 2 * this.jari;

        return keliling;
    }

    @Override
    public double hitungSpesial() {
        double L_juring = 0.25 * this.hitungLuas();

        double L_segiTIga = 0.5 * this.jari * this.jari;

        double L_tembereng = L_juring - L_segiTIga;

        return L_tembereng;
    }
}
