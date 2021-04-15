package T5_ArrayOfObject;

public class Mahasiswa extends CivitasAkademik {
    private String nim;

    public Mahasiswa(){}

    public Mahasiswa(String nim,String nama, String prodi, String fakultas) {
        super(nama, prodi, fakultas);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
