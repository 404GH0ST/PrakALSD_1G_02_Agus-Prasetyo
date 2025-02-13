package Pertemuan1;

import java.util.Scanner;

public class Tugas2 {
    static Scanner sc = new Scanner(System.in);

    static int tampilkanMenu() {
        System.out.println("Program Menghitung Kubus");
        System.out.println("======================");
        System.out.println("1. Hitung volume kubus");
        System.out.println("2. Hitung luas permukaan kubus");
        System.out.println("3. Hitung keliling kubus");
        System.out.println("4. Keluar");
        System.out.println("======================");
        System.out.print("Pilih menu : ");
        return sc.nextInt();
    }

    static void hitungVolumeKubus() {
        System.out.print("Masukkan sisi : ");
        double sisi = sc.nextDouble();
        double volume = sisi * sisi * sisi;
        System.out.println("Volume kubus : " + volume);
    }

    static void hitungLuasPermukaanKubus() {
        System.out.print("Masukkan sisi : ");
        double sisi = sc.nextDouble();
        double luas = 6 * (sisi * sisi);
        System.out.println("Luas permukaan kubus : " + luas);
    }

    static void hitungKelilingKubus() {
        System.out.print("Masukkan sisi : ");
        double sisi = sc.nextDouble();
        double keliling = 12 * sisi;
        System.out.println("Keliling kubus : " + keliling);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int menu = tampilkanMenu();

            if (menu == 1) {
                hitungVolumeKubus();
            } else if (menu == 2) {
                hitungLuasPermukaanKubus();
            } else if (menu == 3) {
                hitungKelilingKubus();
            } else if (menu == 4) {
                break;
            } else {
                System.out.println("Pilihan tidak valid");
            }
            System.out.println("======================");
        }
    }
}
