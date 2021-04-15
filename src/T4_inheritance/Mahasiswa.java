package T4_inheritance;

public class Mahasiswa extends Manusia {

    private String NIM;
    private double IPK;

    public Mahasiswa(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    //setter getter
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    //ini method
    public String getStatus(){
        String prodi = "";
        String angkatan = "20"+getNIM().charAt(0)+getNIM().charAt(1);

        switch (getNIM().charAt(6)){
            case '1':
                prodi += "Teknik meniup Gelembung";
                break;
            case '2' :
                prodi += "Teknik berburu ubur-ubur";
                break;
            case '3':
                prodi += "Sistem perhamburgeran";
                break;
            case '4' :
                prodi += "Pendidikan chumbacket";
                break;
            case '5' :
                prodi += "Teknologi telepon kerang";
                break;
            default:
                prodi += "kode prodi tidak ada";
                break;
        }



        return prodi+","+" "+angkatan;
    }

    public double getBeasiswa(){

        double beasiswa = 0;

        if (3.0 <= getIPK() && getIPK() <3.5){
            beasiswa += 50;
        } else if(3.5 <= getIPK() && getIPK() <=4.0){
            beasiswa += 75;
        }

        return beasiswa;
    }


    @Override
    public double getPendapatan() {
        return super.getPendapatan()+getBeasiswa();
    }

    //toString


    @Override
    public String toString() {
        return super.toString()+
                "NIM\t\t\t\t: "+ this.getNIM()+
                "\nIPK\t\t\t\t: "+ this.getIPK()+
                "\nstatus\t\t\t: " + getStatus()+"\n";
    }
}
