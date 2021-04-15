package T5_ArrayOfObject;

public class KRS {

    private Mahasiswa mahasiswa;
    private MataKuliah[] matkul;

    public KRS(){
        matkul = new MataKuliah[24];
    }


    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public MataKuliah[] getMatkul() {
        return matkul;
    }

    public void setMatkul(MataKuliah[] matkul) {
        this.matkul = matkul;
    }

    public void tambahMatkul(MataKuliah matkul){
        int totalSks = 0;
        for (int i = 0; i < this.matkul.length; i++){
            if (this.matkul[i] != null){
                int x = Integer.parseInt(this.matkul[i].getSks());
                totalSks += x;
            }
        }

        boolean sksPenuh = false;
        int sksMatkulN = Integer.parseInt(matkul.getSks());
        if (totalSks + sksMatkulN > 24){
            sksPenuh = true;
        }

        if (!sksPenuh){
            for (int i = 0; i < this.matkul.length; i++){
                if (this.matkul[i] == null){
                    this.matkul[i] = matkul;
                    break;
                }
            }
            System.out.println("info "+ this.mahasiswa.getNim()+"\tMatkul Berhasil ditambahkan");
        } else {
            System.out.println("info "+ this.mahasiswa.getNim()+"\tAnda mencapai Batas SKS");
        }

    }


    public void tampilKRS(){
        System.out.println("NIM\t\t\t\t: " + this.mahasiswa.getNim());
        System.out.println("NAMA\t\t\t: "+ this.mahasiswa.getNama());
        System.out.println("PRODI\t\t\t: " + this.mahasiswa.getProdi());
        System.out.println("FAKULTAS\t\t: " + this.mahasiswa.getFakultas());
        System.out.println("MATA KULIAH\t\t: ");
        for (int i = 0 ; i < matkul.length; i++){
            if (matkul[i] != null){
                System.out.println(" * "+ matkul[i].getKodeMatkul()+"-"+matkul[i].getNamaMatkul()+"-"+matkul[i].getSks()+"sks-"+matkul[i].getDosen().getNama());
            }
        }

    }
}

