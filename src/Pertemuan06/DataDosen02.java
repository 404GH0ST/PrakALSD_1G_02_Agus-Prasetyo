package Pertemuan06;

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
}
