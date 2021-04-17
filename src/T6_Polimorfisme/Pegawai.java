package T6_Polimorfisme;

public abstract class Pegawai {
    private String nama;
    private String noKtp;

    public Pegawai(String nama, String noKtp){
        this.nama = nama;
        this.noKtp = noKtp;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNoKtp(){
        return this.noKtp;
    }

    public abstract String toString();

    public abstract double gaji();

}
