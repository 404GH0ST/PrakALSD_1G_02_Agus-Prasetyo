package Pertemuan01;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiTugas, nilaiKuis, nilaiUts, nilaiUas, nilaiAkhir = 0;
        String nilaiHuruf = "";
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=======================");

        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUas = sc.nextDouble();
        System.out.println("=======================");
        System.out.println("=======================");

        if (nilaiTugas >= 0 && nilaiTugas <= 100 && nilaiKuis >= 0 && nilaiKuis <= 100 && nilaiUts >= 0
                && nilaiUts <= 100 && nilaiUas >= 0 && nilaiUas <= 100) {
            nilaiAkhir = nilaiTugas * 0.2 + nilaiKuis * 0.2 + nilaiUts * 0.3 + nilaiUas * 0.3;
            System.out.println("nilai akhir : " + nilaiAkhir);
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        } else {
            System.out.println("nilai tidak valid");
        }

        System.out.println("=======================");
        if (nilaiAkhir != 0) {
            if (nilaiHuruf.equals("D") || nilaiHuruf.equals("E")) {
                System.out.println("ANDA TIDAK LULUS");
            } else {
                System.out.println("SELAMAT ANDA LULUS");
            }
        } else {
            System.out.println("=======================");
        }
    }
}
