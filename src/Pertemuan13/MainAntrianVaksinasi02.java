package Pertemuan13;

import java.util.Scanner;

public class MainAntrianVaksinasi02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueVaksinasi02 antrian = new QueueVaksinasi02();

        int pilihan;
        do {
            System.out.println("\n++++++++++++++++++++++++++++++++++++++");
            System.out.println(" PENGANTRI VAKSIN EXTRAVAGANZA ");
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("++++++++++++++++++++++++++++++++++++++");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("--------------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("--------------------------------------");
                    System.out.println("Nomor Antrian: ");
                    String noAntrian = sc.nextLine();
                    System.out.println("Nama Penerima: ");
                    String nama = sc.nextLine();
                    Penerima02 penerimaBaru = new Penerima02(noAntrian, nama);
                    antrian.tambahAntrian(penerimaBaru);
                    break;
                case 2:
                    Penerima02 penerimaSelesai = antrian.hapusAntrian();
                    if (penerimaSelesai != null) {
                        System.out.println(penerimaSelesai.namaPenerima + " telah selesai divaksinasi.");
                    }
                    antrian.cetakAntrian();
                    break;
                case 3:
                    antrian.cetakAntrian();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 4);
        sc.close();
    }
}
