package com.t1;

public class Mobil {
     int noPolisi;
     int tahun;
     int hargaSewa;
     String warna;

    Mobil(int noPolisi, int tahun, int hargaSewa, String warna){
        this.noPolisi = noPolisi;
        this.tahun = tahun;
        this.hargaSewa = hargaSewa;
        this.warna = warna;
    }

    public String toString(){
        return "identitas mobi; =\nno polisi : " + this.noPolisi+
                "\ntahun keluaran : " + this.tahun+
                "\nharga sewa : " + this.hargaSewa+
                "\nwarna : " + this.warna;
    }

}
