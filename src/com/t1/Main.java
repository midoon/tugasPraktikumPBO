package com.t1;

public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil(676767,2077,1000000,"polkadot");
        Sopir sopir1 = new Sopir("ucup","A","pekalongan",300000);
        Pelanggan pelanggan1 = new Pelanggan(33333333,"asep","pekalongan");

        TravelMalang tvl1 = new TravelMalang(sopir1,mobil1,pelanggan1);
        System.out.println(tvl1);
    }
}
