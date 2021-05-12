package T9_Generic;

public class Main {
    public static void main(String[] args) {

        Barang<PerabotKayu> meja = new Barang<>(new PerabotKayu("Meja",190,100,3000));
        Barang<PerabotKayu> kursi = new Barang<>(new PerabotKayu("Kursi",191,50,1500));
        Barang<PerabotKayu> lemari = new Barang<>(new PerabotKayu("Lemari",192,150,6000));
        Barang<PerabotKayu> rakBuku = new Barang<>(new PerabotKayu("Rak Buku",193,110,5500));
        Barang<PerabotKayu> tempatTidur = new Barang<>(new PerabotKayu("Tempat Tidur",194,200,7000));
        meja.getInfo();
        kursi.getInfo();
        lemari.getInfo();
        rakBuku.getInfo();
        tempatTidur.getInfo();

        System.out.println("==================================================================");

        Barang<Elektronik> lampu = new Barang<>(new Elektronik("Lampu",290,1,500));
        Barang<Elektronik> kipasAngin = new Barang<>(new Elektronik("Kipas Angin",291,5,1500));
        Barang<Elektronik> TV = new Barang<>(new Elektronik("TV",292,4,8500));
        Barang<Elektronik> radio = new Barang<>(new Elektronik("Radio",293,4,5500));
        lampu.getInfo();
        kipasAngin.getInfo();
        TV.getInfo();
        radio.getInfo();

    }
}
