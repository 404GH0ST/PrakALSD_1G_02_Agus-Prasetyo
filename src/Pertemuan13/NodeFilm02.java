package Pertemuan13;

public class NodeFilm02 {
    Film02 data;
    NodeFilm02 prev;
    NodeFilm02 next;

    public NodeFilm02(NodeFilm02 prev, Film02 data, NodeFilm02 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
