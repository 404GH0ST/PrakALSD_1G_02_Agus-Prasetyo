package Pertemuan03;

public class DataDosen02 {
    public void dataSemuaDosen(Dosen02[] arrayOfDosen) {
        int counter = 0;
        for (Dosen02 dosen02 : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + (counter + 1));
            System.out.println("Kode          : " + dosen02.kode);
            System.out.println("Nama          : " + dosen02.nama);
            System.out.println("Jenis Kelamin : " + (dosen02.jenisKelamin ? "Wanita" : "Pria"));
            System.out.println("Usia          : " + dosen02.usia);
            System.out.println("----------------------------");
            counter++;
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int jumlahWanita = 0;
        int jumlahPria = 0;
        for (Dosen02 dosen02 : arrayOfDosen) {
            if (dosen02.jenisKelamin) {
                jumlahWanita++;
            } else {
                jumlahPria++;
            }
        }
        System.out.println("Jumlah Dosen Wanita: " + jumlahWanita);
        System.out.println("Jumlah Dosen Pria: " + jumlahPria);
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int jumlahWanita = 0;
        int jumlahPria = 0;
        int totalUsiaWanita = 0;
        int totalUsiaPria = 0;
        for (Dosen02 dosen02 : arrayOfDosen) {
            if (dosen02.jenisKelamin) {
                jumlahWanita++;
                totalUsiaWanita += dosen02.usia;
            } else {
                jumlahPria++;
                totalUsiaPria += dosen02.usia;
            }
        }
        System.out.println("Rata-rata Usia Dosen Wanita: " + totalUsiaWanita / jumlahWanita);
        System.out.println("Rata-rata Usia Dosen Pria: " + totalUsiaPria / jumlahPria);
    }

    public void infoDosenPalingTua(Dosen02[] arrayOfDosen) {
        Dosen02 dosenPalingTua = arrayOfDosen[0];
        for (Dosen02 dosen02 : arrayOfDosen) {
            if (dosen02.usia > dosenPalingTua.usia) {
                dosenPalingTua = dosen02;
            }
        }
        System.out.println("Data Dosen Paling Tua");
        System.out.println("Kode          : " + dosenPalingTua.kode);
        System.out.println("Nama          : " + dosenPalingTua.nama);
        System.out.println("Jenis Kelamin : " + (dosenPalingTua.jenisKelamin ? "Wanita" : "Pria"));
        System.out.println("Usia          : " + dosenPalingTua.usia);
        System.out.println("----------------------------");
    }

    public void infoDosenPalingMuda(Dosen02[] arrayOfDosen) {
        Dosen02 dosenPalingMuda = arrayOfDosen[0];
        for (Dosen02 dosen02 : arrayOfDosen) {
            if (dosen02.usia < dosenPalingMuda.usia) {
                dosenPalingMuda = dosen02;
            }
        }
        System.out.println("Data Dosen Paling Muda");
        System.out.println("Kode          : " + dosenPalingMuda.kode);
        System.out.println("Nama          : " + dosenPalingMuda.nama);
        System.out.println("Jenis Kelamin : " + (dosenPalingMuda.jenisKelamin ? "Wanita" : "Pria"));
        System.out.println("Usia          : " + dosenPalingMuda.usia);
        System.out.println("----------------------------");
    }
}
