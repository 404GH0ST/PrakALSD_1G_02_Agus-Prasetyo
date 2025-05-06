package Pertemuan07;

public class DataDosen02 {
    Dosen02[] dataDosen = new Dosen02[10];
    int idx;

    void tambah(Dosen02 dosen) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dosen;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen02 dosen : dataDosen) {
            dosen.tampil();
            System.out.println("----------------------------");
        }
    }

    void SortingASC() {
        for (int i = 0; i < dataDosen.length - 1; i++) {
            for (int j = 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen02 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = temp;
                }
            }
        }
    }

    void SortingDSC() {
        for (int i = 0; i < dataDosen.length; i++) {
            int idxMax = i;
            for (int j = i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen02 temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;

        }
    }

    void insertionSort() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen02 temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    int sequentialSearch(String cari) {
        int posisi = -1;
        int jumlahDitemukan = 0;

        for (int i = 0; i < dataDosen.length; i++) {
            if (dataDosen[i].nama.equals(cari)) {
                jumlahDitemukan++;
                if (jumlahDitemukan == 1) {
                    posisi = i;
                } else {
                    System.out
                            .println("PERINGATAN: Ditemukan " + jumlahDitemukan + " data dengan nama '" + cari + "'!");
                }
            }
        }

        if (jumlahDitemukan > 1) {
            System.out.println("Pencarian mengembalikan posisi data pertama yang ditemukan.");
        }

        return posisi;
    }

    int findBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == dataDosen[mid].usia) {
                return mid;
            } else if (dataDosen[mid].usia > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }

        return -1;
    }

    void tampilPosisi(int pos) {
        if (pos != -1) {
            System.out.println("data dosen ditemukan pada indeks " + pos);
        } else {
            System.out.println("data dosen tidak ditemukan");
        }
    }
}
