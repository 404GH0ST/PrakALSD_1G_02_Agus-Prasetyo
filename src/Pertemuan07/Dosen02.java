package Pertemuan07;

public class Dosen02 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen02(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Wanita" : "Pria"));
        System.out.println("Usia          : " + usia);
    }
}
