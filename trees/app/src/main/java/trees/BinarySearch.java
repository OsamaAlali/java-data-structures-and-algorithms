package trees;

public class BinarySearch  extends  BinaryTree{
Node root;
public  void  add(int value, Node root){
    if (this.root == null ){
       this.root=new Node(value);
        return;
    }
    if (root.value > value){
        if (root.left == null){
            root.left= new Node(value);
            return;
        }
        add(value,root.left);
    }

    if (root.value < value){
        if (root.right==null)
        { root.right= new Node(value);
        return;
        }

        add(value,root.right);
    }

}

public boolean contains(int value,Node root){
    if (root == null){
        return  false;
    }
    if ( root.value == value ){
        return true;
    }
    boolean c=false;
    if (value < root.value)
    {
     c=  contains(value,root.left);
    }else if (value > root.value){
       c = contains(value,root.right);
    }
    return c;
}

    @Override
    public String toString() {
        return "BinarySearch{" +
                "root=" + root +
                '}';
    }
}
