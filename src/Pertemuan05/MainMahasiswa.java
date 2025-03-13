package Pertemuan05;

import java.util.Scanner;

public class MainMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = input.nextInt();
        Mahasiswa mhs = new Mahasiswa(jmlMhs);
        System.out.println();
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM       : ");
            mhs.nimMhs[i] = input.nextInt();
            input.nextLine();
            System.out.print("Nama      : ");
            mhs.namaMhs[i] = input.nextLine();
            System.out.print("Tahun Masuk: ");
            mhs.tahunMasukMhs[i] = input.nextInt();
            System.out.print("Nilai UTS : ");
            mhs.nilaiUTSMhs[i] = input.nextInt();
            System.out.print("Nilai UAS : ");
            mhs.nilaiUASMhs[i] = input.nextInt();
            System.out.println();
        }

        System.out.println("Nilai UTS Tertinggi: " + mhs.nilaiUTSTertinggiDC(0, jmlMhs - 1));
        System.out.println("Nilai UTS Terendah: " + mhs.nilaiUTSTerendahDC(0, jmlMhs - 1));
        System.out.println("Rata-Rata Nilai UAS: " + mhs.rataRataUASBF());
        input.close();
    }
}
