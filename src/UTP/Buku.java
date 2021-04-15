package UTP;

public class Buku {
    private String judul;
    private String penulis;
    private int jumlah;

    Buku(String judul, String penulis, int jumlha) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlah = jumlha;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlha) {
        this.jumlah = jumlha;
    }

    //method
    void tampilkanInfoBuku(){

        System.out.println("Judul Buku\t : "+getJudul());
        System.out.println("Penulis\t\t : "+getPenulis());
        System.out.println("Jumlah Buku\t : "+getJumlah());
        System.out.println();
    }
}
