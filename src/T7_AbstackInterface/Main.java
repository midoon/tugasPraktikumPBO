package T7_AbstackInterface;

public class Main {
    public static void main(String[] args) {
//        NO 1
        BangunDatar[] obBD = new BangunDatar[3];
        obBD[0] = new Persegi("Persegi",50);
        obBD[1] = new Lingkaran("Lingkaran",25);
        obBD[2] = new Trapesium("Trapesium",20,50,30);

        for (int i = 0; i < obBD.length; i++){
            obBD[i].info();
        }



//          N0 2
//        Hitung[] hitungs = new Hitung[5];
//        hitungs[0] = new Persegi("persegi", 19);
//        hitungs[1] = new Segitiga("segitiga",19,45);
//        hitungs[2] = new Layang("layang", 15, 30, 12, 22);
//        hitungs[3] = new Trapesium("trapesium",23,67,34);
//        hitungs[4] = new Lingkaran("lingkaran",25);
//
//        for(Hitung bangun : hitungs){
//            BangunDatar bangunDatar = BangunDatar.getInstanceBangunDatarOf(bangun);
//            bangunDatar.info();
//        }


//        NO 5
//        BangunDatar bd[] = new BangunDatar[7];
//        bd[0] = new Lingkaran("Lingkaran", 37);
//        bd[1] = new Trapesium("Trapesium", 24, 77, 40);
//        bd[2] = new Segitiga("Segitiga", 56, 67);
//        bd[3] = new Persegi("Persegi", 33);
//        bd[4] = new Layang("Layang", 30, 12, 8, 7);
//        bd[5] = new Trapesium("Trapesium", 10, 35, 8);
//        bd[6] = new Layang("Layang", 12, 24, 7, 9);
//
//        BangunDatar b = new FungsiBangunDatar();
//        b.info();
//        for(int i = 0; i < bd.length; i++) {
//            System.out.printf("================ Bangun Datar %d ====================\n", i+1);
//            bd[i].info();
//        }
//
//        b.search("layang");
//        b.search("LinGkarAn");
//        b.search("kubus");



//          contoh
//        BangunDatar bd[] = new BangunDatar[7];
//        bd[0] = new Lingkaran("Lingkaran", 25);
//        bd[1] = new Trapesium("Trapesium", 23, 67, 34);
//        bd[2] = new Trapesium("Trapesium", 31, 17, 12);
//        bd[3] = new Persegi("Persegi", 19);
//        bd[4] = new Segitiga("Segitiga", 19, 45);
//        bd[5] = new Layang("Layang", 30, 15, 12, 22);
//        bd[6] = new Layang("Layang", 24, 40, 37, 13);
//
//        BangunDatar b = new FungsiBangunDatar();
//        b.info();
//        for(int i = 0; i < bd.length; i++) {
//            System.out.printf("================ Bangun Datar %d ====================\n", i+1);
//            bd[i].info();
//        }
//
//        b.search("Layang");
//        b.search("Lingkaran");
//        b.search("Kubus");





    }
}
