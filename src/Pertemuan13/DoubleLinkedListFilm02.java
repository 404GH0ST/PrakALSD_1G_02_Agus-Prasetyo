package Pertemuan13;

public class DoubleLinkedListFilm02 {
    NodeFilm02 head;
    int size;

    public DoubleLinkedListFilm02() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(Film02 film) {
        NodeFilm02 newNode = new NodeFilm02(null, film, head);
        if (!isEmpty()) {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void addLast(Film02 film) {
        if (isEmpty()) {
            addFirst(film);
        } else {
            NodeFilm02 current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeFilm02 newNode = new NodeFilm02(current, film, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Film02 film, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        if (index == 0) {
            addFirst(film);
        } else if (index == size) {
            addLast(film);
        } else {
            NodeFilm02 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            NodeFilm02 newNode = new NodeFilm02(current.prev, film, current);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public Film02 removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("List masih kosong, tidak dapat dihapus!");
        }
        Film02 dataDihapus = head.data;
        if (head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return dataDihapus;
    }

    public Film02 removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("List masih kosong, tidak dapat dihapus!");
        }
        Film02 dataDihapus;
        if (head.next == null) {
            dataDihapus = head.data;
            head = null;
        } else {
            NodeFilm02 current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            dataDihapus = current.next.data;
            current.next = null;
        }
        size--;
        return dataDihapus;
    }

    public Film02 remove(int index) throws Exception {
        if (isEmpty() || index < 0 || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            NodeFilm02 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Film02 dataDihapus = current.data;
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            return dataDihapus;
        }
    }

    public void printList() {
        if (isEmpty()) {
            System.out.println("Daftar Film Kosong.");
            return;
        }
        System.out.println("CETAK DATA FILM LAYAR LEBAR");
        NodeFilm02 current = head;
        while (current != null) {
            System.out.println("------------------------------");
            System.out.println("ID Film   : " + current.data.id);
            System.out.println("\tJudul Film: " + current.data.judul);
            System.out.println("\tIMDB Rating: " + current.data.rating);
            current = current.next;
        }
        System.out.println("------------------------------");
        System.out.println("Total Film: " + size);
    }

    public void cariIDFilm(String id) {
        NodeFilm02 current = head;
        int nodeKe = 0;
        boolean ditemukan = false;
        while (current != null) {
            if (current.data.id.equalsIgnoreCase(id)) {
                System.out.println("Data ID Film: " + id + " berada di node ke-" + (nodeKe + 1));
                System.out.println("IDENTITAS:");
                System.out.println("ID Film   : " + current.data.id);
                System.out.println("Judul Film: " + current.data.judul);
                System.out.println("IMDB Rating: " + current.data.rating);
                ditemukan = true;
                break;
            }
            current = current.next;
            nodeKe++;
        }
        if (!ditemukan) {
            System.out.println("Film dengan ID " + id + " tidak ditemukan.");
        }
    }

    public void urutDataRatingDesc() {
        if (size <= 1) {
            return;
        }
        boolean swapped;
        do {
            swapped = false;
            NodeFilm02 current = head;
            while (current.next != null) {
                if (current.data.rating < current.next.data.rating) {
                    Film02 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);
        System.out.println("Data film berhasil diurutkan berdasarkan rating (DESC).");
    }
}
