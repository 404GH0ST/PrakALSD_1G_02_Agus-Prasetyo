package Pertemuan11;

import java.util.Scanner;

public class AntrianKRS02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSQueue02 antrianKRS = new KRSQueue02(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS (2 Mahasiswa)");
            System.out.println("3. Lihat Antrian Terdepan (2 Mahasiswa)");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Lihat Antrian Paling Belakang");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Antrian Penuh");
            System.out.println("8. Jumlah Mahasiswa dalam Antrian");
            System.out.println("9. Jumlah Mahasiswa Sudah Proses KRS");
            System.out.println("10. Jumlah Mahasiswa Belum Proses KRS");
            System.out.println("11. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa02 mhs = new Mahasiswa02(nim, nama, prodi, kelas);
                    antrianKRS.enqueue(mhs);
                    break;
                case 2:
                    antrianKRS.prosesKRS();
                    break;
                case 3:
                    antrianKRS.tampilkanPertamadanKedua();
                    break;
                case 4:
                    antrianKRS.tampilkanSemua();
                    break;
                case 5:
                    antrianKRS.tampilkanTerakhir();
                    break;
                case 6:
                    if (antrianKRS.IsEmpty()) {
                        System.out.println("Antrian KRS kosong.");
                    } else {
                        System.out.println("Antrian KRS tidak kosong.");
                    }
                    break;
                case 7:
                    if (antrianKRS.IsFull()) {
                        System.out.println("Antrian KRS penuh.");
                    } else {
                        System.out.println("Antrian KRS belum penuh.");
                    }
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrianKRS.getJumlahAntrian());
                    break;
                case 9:
                    System.out.println("Jumlah mahasiswa sudah proses KRS: " + antrianKRS.getJumlahDiproses());
                    break;
                case 10:
                    System.out.println("Jumlah mahasiswa belum proses KRS: " + antrianKRS.getJumlahAntrian());
                    break;
                case 11:
                    antrianKRS.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}