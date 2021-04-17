package T6_Polimorfisme;

public class Main {
    public static void main(String[] args){

        Pegawai[] servants = new Pegawai[9];

        servants[0] = new PegawaiTetap("yamaiko", "3587435595245",2000000);
        servants[1] = new PegawaiTetap("Evil eye", "35989797879878",2000000);
        servants[2] = new PegawaiTetap("Arueleo omega", "3585435435595245",2000000);

        servants[3] = new PegawaiHarian("Momonga","3548564647539",8500,40);
        servants[4] = new PegawaiHarian("Ulbert","3548753463639",8500,45);
        servants[5] = new PegawaiHarian("Takemikazuchi","3548756456463",8500,38);

        servants[6] = new Sales("Cocyutus","364654390845",40,50000);
        servants[7] = new Sales("Demiurge","356666666666",70,50000);
        servants[8] = new Sales("Hamsuke","354985390845",30,50000);

        for (int i = 0; i < servants.length; i++){
            System.out.println(servants[i].toString());
        }



    }
}
