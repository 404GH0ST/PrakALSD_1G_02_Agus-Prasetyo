package Pertemuan10;

import java.util.Scanner;

public class SuratDemo02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat02 stackSurat = new StackSurat02(5);

        int pilihan;
        do {
            System.out.println("\nMenu Pengelolaan Surat Izin");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data surat izin:");
                    System.out.print("ID Surat: ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I/A): ");
                    char jenisIzin = sc.nextLine().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat02 suratBaru = new Surat02(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stackSurat.push(suratBaru);
                    break;
                case 2:
                    stackSurat.pop();
                    break;
                case 3:
                    Surat02 suratTeratas = stackSurat.peek();
                    if (suratTeratas != null) {
                        System.out.println("Surat terakhir: " + suratTeratas.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String namaCari = sc.nextLine();
                    stackSurat.cariSurat(namaCari);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}