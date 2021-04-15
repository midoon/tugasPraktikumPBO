package T4_inheritance;

public class Manusia {

    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;

    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public boolean getMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    //ini method
    public double getTunjangan(){
        double tunjangan = 0;

        boolean lakiNIkah = getMenikah() && getJenisKelamin();
        boolean wanitaNikah = getMenikah() && !getJenisKelamin();
        boolean bujang = !getMenikah();

        if (lakiNIkah){
            tunjangan += 25;
        } else if (wanitaNikah){
            tunjangan += 20;
        } else if (bujang){
            tunjangan += 15;
        }

        return tunjangan;
    }

    public double getPendapatan(){

        return getTunjangan();
    }

    //toString

    @Override
    public String toString() {

        String kelamin ;
        if (getJenisKelamin()){
            kelamin = "Laki-laki";
        } else {
            kelamin = "Perempuan";
        }


        return "nama\t\t\t: " + this.getNama()+
                "\nNIK\t\t\t\t: "+ this.getNIK()+
                "\njenis kelamin\t: " + kelamin+
                "\npendapatan\t\t: " + this.getPendapatan()+"$\n";
    }
}
