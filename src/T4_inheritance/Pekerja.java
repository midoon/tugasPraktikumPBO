package T4_inheritance;

public class Pekerja extends Manusia{

    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    public Pekerja(String nama, String NIK, boolean jenisKelamin, boolean menikah, int jamKerja, int hariKerja, String NIP) {
        super(nama, NIK, jenisKelamin, menikah);
        this.gaji = gaji;
        this.bonus = bonus;
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    //setter getter

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }


    public double getGaji() {
        this.gaji = 0;

        int jam = 7;

        if (this.jamKerja < 7){
            jam = this.jamKerja;
        }

        this.gaji = 10 * jam * this.hariKerja;


        return this.gaji;
    }

    public double getBonus() {
        this.bonus = 0;

        int bonusLibur;
        int hariLibur;

        if (this.hariKerja % 7 == 0){
            hariLibur = (this.hariKerja/7)*2;
        } else {
            int hariTemp =  (this.hariKerja - (hariKerja%7));
            hariLibur =  (hariTemp/7)*2;
        }


        bonusLibur = 20*this.jamKerja*hariLibur;

        //llemburr
        int bonusHariBLembur;
        int hariLembur;
        int jamLembur;

        //hitung ja, lembur
        if (this.jamKerja <=7){
            jamLembur = 0;
        } else {
            jamLembur = this.jamKerja - 7;
        }

        //hitung hari lembur
        if (this.hariKerja % 7 == 0){
            hariLembur = this.hariKerja - ((this.hariKerja/7)*2);
        } else {
            int hariTemp = this.hariKerja - (hariKerja % 7);
            hariLembur = this.hariKerja - ((hariTemp/7)*2);
        }

        bonusHariBLembur = 15 * jamLembur * hariLembur;

        this.bonus = bonusLibur + bonusHariBLembur;


        return this.bonus;
    }

    //ini method
    public String getStatus(){

        String kanorCabang = "";
        String departemen = "";

        switch (getNIP().charAt(0)){
            case '1':
                kanorCabang += "Monstad";
                break;
            case '2' :
                kanorCabang += "Liyue";
                break;
            case '3':
                kanorCabang += "Inazuma";
                break;
            case '4' :
                kanorCabang += "sumeru";
                break;
            case '5' :
                kanorCabang += "Fontaine";
                break;
            case '6' :
                kanorCabang += "Natlan";
                break;
            case '7' :
                kanorCabang += "Snezhnaya";
                break;
            default:
                kanorCabang += "kode cabang tidak ada";
                break;
        }


        switch (getNIP().charAt(6)){
            case '1':
                departemen += "Pemasaran";
                break;
            case '2' :
                departemen += "Humas";
                break;
            case '3':
                departemen += "Riset";
                break;
            case '4' :
                departemen += "Teknologi";
                break;
            case '5' :
                departemen += "Personalis";
                break;
            case '6' :
                departemen += "Akademik";
                break;
            case '7' :
                departemen += "Administrasi";
                break;
            case '8' :
                departemen += "Operasional";
                break;
            case '9' :
                departemen += "Pembangunan";
                break;
            default:
                kanorCabang += "kode departemen tidak ada";
                break;
        }


        return departemen+","+" "+kanorCabang+" cabang "+getNIP().charAt(2);
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan()+getBonus()+getGaji();
    }

    //toString
    @Override
    public String toString() {
        return super.toString()+
                "bonus\t\t\t: "+getBonus()+"$"+
                "\ngaji\t\t\t: "+getGaji()+"$"+
                "\nstatus\t\t\t: "+ getStatus()+"\n";

    }
}
