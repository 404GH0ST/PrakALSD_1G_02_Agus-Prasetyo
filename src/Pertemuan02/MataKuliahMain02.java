package Pertemuan02;

public class MataKuliahMain02 {
    public static void main(String[] args) {
        MataKuliah02 mk1 = new MataKuliah02();
        mk1.kodeMK = "MK01";
        mk1.nama = "Dasar Pemrograman";
        mk1.sks = 3;
        mk1.jumlahJam = 8;
        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(4);
        mk1.kurangiJam(2);
        mk1.tampilkanInformasi();

        MataKuliah02 mk2 = new MataKuliah02("MK02", "Basis Data", 4, 6);
        mk2.tampilkanInformasi();
        mk2.kurangiJam(100);
    }
}
