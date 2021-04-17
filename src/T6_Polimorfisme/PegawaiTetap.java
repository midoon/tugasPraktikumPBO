package T6_Polimorfisme;

public class PegawaiTetap extends Pegawai{
    private double upah;


    public PegawaiTetap(String nama, String noKtp,double upah) {
        super(nama, noKtp);
        this.upah = upah;
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }

    @Override
    public String toString() {
        return "Pegawai Tetap\t: "+getNama()+
                "\nNo. Ktp\t\t\t: "+getNoKtp()+
                "\nUpah\t\t\t: "+getUpah()+
                "\nPendapatan\t\t: "+gaji()+"\n";
    }

    @Override
    public double gaji() {
        return getUpah();
    }
}
