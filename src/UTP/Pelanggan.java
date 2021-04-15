package UTP;

public class Pelanggan {
    private String nama;
    private String nomorPelanggan;
    private Buku[] BukuPinjam = new Buku[3];

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorPelanggan() {
        return nomorPelanggan;
    }

    public void setNomorPelanggan(String nomorPelanggan) {
        this.nomorPelanggan = nomorPelanggan;
    }

    Pelanggan(String nama, String nomorPelanggan) {
        this.nama = nama;
        this.nomorPelanggan = nomorPelanggan;
    }

    //method
    void tambahBuku(Buku bukuPinjam){
        for (int i = 0; i < BukuPinjam.length; i++){
            if (BukuPinjam[i] == null){
                BukuPinjam[i] = bukuPinjam;
                break;
            }
        }
    }

    void tampilkanInfoPelanggan(){
        String bukuPinjam = "";

        System.out.println("Nama\t\t\t\t : "+ getNama());
        System.out.println("Nomor Pelanggan\t : "+getNomorPelanggan());
        System.out.println("Buku yang Dipinjam\t : ");

        System.out.println();

    }
}
