package T9_Generic;

public class Elektronik {
    private String nama;
    private int kodeBarang;
    private int beratBarang;
    private int harga;

    public Elektronik(String nama, int kodeBarang, int beratBarang, int harga) {
        this.nama = nama;
        this.kodeBarang = kodeBarang;
        this.beratBarang = beratBarang;
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKodeBarang(int kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public void setBeratBarang(int beratBarang) {
        this.beratBarang = beratBarang;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getKodeBarang() {
        return kodeBarang;
    }

    public int getBeratBarang() {
        return beratBarang;
    }

    public int getHarga() {
        return harga;
    }

    public String toString(){
        return "Nama Barang\t\t: "+getNama()+
                "\nKode\t\t\t: "+getKodeBarang()+
                "\nJenis Barang\t: Elektronik" +
                "\nHarga\t\t\t: "+getHarga()+"\n";
    }
}
