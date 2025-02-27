package Pertemuan03;

import java.util.Scanner;

public class MataKuliahDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Data MataKuliah : ");
        int jumlahData = Integer.parseInt(sc.nextLine());
        MataKuliah02[] arrayOfMataKuliah = new MataKuliah02[jumlahData];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            arrayOfMataKuliah[i] = new MataKuliah02();
            System.out.println("Masukkan Data MataKuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].tambahData();
        }

        for (int i = 0; i < arrayOfMataKuliah.length; i++) {
            System.out.println("Data MataKuliah ke-" + (i + 1));
            arrayOfMataKuliah[i].cetakInfo();
        }
    }
}
