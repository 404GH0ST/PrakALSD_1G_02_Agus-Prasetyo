package Pertemuan12;

public class MahasiswaTugas02 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public MahasiswaTugas02(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println("NIM: " + nim + ", Nama: " + nama + ", Prodi: " + prodi + ", Kelas: " + kelas);
    }
}
