package Pertemuan10;

public class Mahasiswa02 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa02() {

    }

    Mahasiswa02(String nim, String nama, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
