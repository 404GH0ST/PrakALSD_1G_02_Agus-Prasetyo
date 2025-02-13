package Pertemuan1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMataKuliah;

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");
        System.out.print("Masukkan jumlah Mata Kuliah : ");
        jumlahMataKuliah = sc.nextInt();
        sc.nextLine();
        String[] mataKuliah = new String[jumlahMataKuliah];
        double[] bobotMataKuliah = new double[jumlahMataKuliah];
        String[] nilaiHurufMataKuliah = new String[mataKuliah.length];
        double[] nilaiSetara = new double[mataKuliah.length];
        double[] nilaiMataKuliah = new double[mataKuliah.length];
        double totalNilai = 0, totalSks = 0, ipSemester;

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan Mata Kuliah " + (i + 1) + " : ");
            mataKuliah[i] = sc.nextLine();
            System.out.print("Masukkan Bobot Mata Kuliah " + (i + 1) + " : ");
            bobotMataKuliah[i] = sc.nextDouble();
            sc.nextLine();
        }
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
            nilaiMataKuliah[i] = sc.nextDouble();
            if (nilaiMataKuliah[i] > 80 && nilaiMataKuliah[i] <= 100) {
                nilaiHurufMataKuliah[i] = "A";
                nilaiSetara[i] = 4;
            } else if (nilaiMataKuliah[i] > 73 && nilaiMataKuliah[i] <= 80) {
                nilaiHurufMataKuliah[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiMataKuliah[i] > 65 && nilaiMataKuliah[i] <= 73) {
                nilaiHurufMataKuliah[i] = "B";
                nilaiSetara[i] = 3;
            } else if (nilaiMataKuliah[i] > 60 && nilaiMataKuliah[i] <= 65) {
                nilaiHurufMataKuliah[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiMataKuliah[i] > 50 && nilaiMataKuliah[i] <= 60) {
                nilaiHurufMataKuliah[i] = "C";
                nilaiSetara[i] = 2;
            } else if (nilaiMataKuliah[i] > 39 && nilaiMataKuliah[i] <= 50) {
                nilaiHurufMataKuliah[i] = "D";
                nilaiSetara[i] = 1;
            } else {
                nilaiHurufMataKuliah[i] = "E";
                nilaiSetara[i] = 0;
            }
            totalSks += bobotMataKuliah[i];
            totalNilai += nilaiSetara[i] * bobotMataKuliah[i];
        }

        System.out.println("======================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("======================");

        System.out.printf("MK\t\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai\n");
        for (int i = 0; i < mataKuliah.length; i++) {
            if (mataKuliah[i].equals("Critical Thinking dan Problem Solving")) {
                System.out.printf("%s\t%.2f\t\t     %s\t\t  %.2f\n", mataKuliah[i], nilaiMataKuliah[i],
                        nilaiHurufMataKuliah[i],
                        bobotMataKuliah[i]);
            } else if (mataKuliah[i].equals("Pancasila") || mataKuliah[i].equals("Bahasa Inggris")) {
                System.out.printf("%s\t\t\t\t%.2f\t\t     %s\t\t  %.2f\n", mataKuliah[i], nilaiMataKuliah[i],
                        nilaiHurufMataKuliah[i], bobotMataKuliah[i]);
            } else if (mataKuliah[i].equals("Keselamatan dan Kesehatan Kerja")
                    || mataKuliah[i].equals("Konsep Teknologi Informasi")
                    || mataKuliah[i].equals("Praktikum Dasar Pemrograman")) {
                System.out.printf("%s\t\t%.2f\t\t     %s\t\t  %.2f\n", mataKuliah[i], nilaiMataKuliah[i],
                        nilaiHurufMataKuliah[i], bobotMataKuliah[i]);
            } else {
                System.out.printf("%s\t\t\t%.2f\t\t     %s\t\t  %.2f\n", mataKuliah[i], nilaiMataKuliah[i],
                        nilaiHurufMataKuliah[i], bobotMataKuliah[i]);
            }
        }
        System.out.println("======================");
        ipSemester = totalNilai / totalSks;
        System.out.println("IP : " + ipSemester);
    }
}
