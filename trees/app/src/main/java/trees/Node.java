package trees;

import java.util.List;
import java.util.Objects;

public class Node <T>{
    Node  left;
    int value;
    Node right;
    Node  next;


    public Node(){

    }


    public Node(int value) {
        this.value = value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return value == node.value && Objects.equals(left, node.left) && Objects.equals(right, node.right) && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, value, right, next);
    }
}
