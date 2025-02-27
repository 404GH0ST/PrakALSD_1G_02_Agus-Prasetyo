package Pertemuan01;

public class Fungsi {

    static void tampilkanPendapatan(int[][] stok, int[] harga) {
        int[] pendapatan = new int[stok.length];
        for (int i = 0; i < stok.length; i++) {
            for (int j = 0; j < stok[i].length; j++) {
                pendapatan[i] += stok[i][j] * harga[j];
            }
            System.out.println("Pendapatan RoyalGarden " + (i + 1) + " : Rp " + pendapatan[i]);
        }
    }

    static int[] cekStokRoyalGarden4(int[] stok, String[] daftarBunga, int[] informasiTambahan) {
        if (informasiTambahan != null) {
            for (int i = 0; i < informasiTambahan.length; i++) {
                stok[i] -= informasiTambahan[i];
            }
        }

        for (int i = 0; i < stok.length; i++) {
            System.out.println("Stok bunga " + daftarBunga[i] + " pada RoyalGarden 4 : " + stok[i]);
        }

        return stok;
    }

    public static void main(String[] args) {
        String[] daftarBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        int[][] stok = { { 10, 5, 15, 7 }, { 6, 11, 9, 12 }, { 2, 10, 10, 5 }, { 5, 7, 12, 9 } };
        int[] harga = { 75_500, 50_000, 60_000, 10_000 };
        int[] penguranganStok = { 1, 2, 0, 5 };

        tampilkanPendapatan(stok, harga);
        System.out.println("======================");
        stok[3] = cekStokRoyalGarden4(stok[3], daftarBunga, null);
        System.out.println("======================");
        stok[3] = cekStokRoyalGarden4(stok[3], daftarBunga, penguranganStok);
    }
}
