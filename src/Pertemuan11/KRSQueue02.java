package Pertemuan11;

public class KRSQueue02 {
    Mahasiswa02[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahDiproses;

    public KRSQueue02(int max) {
        this.max = max;
        this.data = new Mahasiswa02[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jumlahDiproses = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa02 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        if (IsEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian KRS.");
    }

    public Mahasiswa02 dequeue() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa02 mhs = data[front];
        front = (front + 1) % max;
        size--;
        if (IsEmpty()) {
            front = rear = -1;
        }
        return mhs;
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 mahasiswa, tidak bisa proses KRS.");
            return;
        }
        System.out.println("Memproses KRS untuk 2 mahasiswa terdepan:");
        Mahasiswa02 mhs1 = dequeue();
        if (mhs1 != null) {
            System.out.print("Mahasiswa 1: ");
            mhs1.tampilkanData();
            jumlahDiproses++;
        }
        Mahasiswa02 mhs2 = dequeue();
        if (mhs2 != null) {
            System.out.print("Mahasiswa 2: ");
            mhs2.tampilkanData();
            jumlahDiproses++;
        }
        System.out.println("Proses KRS selesai.");
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian KRS kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian KRS:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanPertamadanKedua() {
        if (size == 0) {
            System.out.println("Antrian KRS kosong.");
        } else if (size == 1) {
            System.out.println("Mahasiswa terdepan:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        } else {
            System.out.println("2 Mahasiswa terdepan:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
            data[(front + 1) % max].tampilkanData();
        }
    }

    public void tampilkanTerakhir() {
        if (IsEmpty()) {
            System.out.println("Antrian KRS kosong.");
        } else {
            System.out.println("Mahasiswa paling belakang:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahDiproses() {
        return jumlahDiproses;
    }

    public int getSisa() {
        return size;
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            jumlahDiproses = 0;
            System.out.println("Antrian KRS berhasil dikosongkan");
        } else {
            System.out.println("Antrian KRS masih kosong");
        }
    }
}