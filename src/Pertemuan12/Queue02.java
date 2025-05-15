package Pertemuan12;

public class Queue02 {
    NodeTugas02 front;
    NodeTugas02 rear;
    int size;

    public Queue02() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return false;
    }

    public void enqueue(MahasiswaTugas02 data) {
        NodeTugas02 newNode = new NodeTugas02(data);
        if (IsEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + data.nama + " berhasil masuk ke antrian.");
    }

    public MahasiswaTugas02 dequeue() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong. Tidak dapat memanggil antrian.");
            return null;
        }
        MahasiswaTugas02 removedData = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        System.out.println("Mahasiswa " + removedData.nama + " berhasil dipanggil dari antrian.");
        return removedData;
    }

    public void peek() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong.");
        } else {
            System.out.println("Antrian terdepan: ");
            front.data.tampilkanData();
        }
    }

    public void tampilkanTerakhir() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong.");
        } else {
            System.out.println("Antrian paling akhir: ");
            rear.data.tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong.");
            return;
        }
        NodeTugas02 current = front;
        System.out.println("Isi Antrian:");
        while (current != null) {
            current.data.tampilkanData();
            current = current.next;
        }
    }
}
