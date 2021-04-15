package UTP;

public class Pegawai {
    private String nama;
    private String nomorPegawai;



    Pegawai(String nama, String nomorPegawai) {
        this.nama = nama;
        this.nomorPegawai = nomorPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }

    //method
    void tampilkanInfoPegawai(){

        System.out.println("Nama\t\t\t : "+getNama());
        System.out.println("Nomor Pegawai\t : "+getNomorPegawai());
        System.out.println();

    }

    void menambahPelanggan(String nama, String nomorPelanggan){
        for (int i = 0; i < Perpustakaan.listPelanggan.length;i++){
            if (Perpustakaan.listPelanggan[i] == null){
                Perpustakaan.listPelanggan[i] = new Pelanggan(nama,nomorPelanggan);
                break;
            }
        }


    }

    void menambahBuku(String judul, String penulis, int jumlah){
        for (int i = 0; i < Perpustakaan.listBuku.length;i++){
            if (Perpustakaan.listBuku[i] == null){
                Perpustakaan.listBuku[i] = new Buku(judul, penulis, jumlah);
                break;
            }
        }


    }

}
