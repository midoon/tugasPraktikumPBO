package T4_inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("=====MANUSIA=====");
        Manusia man1 = new Manusia("ulbert alain odle","5454132",true,true);
        Manusia man2 = new Manusia("yamaiko","989684576",false,true);
        Manusia man3 = new Manusia("peroroncino","69694545",true,false);
        Manusia man4 = new Manusia("Platinim Dragon Lord","097694545",true,false);
        Manusia[] humans = {man1,man2,man3,man4};

        for (Manusia m:humans) {
            System.out.println(m);
        }

        System.out.println("Total manusia => "+ humans.length);
        System.out.println("========================>>>>>>>>>\n");
        System.out.println("=====MAHASISWA=====");
        Mahasiswa mhs1 = new Mahasiswa("aureleo omega","97876894",false,false,"20435415567464",3.6);
        Mahasiswa mhs2 = new Mahasiswa("zeshi zetsume","65435894",false,false,"20435425356454",3.5);
        Mahasiswa mhs3 = new Mahasiswa("abeleon sheep","53487689",true,false,"20435455434344",3.4);
        Mahasiswa[] mhss = {mhs1,mhs2,mhs3};

        for (Mahasiswa mh : mhss){
            System.out.println(mh);
        }
        System.out.println("Total Mahasiswa => "+ mhss.length);

        System.out.println("========================>>>>>>>>>\n");
        System.out.println("=====PEKERJA=====");
        Pekerja pkr1 = new Pekerja("blue planet","438765348",true,true,9,28,"205111576874");
        Pekerja pkr2 = new Pekerja("Nishikenrai","534897545",true,false,8,28,"303111376874");
        Pekerja pkr3 = new Pekerja("Ankoro moci mochi","32335348",false,true,7,30,"102111476874");
        Pekerja[] pekerjas = {pkr1,pkr2,pkr3};

        for (Pekerja pk: pekerjas) {
            System.out.println(pk);
        }
        System.out.println("Total Pekerja => "+ pekerjas.length);

        System.out.println("========================>>>>>>>>>\n");
        System.out.println("=====MANAGER=====");
        Manager mg1 = new Manager("Tabula Smaragdina","575665348",true,true,7,30,"409111276874",800);
        Manager mg2 = new Manager("Touch me","54225348",true,true,6,30,"103111176874",760);
        Manager mg3 = new Manager("Takemikazuchi","005665341",true,true,8,30,"503111576874",790);
        Manager[] mgs = {mg1,mg2,mg3};

        for (Manager mg : mgs){
            System.out.println(mg);
        }
        System.out.println("Total Manager => "+ mgs.length);
        System.out.println("========================>>>>>>>>>\n");







    }
}
