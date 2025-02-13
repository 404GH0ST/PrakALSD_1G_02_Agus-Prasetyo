package Pertemuan1;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMataKuliah;
        System.out.print("Masukkan jumlah Mata Kuliah : ");
        jumlahMataKuliah = sc.nextInt();
        sc.nextLine();

        String[] mataKuliah = new String[jumlahMataKuliah];
        int[] SKS = new int[jumlahMataKuliah];
        int[] semester = new int[jumlahMataKuliah];
        String[] hariKuliah = new String[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan Mata Kuliah " + (i + 1) + " : ");
            mataKuliah[i] = sc.nextLine();
            System.out.print("Masukkan SKS Mata Kuliah " + (i + 1) + " : ");
            SKS[i] = sc.nextInt();
            System.out.print("Masukkan semester Mata Kuliah " + (i + 1) + " : ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan hari kuliah Mata Kuliah " + (i + 1) + " : ");
            hariKuliah[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("======================");
            System.out.println("Program Mata Kuliah");
            System.out.println("======================");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan seluruh jadwal kuliah dengan hari kuliah");
            System.out.println("3. Tampilkan seluruh jadwal kuliah dengan semester");
            System.out.println("4. Mencari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.println("======================");
            System.out.print("Pilih menu : ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            if (pilihan == 1) {
                for (int i = 0; i < jumlahMataKuliah; i++) {
                    System.out.println("Mata Kuliah " + (i + 1) + " : " + mataKuliah[i] + " SKS : " + SKS[i]
                            + " Semester : " + semester[i] + " Hari Kuliah : " + hariKuliah[i]);
                }
            } else if (pilihan == 2) {
                String inputHariKuliah;
                System.out.print("Masukkan hari kuliah : ");
                inputHariKuliah = sc.nextLine();
                for (int i = 0; i < jumlahMataKuliah; i++) {
                    if (hariKuliah[i].equals(inputHariKuliah)) {
                        System.out.println("Mata Kuliah " + (i + 1) + " : " + mataKuliah[i] + " SKS : " + SKS[i]
                                + " Semester : " + semester[i] + " Hari Kuliah : " + hariKuliah[i]);
                    }
                }
            } else if (pilihan == 3) {
                int inputSemester;
                System.out.print("Masukkan semester : ");
                inputSemester = sc.nextInt();
                for (int i = 0; i < jumlahMataKuliah; i++) {
                    if (semester[i] == inputSemester) {
                        System.out.println("Mata Kuliah " + (i + 1) + " : " + mataKuliah[i] + " SKS : " + SKS[i]
                                + " Semester : " + semester[i] + " Hari Kuliah : " + hariKuliah[i]);
                    }
                }
            } else if (pilihan == 4) {
                String inputMataKuliah;
                System.out.print("Masukkan Mata Kuliah : ");
                inputMataKuliah = sc.nextLine();
                for (int i = 0; i < jumlahMataKuliah; i++) {
                    if (mataKuliah[i].equals(inputMataKuliah)) {
                        System.out.println("Mata Kuliah " + (i + 1) + " : " + mataKuliah[i] + " SKS : " + SKS[i]
                                + " Semester : " + semester[i] + " Hari Kuliah : " + hariKuliah[i]);
                    }
                }
            } else if (pilihan == 5) {
                break;
            }
        }

    }
}
