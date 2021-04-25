package T7_AbstackInterface;

public abstract class BangunDatar {

    private String nama;
    static String[] listBangunDatar = new String[10];

    public abstract void info();
    public abstract void search(String bd);

    public static BangunDatar getInstanceBangunDatarOf(Hitung bangun){
        BangunDatar bangunDatar = null;
        if(bangun instanceof Persegi)
            bangunDatar = (Persegi)bangun;
        else if(bangun instanceof Segitiga)
            bangunDatar = (Segitiga) bangun;
        else if(bangun instanceof Lingkaran)
            bangunDatar = (Lingkaran) bangun;
        else if(bangun instanceof Trapesium)
            bangunDatar = (Trapesium) bangun;
        else if(bangun instanceof Layang)
            bangunDatar = (Layang)bangun;
        return bangunDatar;
    }


}
