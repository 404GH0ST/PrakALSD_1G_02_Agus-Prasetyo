package Pertemuan03;

import java.util.Scanner;

public class DosenDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen02[] arrayOfDosen = new Dosen02[3];
        String kode, nama;
        boolean jenisKelamin;
        int usia, counter = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            jenisKelamin = sc.nextLine().equals("Wanita") ? true : false;
            System.out.print("Usia          : ");

            usia = Integer.parseInt(sc.nextLine());

            arrayOfDosen[i] = new Dosen02(kode, nama, jenisKelamin, usia);
            System.out.println("----------------------------");
        }
        for (Dosen02 dosen02 : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + (counter + 1));
            System.out.println("Kode          : " + dosen02.kode);
            System.out.println("Nama          : " + dosen02.nama);
            System.out.println("Jenis Kelamin : " + (dosen02.jenisKelamin ? "Wanita" : "Pria"));
            System.out.println("Usia          : " + dosen02.usia);
            System.out.println("----------------------------");
            counter++;
        }

        DataDosen02 dataDosen02 = new DataDosen02();
        dataDosen02.dataSemuaDosen(arrayOfDosen);
        dataDosen02.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen02.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen02.infoDosenPalingMuda(arrayOfDosen);
        dataDosen02.infoDosenPalingTua(arrayOfDosen);
        sc.close();
    }
}
