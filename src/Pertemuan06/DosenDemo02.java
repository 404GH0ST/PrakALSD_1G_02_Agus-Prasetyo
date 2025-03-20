package Pertemuan06;

public class DosenDemo02 {
    public static void main(String[] args) {
        DataDosen02 list = new DataDosen02();

        Dosen02 dosen1 = new Dosen02("DSN01", "Bambang", false, 55);
        Dosen02 dosen2 = new Dosen02("DSN02", "Siti", true, 40);
        Dosen02 dosen3 = new Dosen02("DSN03", "Sugeng", false, 45);
        Dosen02 dosen4 = new Dosen02("DSN04", "Sri", true, 50);
        Dosen02 dosen5 = new Dosen02("DSN05", "Joko", false, 60);
        Dosen02 dosen6 = new Dosen02("DSN06", "Rini", true, 38);
        Dosen02 dosen7 = new Dosen02("DSN07", "Budi", false, 42);
        Dosen02 dosen8 = new Dosen02("DSN08", "Siti", true, 48);
        Dosen02 dosen9 = new Dosen02("DSN09", "Sugeng", false, 52);
        Dosen02 dosen10 = new Dosen02("DSN10", "Sri", true, 58);

        list.tambah(dosen1);
        list.tambah(dosen2);
        list.tambah(dosen3);
        list.tambah(dosen4);
        list.tambah(dosen5);
        list.tambah(dosen6);
        list.tambah(dosen7);
        list.tambah(dosen8);
        list.tambah(dosen9);
        list.tambah(dosen10);

        System.out.println("Data Dosen");
        list.tampil();
        System.out.println();
        System.out.println("Data Dosen Ascending Berdasarkan Usia");
        list.SortingASC();
        list.tampil();
        System.out.println();
        System.out.println("Data Dosen Descending Berdasarkan Usia");
        list.SortingDSC();
        list.tampil();
        System.out.println();
        System.out.println("Data Dosen Setelah INSERTION SORT (DESC)");
        list.insertionSort();
        list.tampil();
    }
}
