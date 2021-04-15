package com.t1;

public class Pelanggan {
     int noKtp;
     String nama;
     String alamat;

    Pelanggan(int noKtp, String nama, String alamat){
        this.noKtp = noKtp;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String toString(){
        return "\n\nidentitas pelanggan\nnama : " + this.nama +
                "\nnomor ktp : " + this.noKtp+
                "\nalamat : " + this.alamat;
    }
}
