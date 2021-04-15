package com.t2;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("joko","pekalongan","laki-laki","TIF",2124343431,90);
        mhs1.display();

        Mahasiswa mhs2 = new Mahasiswa("ucup","pekalongan","laki-laki","TIF",2124434343,70);
        mhs2.display();

        Mahasiswa mhs3 = new Mahasiswa("ucok","pekalongan","laki-laki","TIF",67657645,80);
        mhs3.display();

        System.out.println("jumlah mahasiswa = " + Mahasiswa.jumlshMhs());
    }
}
