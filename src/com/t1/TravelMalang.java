package com.t1;

public class TravelMalang {
     Sopir sopir;
     Mobil mobil;
     Pelanggan pelanggan;

    TravelMalang(Sopir sopir, Mobil mobil, Pelanggan pelanggan){
        this.sopir = sopir;
        this.mobil = mobil;
        this.pelanggan = pelanggan;
    }

    public String toString(){
        return String.valueOf(this.mobil)+String.valueOf(this.sopir)+String.valueOf(this.pelanggan);
    }

}
