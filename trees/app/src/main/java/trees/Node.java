package trees;

import java.util.List;

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
}
