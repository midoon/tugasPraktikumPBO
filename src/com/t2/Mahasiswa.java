package com.t2;

public class Mahasiswa {
    String nama, alamat, jenisKelamin, prodi;
    int  nilaiAkhir;
    long nim;
    final int kkm = 80;
    static int jmlMhs;

    public Mahasiswa(String nama, String alamat, String jenisKelamin, String prodi, int  nim, int nilaiAkhir){
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.prodi = prodi;
        this.nim = nim;
        this.nilaiAkhir = nilaiAkhir;
        jmlMhs++;
    }

    public static int jumlshMhs(){
        return jmlMhs;
    }

    private boolean isLulus(){
        boolean lulus = false;
        if (this.nilaiAkhir >= 80 ){
            lulus = true;
        }
        return lulus;
    }

    public void display(){

        System.out.println("Nama\t\t: "+ this.nama);
        System.out.println("NIM\t\t\t: " + this.nim);
        System.out.println("Alamat\t\t: "+ this.alamat);
        System.out.println("Jenis Kelamin: "+ this.jenisKelamin);
        System.out.println("Prodi\t\t: "+this.prodi);
        System.out.println("Nilai Akhir\t: "+this.nilaiAkhir);
        if (isLulus()){
            System.out.println("Status\t\t: lulus");
        } else {
            System.out.println("Status\t\t: Mengulang");
        }

        System.out.println("\n");
    }
}
