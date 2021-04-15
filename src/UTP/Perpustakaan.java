package UTP;

public class Perpustakaan {
    static Buku[] listBuku = new Buku[100];
    public Pegawai pegawaiPerpus;
    static Pelanggan[] listPelanggan = new Pelanggan[20];

    Perpustakaan(Pegawai pegawai){
        this.pegawaiPerpus = pegawai;
    }

    //method
    void pinjam(String namaPelanggan, String judulBuku){

    }

    Buku cariBuku(String judulBuku){
        return this.listBuku[0];
    }

    void tampilkanInfoPerpustakaan(){
        System.out.println("Informasi Pegawai di Perpustakaan :");
        pegawaiPerpus.tampilkanInfoPegawai();
        System.out.println("================================\n");

        System.out.println("Daftar Pelanggan di Perppustakaan\n");
        for (int i = 0; i < listPelanggan.length;i++){
            if (this.listPelanggan[i] != null){
                this.listPelanggan[i].tampilkanInfoPelanggan();
            }
        }
        System.out.println("================================\n");

        System.out.println("Daftar Buku di Perpustakaan :\n");
        for (int i = 0; i < listBuku.length;i++){
            if (this.listBuku[i] != null){
                this.listBuku[i].tampilkanInfoBuku();
            }
        }


    }
}
