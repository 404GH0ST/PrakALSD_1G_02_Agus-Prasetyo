package Pertemuan15;

public class BinaryTreeArray02 {
    Mahasiswa02[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray02() {
        this.dataMahasiswa = new Mahasiswa02[10];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa02 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast && idxStart < dataMahasiswa.length && dataMahasiswa[idxStart] != null) {
            traverseInOrder(2 * idxStart + 1);
            dataMahasiswa[idxStart].tampilInformasi();
            traverseInOrder(2 * idxStart + 2);
        }
    }

    public void add(Mahasiswa02 data) {
        if (idxLast + 1 < dataMahasiswa.length) {
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println("Array penuh, data tidak dapat ditambahkan.");
        }
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast && idxStart < dataMahasiswa.length && dataMahasiswa[idxStart] != null) {
            dataMahasiswa[idxStart].tampilInformasi();
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
}
