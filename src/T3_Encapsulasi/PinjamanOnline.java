package T3_Encapsulasi;

import java.util.Scanner;

public class PinjamanOnline {
    private static double saldoSistem = 5000000;
    private double pinjaman;
    public String nama;
    private int lamaPeminjaman;

    PinjamanOnline(String nama){
        this.nama = nama;
    }

    public static double getSaldoSistem(){
        return saldoSistem;
    }

    public static void setSaldoSistem(double insaldoSistem){
        saldoSistem = insaldoSistem;
    }

    public void setPinjaman(double pinjaman){
        this.pinjaman = pinjaman;
    }

    public double getPinjaman(){
        return this.pinjaman;
    }

    public void setLamaPeminjaman(int lamaPeminjaman){
        this.lamaPeminjaman = lamaPeminjaman;
    }

    public int getLamaPeminjaman(){
        return this.lamaPeminjaman;
    }

    public void pinjam(){

        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang, " + this.nama);
        System.out.println("SALDO SISTEM = " + getSaldoSistem());

        System.out.println("Silahkan masukkan nominial uang yang ingin dipinjam :");
        double nominalPinjaman = in.nextDouble();

        System.out.println("Silhakan masukkan lama peminjaman");
        int hariPinjam = in.nextInt();


        if (getPinjaman() == 0){
            if (nominalPinjaman > this.saldoSistem){
                System.out.println("Maaf nominal yang anda masukkan terlalu besar");
            }else {
                System.out.println("Pinjaman anda telah berhasil");
                setLamaPeminjaman(hariPinjam);
                setPinjaman(nominalPinjaman);
                setSaldoSistem(getSaldoSistem()-getPinjaman());
            }
        } else {
            System.out.println("Anda belum melunasi pinjaman yang sebelumnya");
        }
        System.out.println("==================================================\n\n");
    }

    public void kembalikan(){
        Scanner in = new Scanner(System.in);
        double denda = 0;
        System.out.println("Selamat datang, " + this.nama);
        System.out.println("SALDO SISTEM = " + getSaldoSistem());

        System.out.println("Silahkan masukkan nominal uang yang ingin dikembalikan");
        double nomKembali = in.nextDouble();

        System.out.println("Silahkan masukkan hari pengembalian");
        int hariKembali = in.nextInt();

        if (hariKembali > getLamaPeminjaman()){
            denda += (hariKembali - getLamaPeminjaman())* 15000;
        }


        double tagihan = denda + getPinjaman();


        if (tagihan == 0 || getPinjaman()==0){
            System.out.println("Anda tidak memiliki tagihan");
        } else {
            if (nomKembali > tagihan){
                System.out.println("uang pengembaliain terlalu banyak");
            } else {
                if (tagihan - nomKembali == 0){
                    System.out.println("Terima kasih telah melunasi pinjaman");
                    setPinjaman(getPinjaman()-(nomKembali-denda));
                    setSaldoSistem(getSaldoSistem() + nomKembali);
                    setLamaPeminjaman(0);
                } else {
                    System.out.println("terima kasih telah melakukan cicilan");
                    setPinjaman(getPinjaman()-(nomKembali-denda));
                    setSaldoSistem(getSaldoSistem() + nomKembali);
                }
            }
        }

        System.out.println("================================================\n\n");

    }

}


