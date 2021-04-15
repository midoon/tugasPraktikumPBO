package T5_ArrayOfObject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("123","Aji Sulastri","TIF","FIlkom");
        Dosen d2 = new Dosen("124","suratno","TIF","FILKOM");
        KRS krsKe1 = new KRS();
        MataKuliah m1 = new MataKuliah("UBR001","PKN","5",d1);
        MataKuliah m2 = new MataKuliah("CIE006","PEMDAS","4",d1);
        MataKuliah m3 = new MataKuliah("CIE021","JARKOM","5",d1);
        MataKuliah m4 = new MataKuliah("CIE005","PEMWEB","5",d1);
        MataKuliah m5 = new MataKuliah("CIE004","Pancasila","5",d1);
        MataKuliah m6 = new MataKuliah("CIE003","STATISTIKA","5",d1);
        krsKe1.setMahasiswa(new Mahasiswa("195159620111007","Ahmad","SI","FILKOM"));

        Scanner in = new Scanner(System.in);
        boolean isLanjutkan = true;

        MataKuliah[] mk = {m1,m2,m3,m4,m5,m6};
        while (isLanjutkan){
            System.out.print("Masukkan Mata kuliah! m:");
            krsKe1.tambahMatkul(mk[in.nextInt()-1]);

            String is = "";
            while (!is.equalsIgnoreCase("y")&&!is.equalsIgnoreCase("n")){
                System.out.println("Apakah anda ingin menlanjutkan?(y/n)");
                is = in.next();
                if (is.equalsIgnoreCase("y")){
                    isLanjutkan = true;
                } else if (is.equalsIgnoreCase("n")){
                    isLanjutkan = false;
                } else {
                    System.out.println("ketik y/n");
                }
            }

        }

        krsKe1.tampilKRS();


    }
}
