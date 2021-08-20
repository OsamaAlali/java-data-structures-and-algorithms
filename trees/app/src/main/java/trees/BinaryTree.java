package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

Node root;
    public BinaryTree() {

    }
List<Integer> list=new ArrayList<Integer>();

    public void bredthFirst(Node root){

        Queue breadth=new Queue();
         breadth.enqueue(root);
         while (!breadth.isEmpty()){
             Node front= breadth.dequeue();
             if(front.left !=null){
                 breadth.enqueue(front.left);
             }
             if (front.right != null){
                 breadth.enqueue(front.right);
             }
             System.out.print(front.value);
         }

    }

    // PreOrder Root =>> Left =>> Right
    public  void preOrder(Node root){
        if ( root != null ){
            System.out.println(root.value);
            if (root.left !=null){
                preOrder(root.left);
            }
            if ( root.right != null ){
                preOrder(root.right);
            }
        }// End Main if hg
    }// End Function
///  inOrder Left ==>> Root  ==>> Right
    public  void inOrder(Node root){
        if (root.left != null){
            inOrder(root.left);
        }
        System.out.println(root.value);
        if (root.right != null){
            inOrder(root.right);
        }

    }// End Function

    /// pstOrder  Left ==> right == >Root

    public  void postOrder(Node root){
        if (root.left != null){
            postOrder(root.left);
        }
        if (root.right != null){
            postOrder( root.right);
        }
        System.out.println(root.value);
    }

    int max=0;
    public int maxValue(Node root){
        if (root.right == null){
            max=root.value;
        }
        if (root.right != null)
        { maxValue(root.right);}

        return max;
    }
}
