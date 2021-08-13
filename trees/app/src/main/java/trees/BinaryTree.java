package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

Node root;


    public BinaryTree() {

    }

//    public  boolean isEmpty(){
//        if (root == null)
//            return true;
//
//      return false;
//    }

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
        }// End Main if
    }// End Function
///  inOrder Left ==>> Root  ==>> Right
    public  void inOrder(Node root){
        if (root != null){
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
}
