package T3_Encapsulasi;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        //skenario 1
//        PinjamanOnline a1 = new PinjamanOnline("Dani");
//        PinjamanOnline a2 = new PinjamanOnline("Bagus");
//        PinjamanOnline a3 = new PinjamanOnline("Vanisa");
//
//        a1.pinjam();
//        a2.pinjam();
//        a2.kembalikan();
//        a1.kembalikan();
//        a3.pinjam();
//        a2.pinjam();
//        a1.kembalikan();
//        a3.pinjam();
//
//        System.out.println("SISA SALDO SISTEM = " + PinjamanOnline.getSaldoSistem()+"\n");
//
//        System.out.println("Nama : " + a1.nama);
//        System.out.println("Lama pinjam : "+ a1.getLamaPeminjaman());
//        System.out.println("Jumlah pinjaman : " + a1.getPinjaman()+"\n");
//
//        System.out.println("Nama : " + a2.nama);
//        System.out.println("Lama pinjam : "+ a2.getLamaPeminjaman());
//        System.out.println("Jumlah pinjaman : " + a2.getPinjaman()+"\n");
//
//        System.out.println("Nama : " + a3.nama);
//        System.out.println("Lama pinjam : "+ a3.getLamaPeminjaman());
//        System.out.println("Jumlah pinjaman : " + a3.getPinjaman()+"\n");




//        //skenario 2
//        PinjamanOnline b1 = new PinjamanOnline("Tia");
//        PinjamanOnline b2 = new PinjamanOnline("Fira");
//        PinjamanOnline b3 = new PinjamanOnline("Ani");
//
//        b1.pinjam();
//        b2.kembalikan();
//        b2.pinjam();
//        b1.kembalikan();
//        b3.pinjam();
//        b1.kembalikan();
//
//
//        System.out.println("SISA SALDO SISTEM = " + PinjamanOnline.getSaldoSistem()+"\n");
//
//        System.out.println("Nama : " + b1.nama);
//        System.out.println("Lama pinjam : "+ b1.getLamaPeminjaman());
//        System.out.println("Jumlah pinjaman : " + b1.getPinjaman()+"\n");
//
//        System.out.println("Nama : " + b2.nama);
//        System.out.println("Lama pinjam : "+ b2.getLamaPeminjaman());
//        System.out.println("Jumlah pinjaman : " + b2.getPinjaman()+"\n");
//
//        System.out.println("Nama : " + b3.nama);
//        System.out.println("Lama pinjam : "+ b3.getLamaPeminjaman());
//        System.out.println("Jumlah pinjaman : " + b3.getPinjaman()+"\n");
//
//
//
//
        //skenario 3
        PinjamanOnline c1 = new PinjamanOnline("Ana");
        PinjamanOnline c2 = new PinjamanOnline("Doni");
        PinjamanOnline c3 = new PinjamanOnline("ikhsan");
        PinjamanOnline c4 = new PinjamanOnline("Adi");

        c1.pinjam();
        c2.pinjam();
        c3.pinjam();
        c3.kembalikan();
        c1.kembalikan();
        c4.pinjam();
        c4.kembalikan();
        c3.pinjam();
        c2.pinjam();
        c2.kembalikan();
        c3.kembalikan();
        c2.pinjam();



        System.out.println("SISA SALDO SISTEM = " + PinjamanOnline.getSaldoSistem()+"\n");

        System.out.println("Nama : " + c1.nama);
        System.out.println("Lama pinjam : "+ c1.getLamaPeminjaman());
        System.out.println("Jumlah pinjaman : " + c1.getPinjaman()+"\n");

        System.out.println("Nama : " + c2.nama);
        System.out.println("Lama pinjam : "+ c2.getLamaPeminjaman());
        System.out.println("Jumlah pinjaman : " + c2.getPinjaman()+"\n");

        System.out.println("Nama : " + c3.nama);
        System.out.println("Lama pinjam : "+ c3.getLamaPeminjaman());
        System.out.println("Jumlah pinjaman : " + c3.getPinjaman()+"\n");

        System.out.println("Nama : " + c4.nama);
        System.out.println("Lama pinjam : "+ c4.getLamaPeminjaman());
        System.out.println("Jumlah pinjaman : " + c4.getPinjaman()+"\n");

    }
}
