package Pertemuan07;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02();
        Scanner sc = new Scanner(System.in);
        int jmlMhs = 5;
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan Data mahasiswa ke-" + (1 + i));
            System.out.print("NIM       : ");
            String nim = sc.nextLine();
            System.out.print("Nama      : ");
            String nama = sc.nextLine();
            System.out.print("Kelas     : ");
            String kelas = sc.nextLine();
            System.out.print("IPK       : ");
            String ip = sc.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("-------------------------------");
            list.tambah(new Mahasiswa02(nim, nama, kelas, ipk));
        }

        list.tampil();
        // melakukan pencarian data sequential
        System.out.println("--------------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(posisi, pss);
        list.tampilDataSearch(posisi, pss);
    }
}
