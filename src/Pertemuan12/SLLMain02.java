package Pertemuan12;

import java.util.Scanner;

public class SLLMain02 {
    public static void main(String[] args) {
        SingleLinkedList02 sll = new SingleLinkedList02();
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = Double.parseDouble(sc.nextLine());
            Mahasiswa02 mhs = new Mahasiswa02(nim, nama, kelas, ipk);
            sll.addFirst(mhs);
        }

        sll.print();

        sc.close();
    }
}
