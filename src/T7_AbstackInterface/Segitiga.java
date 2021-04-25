package T7_AbstackInterface;

public class Segitiga extends BangunDatar implements Hitung {
    private double alas;
    private double tinggi;

    public Segitiga(String nama, double alas, double tinggi) {
        for (int i = 0; i < listBangunDatar.length; i++){
            if (listBangunDatar[i] == null){
                listBangunDatar[i] = nama;
                break;
            }
        }
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void info() {
        System.out.println("Nama Bangun Datar\t: Segitiga");
        System.out.println("Panjang Alas\t\t: " +this.alas);
        System.out.println("Panjang tinggi\t\t: "+this.tinggi);
        System.out.println("NIlai luas\t\t\t: " + hitungLuas());
        System.out.println("Nilai keliling\t\t: " +hitungKeliling());
        System.out.println("Nilai Spesial \t\t: "+hitungSpesial());
        System.out.println("=========================================");
    }

    @Override
    public void search(String bd) {

    }

    @Override
    public double hitungLuas() {
        double luas = 0;
        luas = 0.5*this.alas*this.tinggi;

        return luas;
    }

    @Override
    public double hitungKeliling() {
        double keliling = 0;

        keliling = (2*hitungSpesial()) + alas;

        return keliling;
    }

    @Override
    public double hitungSpesial() {
        double hasil = 0;
        double a = alas/2;
        double b = this.tinggi;

        hasil = Math.sqrt((a*a) + (b*b));

        return hasil;
    }
}
