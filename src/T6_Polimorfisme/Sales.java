package T6_Polimorfisme;

public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKtp, int penjualan, double komisi) {
        super(nama, noKtp);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    @Override
    public String toString() {
        return "Sales\t\t\t: "+getNama()+
                "\nNo. KTP\t\t\t: "+getNoKtp()+
                "\nTotal Penjualan\t: "+getPenjualan()+
                "\nBesaran Komisi\t: "+getKomisi()+
                "\nPendapatan\t\t: "+gaji()+"\n";
    }

    @Override
    public double gaji() {
        return getPenjualan()*getKomisi();
    }
}
