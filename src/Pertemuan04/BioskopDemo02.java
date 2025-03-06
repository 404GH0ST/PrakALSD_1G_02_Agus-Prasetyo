package Pertemuan04;

import java.util.Scanner;

public class BioskopDemo02 {
    public static void main(String[] args) {
        Bioskop02[] bioskop_bioskop = new Bioskop02[10];
        Bioskop02 bioskopTerpilih = null;
        while (true) {
            System.out.println("===========================================");
            System.out.println("1. Pilih Bioskop");
            System.out.println("2. Tampilkan Informasi");
            System.out.println("3. Isi Data Film");
            System.out.println("4. Isi Kursi");
            System.out.println("5. Keluar");
            System.out.println("===========================================");
            System.out.print("Pilihan : ");
            Scanner sc = new Scanner(System.in);
            int pilihan = sc.nextInt();
            if (pilihan == 1) {
                System.out.println("===========================================");
                System.out.print("Masukkan nomor bioskop (1-10) : ");
                int nomorBioskop = sc.nextInt();
                if (nomorBioskop < 1 || nomorBioskop > 10) {
                    System.out.println("Nomor bioskop tidak valid");
                    continue;
                }
                if (bioskop_bioskop[nomorBioskop - 1] == null) {
                    Bioskop02 bioskop1 = new Bioskop02();
                }
                bioskop_bioskop[nomorBioskop - 1] = new Bioskop02();
                bioskopTerpilih = bioskop_bioskop[nomorBioskop - 1];
                System.out.println("===========================================");
            } else if (pilihan == 2) {
                if (bioskopTerpilih == null) {
                    System.out.println("Bioskop belum dipilih");
                    continue;
                }
                bioskopTerpilih.tampilkanInformasi();
            } else if (pilihan == 3) {
                if (bioskopTerpilih == null) {
                    System.out.println("Bioskop belum dipilih");
                    continue;
                }
                bioskopTerpilih.isiDataFilm();
            } else if (pilihan == 4) {
                if (bioskopTerpilih == null) {
                    System.out.println("Bioskop belum dipilih");
                    continue;
                }
                bioskopTerpilih.isiKursi();
            } else if (pilihan == 5) {
                break;
            }
        }
    }
}
