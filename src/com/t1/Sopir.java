package com.t1;

public class Sopir {
     String nama;
     String sim;
     String alamat;
     int gajiHarian;

    Sopir(String nama, String sim, String alamat, int gajiHarian){
        this.nama = nama;
        this.sim = sim;
        this.alamat = alamat;
        this.gajiHarian = gajiHarian;
    }

    public String toString(){
        return "\n\nidentitas sopir =\nnama : " + this.nama +
                "\njenis sim : " + this.sim+
                "\nalamat : " + this.alamat +
                "\ngaji harian : " + this.gajiHarian;
    }
}
