package Pertemuan04;

import java.util.Scanner;

public class Bioskop02 {
    String judul;
    int durasi;
    String[] genre;
    String[][] kursi;

    Bioskop02() {
        judul = "";
        durasi = 0;
        genre = new String[10];
        kursi = new String[10][10];
    }

    void tampilkanInformasi() {
        if (judul.equals("") || genre == null || kursi == null) {
            System.out.println("Data belum diisi");
            return;
        }
        System.out.println("Judul Film: " + judul);
        System.out.print("Genre: ");
        for (String g : genre) {
            if (g != null) {
                System.out.print(g + " ");
            }
        }
        System.out.println("\nDurasi: " + durasi + " menit");
        System.out.println("Kursi: ");
        System.out.println("=======================================================================");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (kursi[i][j] == null) {
                    System.out.print("X" + "\t");
                } else {
                    System.out.print(kursi[i][j] + "\t");
                }
            }
            System.out.println();
        }
        System.out.println("=======================================================================");
    }

    void isiKursi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================================================");
        System.out.print("Masukkan nomor baris (1-10) : ");
        int baris = sc.nextInt();
        if (baris < 1 || baris > 10) {
            System.out.println("Nomor baris tidak valid");
            return;
        }
        System.out.print("Masukkan nomor kolom (1-10) : ");
        int kolom = sc.nextInt();
        if (kolom < 1 || kolom > 10) {
            System.out.println("Nomor kolom tidak valid");
            return;
        }
        System.out.print("Masukkan nama penonton : ");
        String penonton = sc.next();
        if (kursi[baris - 1][kolom - 1] != null) {
            System.out.println("Kursi sudah terisi");
            return;
        }
        kursi[baris - 1][kolom - 1] = penonton;
        System.out.println("=======================================================================");
    }

    void isiDataFilm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=======================================================================");
        System.out.print("Masukkan judul film : ");
        judul = sc.nextLine();
        System.out.print("Masukkan durasi film (menit) : ");
        durasi = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan genre film (pisahkan dengan koma) : ");
        String[] dummy = sc.nextLine().split(",");
        if (dummy.length > 10) {
            System.out.println("Jumlah genre tidak boleh lebih dari 10");
            return;
        }
        for (int i = 0; i < dummy.length; i++) {
            genre[i] = dummy[i];
        }
        System.out.println("=======================================================================");
    }
}
