package Pertemuan2;

public class DosenMain02 {
    public static void main(String[] args) {

        Dosen02 dosen1 = new Dosen02();
        dosen1.idDosen = "DS01";
        dosen1.nama = "Dosen 1";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2020;
        dosen1.bidangKeahlian = "Sistem Informasi";
        dosen1.tampilkanInformasi();
        System.out.println("Masa Kerja Dosen 1: " + dosen1.hitungMasaKerja(2025) + " Tahun");

        Dosen02 dosen2 = new Dosen02("DS02", "Dosen 2", false, 2021, "Sistem Informasi");
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Teknik Informatika");
        dosen2.tampilkanInformasi();
        System.out.println("Masa Kerja Dosen 2: " + dosen2.hitungMasaKerja(2025) + " Tahun");

    }
}
