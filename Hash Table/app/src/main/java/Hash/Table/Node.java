package Hash.Table;

public class Node<T> {
    int key;
    T value;
    Node next;


    public Node() {
    }

    public Node(int key, T value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public T getValue() {
        return value;
    }
}
