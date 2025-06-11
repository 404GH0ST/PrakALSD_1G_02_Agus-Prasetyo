package Pertemuan13;

public class NodeAntrian02 {
    Penerima02 data;
    NodeAntrian02 prev;
    NodeAntrian02 next;

    public NodeAntrian02(NodeAntrian02 prev, Penerima02 data, NodeAntrian02 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
