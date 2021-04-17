package T6_Polimorfisme;

public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKtp, double upahPerJam, int totalJam) {
        super(nama, noKtp);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public String toString() {
        return "Pegawai Hariam\t: "+getNama()+
                "\nNo. KTO\t\t\t: "+getNoKtp()+
                "\nUpah/Jam\t\t: "+getUpahPerJam()+
                "\nTotal Jam Kerja\t: "+getTotalJam()+
                "\nPendapatan\t\t: "+gaji()+"\n";
    }

    @Override
    public double gaji() {
        double gaji = 0;
        if (getTotalJam() <= 40){
            gaji = getUpahPerJam()*getTotalJam();
        } else {
            gaji = (40*getUpahPerJam())+((getTotalJam()-40)*getUpahPerJam()*1.5);
        }

        return gaji;
    }
}
