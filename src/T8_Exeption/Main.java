package T8_Exeption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang di game Defend FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = in.nextLine();

        Character enemy = new Titan();

        int pilihan;
        try {
            System.out.println("Silahkan pilih karakter yang anda inginkan : ");
            System.out.println("1. Magician\n2. Healer\n3. warrior");
            pilihan = in.nextInt();
        } catch (Exception e){
            System.out.println("Tolong masukkan angka");
            System.out.println("Silahkan pilih karakter yang anda inginkan : ");
            System.out.println("1. Magician\n2. Healer\n3. warrior");
            in.next();
            pilihan = in.nextInt();
        }



        if (pilihan == 1){
            Character kar = new Magician();
            prosedur(kar,enemy,nama);
        } else if (pilihan == 2) {
            Character kar = new Healer();
            kar.info();
            int cHeal = 0;
            boolean isLanjut = true;
            int turn = 1;
            while (enemy.getHP()!=0 && kar.getHP() != 0){
                System.out.println("========= TURN "+turn+" =========");
                System.out.println("Enemy's HP\t: "+enemy.getHP());
                System.out.println(nama+"'s HP\t: "+kar.getHP());
                if (kar.attack()){
                    enemy.receiveDAmage(kar.getAttack());
                    cHeal++;
                }

                if (enemy.attack()){
                    kar.receiveDAmage(kar.getAttack());
                }

                turn++;
            }
            if (cHeal%2==0){
                ((Healer) kar).heal();
            }

            if (kar.getHP()==0){
                System.out.println("=======================");
                System.out.println("Enemy menang");
            } else if (enemy.getHP()==0){
                System.out.println("=======================");
                System.out.println(nama+" menang");
            }
            System.out.println("========== PLAYER ==========");
            kar.info();
            System.out.println("========== MUSUH ==========");
            enemy.info();
        } else if (pilihan == 3){
            Character kar = new Warrior();
            prosedur(kar,enemy,nama);
        }


    }

    public static void prosedur(Character kar, Character enemy, String nama){
        kar.info();
        boolean isLanjut = true;
        int turn = 1;
        while (enemy.getHP()!=0 && kar.getHP() != 0){
            System.out.println("========= TURN "+turn+" =========");
            System.out.println("Enemy's HP\t: "+enemy.getHP());
            System.out.println(nama+"'s HP\t: "+kar.getHP());
            if (kar.attack()){
                enemy.receiveDAmage(kar.getAttack());
            }

            if (enemy.attack()){
                kar.receiveDAmage(kar.getAttack());
            }

            turn++;
        }

        if (kar.getHP()==0){
            System.out.println("=======================");
            System.out.println("Enemy menang");
        } else if (enemy.getHP()==0){
            System.out.println("=======================");
            System.out.println(nama+" menang");
        }
        System.out.println("========== PLAYER ==========");
        kar.info();
        System.out.println("========== MUSUH ==========");
        enemy.info();
    }
}
