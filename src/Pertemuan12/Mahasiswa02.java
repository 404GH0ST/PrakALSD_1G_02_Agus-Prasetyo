package Pertemuan12;

public class Mahasiswa02 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa02() {

    }

    Mahasiswa02(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi() {
        System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}