package T7_AbstackInterface;

public class Persegi extends BangunDatar implements Hitung {
    private double panjangSisi;

    public Persegi(String nama, double panjangSisi) {
        for (int i = 0; i < listBangunDatar.length; i++){
            if (listBangunDatar[i] == null){
                listBangunDatar[i] = nama;
                break;
            }
        }
        this.panjangSisi = panjangSisi;
    }

    @Override
    public void info() {
        System.out.println("Nama Bangun Datar\t: Persegi");
        System.out.println("Panjang sisi\t\t: " +this.panjangSisi);
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

        luas = this.panjangSisi*this.panjangSisi;

        return luas;
    }

    @Override
    public double hitungKeliling() {
        double keliling = 0;

        keliling = 4 * this.panjangSisi;

        return keliling;
    }

    @Override
    public double hitungSpesial() {

        double diagonal = 0;

        diagonal = Math.sqrt(2)*Math.sqrt(Math.pow(this.panjangSisi,2));

        return diagonal;
    }
}
