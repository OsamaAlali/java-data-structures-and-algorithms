package linked;

public class NodeTable<T> {
int key;
T value;
NodeTable next ;

    public NodeTable(int key, T value) {
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
