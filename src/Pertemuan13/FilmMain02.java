package Pertemuan13;

import java.util.Scanner;

public class FilmMain02 {
    private static Film02 inputDataFilm(Scanner sc) {
        System.out.println("ID Film    : ");
        String id = sc.nextLine();
        System.out.println("Judul Film : ");
        String judul = sc.nextLine();
        System.out.println("Rating Film: ");
        double rating = Double.parseDouble(sc.nextLine());
        return new Film02(id, judul, rating);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListFilm02 dllFilm = new DoubleLinkedListFilm02();

        int pilihan;
        do {
            System.out.println("\n==============================");
            System.out.println("DATA FILM LAYAR LEBAR    ");
            System.out.println("==============================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("==============================");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    Film02 filmAwal = inputDataFilm(sc);
                    dllFilm.addFirst(filmAwal);
                    System.out.println("Film berhasil ditambahkan di awal.");
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    Film02 filmAkhir = inputDataFilm(sc);
                    dllFilm.addLast(filmAkhir);
                    System.out.println("Film berhasil ditambahkan di akhir.");
                    break;
                case 3:
                    System.out.println("Masukkan Data Film");
                    Film02 filmIndex = inputDataFilm(sc);
                    System.out.print("Masukkan data ini pada indeks ke-: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    dllFilm.add(filmIndex, index);
                    System.out.println("Film berhasil ditambahkan pada indeks ke-" + index);
                    break;
                case 4:
                    Film02 dihapusAwal = dllFilm.removeFirst();
                    System.out.println("Film \"" + dihapusAwal.judul + "\" berhasil dihapus dari awal.");
                    break;
                case 5:
                    Film02 dihapusAkhir = dllFilm.removeLast();
                    System.out.println("Film \"" + dihapusAkhir.judul + "\" berhasil dihapus dari akhir.");
                    break;
                case 6:
                    System.out.print("Masukkan indeks film yang akan dihapus: ");
                    int indexHapus = sc.nextInt();
                    sc.nextLine();
                    Film02 dihapusIndex = dllFilm.remove(indexHapus);
                    System.out.println("Film \"" + dihapusIndex.judul + "\" pada indeks ke-" + indexHapus
                            + " berhasil dihapus.");
                    break;
                case 7:
                    dllFilm.printList();
                    break;
                case 8:
                    System.out.print("Masukkan ID Film yang dicari: ");
                    String idCari = sc.nextLine();
                    dllFilm.cariIDFilm(idCari);
                    break;
                case 9:
                    dllFilm.urutDataRatingDesc();
                    dllFilm.printList();
                    break;
                case 10:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 10);
        sc.close();
    }
}
