package Pertemuan13;

public class QueueVaksinasi02 {
    NodeAntrian02 head;
    NodeAntrian02 tail;
    int size;

    public QueueVaksinasi02() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(Penerima02 penerima) {
        NodeAntrian02 newNode = new NodeAntrian02(tail, penerima, null);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Data penerima vaksin berhasil ditambahkan.");
    }

    public Penerima02 hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong, tidak ada data yang dapat dihapus.");
            return null;
        }
        Penerima02 dataDihapus = head.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return dataDihapus;
    }

    public void cetakAntrian() {
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("    DAFTAR PENGANTRI VAKSIN   ");
        System.out.println("++++++++++++++++++++++++++++++");
        System.out.println("| No.\t|Nama\t|");
        if (!isEmpty()) {
            NodeAntrian02 current = head;
            while (current != null) {
                System.out.println("| " + current.data.nomorAntrian + "\t|" + current.data.namaPenerima + "\t|");
                current = current.next;
            }
        } else {
            System.out.println("|         Antrian Kosong     |");
            System.out.println("------------------------------");
        }
        System.out.println("Sisa Antrian: " + size);
    }

    public int getSize() {
        return size;
    }
}
