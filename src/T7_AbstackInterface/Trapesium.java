package T7_AbstackInterface;

public class Trapesium extends BangunDatar implements Hitung{
    private double alasAtas;
    private double alasBawah;
    private double tinggi;

    public Trapesium(String nama, double alasAtas, double alasBawah, double tinggi) {
        for (int i = 0; i < listBangunDatar.length; i++){
            if (listBangunDatar[i] == null){
                listBangunDatar[i] = nama;
                break;
            }
        }
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
    }

    @Override
    public void info() {
        System.out.println("Nama Bangun Datar\t: Trapesium");
        System.out.println("Panjang Alas atas\t: " +this.alasAtas);
        System.out.println("Panjang Alas bawah\t: " +this.alasBawah);
        System.out.println("Panjang tinggi\t\t: "+this.tinggi);
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

        luas = 0.5 * (this.alasAtas + this. alasBawah) * this.tinggi;


        return luas;
    }

    @Override
    public double hitungKeliling() {

        double bKiriKanan = (this.alasBawah-this.alasAtas)*0.5;
        double sisiMiring = Math.sqrt((bKiriKanan*bKiriKanan) + (this.tinggi*this.tinggi));


        double keliling = 0;

        keliling = (2*sisiMiring) + this.alasBawah + this.alasAtas;

        return keliling;
    }

    @Override
    public double hitungSpesial() {
        double luasABCD = this.alasAtas*tinggi;

        return luasABCD;
    }
}
