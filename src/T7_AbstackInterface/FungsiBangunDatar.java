package T7_AbstackInterface;

public class FungsiBangunDatar extends BangunDatar {
    @Override
    public void info() {
        System.out.println("-------------------informasi bangun datar-------------------i");
        int number = 1;
        for (int i = 0; i < listBangunDatar.length; i++){
            if (listBangunDatar[i] != null){
                System.out.println(number+". "+listBangunDatar[i]);
                number++;
            } else {
                break;
            }
        }


    }

    @Override
    public void search(String bd) {
        int jumlah_bd = 0;
        String isBangun = "";

        for (int i = 0; i < listBangunDatar.length; i++){
            if (listBangunDatar[i] != null){
                if (listBangunDatar[i].equalsIgnoreCase(bd)){
                    isBangun = listBangunDatar[i];
                    jumlah_bd++;
                }
            }
        }

        if (isBangun.equalsIgnoreCase("Persegi")){
            System.out.println("============================");
            System.out.println("Hasil Pencarian Bngun Datar: ");
            System.out.println("Bangun Datar Persegi ditemukan!!");
            System.out.println("Jumlah Bangun Datar Dalam List persegi = "+jumlah_bd);
            System.out.println("Sisi Bangun Datar = 4");
            System.out.println("Sudut Bangun Datar = 4");
        } else if (isBangun.equalsIgnoreCase("Segitiga")){
            System.out.println("============================");
            System.out.println("Hasil Pencarian Bngun Datar: ");
            System.out.println("Bangun Datar Segitiga ditemukan!!");
            System.out.println("Jumlah Bangun Datar Dalam List segitiga = "+jumlah_bd);
            System.out.println("Sisi Bangun Datar = 3");
            System.out.println("Sudut Bangun Datar = 3");
        } else if (isBangun.equalsIgnoreCase("Lingkaran")){
            System.out.println("============================");
            System.out.println("Hasil Pencarian Bngun Datar: ");
            System.out.println("Bangun Datar Lingkaran ditemukan!!");
            System.out.println("Jumlah Bangun Datar Dalam List lingkaran = "+jumlah_bd);
            System.out.println("Sisi Bangun Datar = 1");
            System.out.println("Sudut Bangun Datar = 0");
        } else if (isBangun.equalsIgnoreCase("Trapesium")){
            System.out.println("============================");
            System.out.println("Hasil Pencarian Bngun Datar: ");
            System.out.println("Bangun Datar Trapesium ditemukan!!");
            System.out.println("Jumlah Bangun Datar Dalam List trapesium = "+jumlah_bd);
            System.out.println("Sisi Bangun Datar = 4");
            System.out.println("Sudut Bangun Datar = 4");
        } else if (isBangun.equalsIgnoreCase("Layang")){
            System.out.println("============================");
            System.out.println("Hasil Pencarian Bngun Datar: ");
            System.out.println("Bangun Datar Layang ditemukan!!");
            System.out.println("Jumlah Bangun Datar Dalam List layang = "+jumlah_bd);
            System.out.println("Sisi Bangun Datar = 4");
            System.out.println("Sudut Bangun Datar = 4");
        } else {
            System.out.println("============================");
            System.out.println("Hasil Pencarian Bngun Datar: ");
            System.out.println("Bangun Datar tidak ditemukan di dalam list!!");

        }
    }


}
