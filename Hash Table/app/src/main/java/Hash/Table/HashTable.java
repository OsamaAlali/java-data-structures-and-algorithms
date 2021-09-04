package Hash.Table;

import java.sql.Array;
import java.util.Arrays;

public class HashTable <T>{
    Node []array;
    int size;

    public HashTable( int size) {
        this.size = size;
        array=new Node[this.size];

    }
public  int createHash(int key){

        return key %size;
}

private void addLast(Node last,Node newNode){
        if (last.next != null){
            addLast(last.next,newNode);
        }
        last.next = newNode;
}

public void push(int k,T value){
int index =createHash(k);
    System.out.println( "  Key: "+k +" The Index :"+index );
    Node newNode=new Node<>(k,value);
if (array[index] == null){
    array[index]=newNode;

}else {
   addLast(array[index],newNode);
}
}

private T getValue(Node node,int k){
          if (node.key == k){
          return    (T) node.value;
          }
       return node.next != null? getValue(node.next,k): (T) "item not Found";
}
public boolean contains(int key){
     if (get(key) .equals("item not Found")){
         return false;
     }
     return true;
}

public String get(int key){
    int index=createHash(key);
    if(array[index] != null){

        return (String) getValue(array[index],key);
    }

    return "Theres No Key";
}



private void print(Node node) {
    if (node != null) {
        System.out.print("{ Key " + node.key + " The Value :" + node.value + " } ==>");
        if (node.next != null) {
            print(node.next);

        }
        System.out.println();
    }
}

public void printArray(){
    for (int i = 0; i <array.length ; i++) {
       print(array[i]);

    }
}

    @Override
    public String toString() {
        return "HashTable{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
