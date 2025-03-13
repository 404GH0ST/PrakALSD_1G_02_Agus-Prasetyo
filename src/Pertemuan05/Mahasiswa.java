package Pertemuan05;

public class Mahasiswa {
    String[] namaMhs;
    int[] nimMhs, tahunMasukMhs, nilaiUTSMhs, nilaiUASMhs;

    Mahasiswa(int jmlMahasiswa) {
        namaMhs = new String[jmlMahasiswa];
        nimMhs = new int[jmlMahasiswa];
        tahunMasukMhs = new int[jmlMahasiswa];
        nilaiUTSMhs = new int[jmlMahasiswa];
        nilaiUASMhs = new int[jmlMahasiswa];
    }

    int nilaiUTSTertinggiDC(int awal, int akhir) {
        if (awal == akhir) {
            return nilaiUTSMhs[awal];
        } else if (awal < akhir) {
            int mid = (awal + akhir) / 2;
            int nilaiKiri = nilaiUTSTertinggiDC(awal, mid);
            int nilaiKanan = nilaiUTSTertinggiDC(mid + 1, akhir);
            return (nilaiKiri > nilaiKanan) ? nilaiKiri : nilaiKanan;
        }
        return 0;
    }

    int nilaiUTSTerendahDC(int awal, int akhir) {
        if (awal == akhir) {
            return nilaiUTSMhs[awal];
        } else if (awal < akhir) {
            int mid = (awal + akhir) / 2;
            int nilaiKiri = nilaiUTSTerendahDC(awal, mid);
            int nilaiKanan = nilaiUTSTerendahDC(mid + 1, akhir);
            return (nilaiKiri < nilaiKanan) ? nilaiKiri : nilaiKanan;
        }
        return 0;
    }

    double rataRataUASBF() {
        double total = 0;
        for (int i = 0; i < nilaiUASMhs.length; i++) {
            total = total + nilaiUASMhs[i];
        }
        return total / nilaiUASMhs.length;
    }
}
