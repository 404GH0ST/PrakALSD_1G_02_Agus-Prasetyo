package Pertemuan12;

import java.util.Scanner;

public class AntrianLayananMain02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue02 queue = new Queue02();

        int choice;
        do {
            System.out.println("\nMenu Antrian Layanan Unit Kemahasiswaan");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Paling Akhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Cek Antrian Kosong");
            System.out.println("7. Cek Jumlah Antrian");
            System.out.println("8. Kosongkan Antrian");
            System.out.println("9. Keluar");
            System.out.print("Pilih menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Masukkan data mahasiswa:");
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    MahasiswaTugas02 mhs = new MahasiswaTugas02(nim, nama, prodi, kelas);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.tampilkanTerakhir();
                    break;
                case 5:
                    queue.print();
                    break;
                case 6:
                    if (queue.IsEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");
                    }
                    break;
                case 7:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + queue.getJumlahAntrian());
                    break;
                case 8:
                    queue.clear();
                    break;
                case 9:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 9);

        sc.close();
    }
}
