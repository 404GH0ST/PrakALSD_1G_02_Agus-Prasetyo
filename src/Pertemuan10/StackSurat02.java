package Pertemuan10;

public class StackSurat02 {
    Surat02[] stack;
    int size;
    int top;

    public StackSurat02(int size) {
        this.size = size;
        stack = new Surat02[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat02 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            System.out.println("Surat izin dari " + surat.namaMahasiswa + " berhasil diterima.");
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat02 pop() {
        if (!isEmpty()) {
            Surat02 surat = stack[top];
            top--;
            System.out.println("Surat izin dari " + surat.namaMahasiswa + " berhasil diproses.");
            return surat;
        } else {
            System.out.println("Stack surat kosong. Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack surat kosong. Tidak ada surat terakhir.");
            return null;
        }
    }

    public void cariSurat(String namaMahasiswa) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat izin dari " + namaMahasiswa + " ditemukan.");
                System.out.println("Detail Surat: ID" + stack[i].idSurat + ", Kelas=" + stack[i].kelas
                        + ", Jenis Izin=" + stack[i].jenisIzin + ", Durasi=" + stack[i].durasi);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat izin dari " + namaMahasiswa + " tidak ditemukan.");
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("Isi Stack Surat:");
            for (int i = top; i >= 0; i--) {
                System.out.println("ID: " + stack[i].idSurat + ", Nama: " + stack[i].namaMahasiswa + ", Kelas: "
                        + stack[i].kelas + ", Jenis: " + stack[i].jenisIzin + ", Durasi: " + stack[i].durasi);
            }
        } else {
            System.out.println("Stack surat kosong.");
        }
    }
}
