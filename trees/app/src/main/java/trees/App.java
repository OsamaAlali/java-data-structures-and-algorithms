/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

//public static List<String> result=new ArrayList<>();
//public static  List <String>  fizzBuzzTree(KAry node){
//
//    if (node == null){
//
//        return result;
//    }
//
//    int count=node.child.length;
//
//    for (int i = 0; i < count -1; i++) {
//        fizzBuzzTree(node.child[i]);
//
//        if (node.value %3 == 0){
//            result.add("Fizz");
//
//        }else if (node.value % 5 == 0 ){
//
//            result.add("Buzz");
//        }else if (( node.value % 3 == 0 ) && (node.value %5 == 0)){
//
//            result.add("FizzBuzz");
//        }else{
//            String turn=String.valueOf(node.value);
//            result.add(turn);
//        }
//
//    }
//       fizzBuzzTree(node.child[count -1]);
//    return res

/// Challeng32 write method take 2 tree
   static List <Integer> list =new ArrayList<>();
    public static List treeIntersection(Node firstTree,Node secondTree){
        BinarySearch b=new BinarySearch();
        if(b.contains(firstTree.value ,secondTree)){
            list.add(firstTree.value) ;
        }
        if (firstTree.left != null){
            treeIntersection(firstTree.left,secondTree);
        }
        if(firstTree.right != null){
            treeIntersection(firstTree.right,secondTree);
        }
      return list;
//        if(firstTree.value == secondTree.value){
////            list.add(firstTree.value);
//            System.out.println(firstTree.value);
//        }
//        if (secondTree.left != null && firstTree.value != secondTree.value){
//            treeIntersection(firstTree,secondTree.left);
//        }
//        if (secondTree.right != null && firstTree.value != secondTree.value){
//            treeIntersection(firstTree,secondTree.right);
//        }
//        if (firstTree.left != null){
//            treeIntersection(firstTree.left,secondTree);
//        }
//        if(firstTree.right != null){
//            treeIntersection(firstTree.right,secondTree);
//        }
    }//endFunction


    public static void main(String[] args) {
try {

    Graphs graphs=new Graphs();
    graphs.addVertex(1);
    graphs.addVertex(2);
    graphs.addVertex(3);
    graphs.addVertex(4);
    graphs.addVertex(5);

         graphs.addEdge(1,2);
         graphs.addEdge(1,3);
         graphs.addEdge(3,2);
         graphs.addEdge(3,4);
         graphs.addEdge(5,2);
         graphs.addEdge(5,4);

//    System.out.println(graphs.size());
// return all nodes in graph

//      graphs.getNodes();

//List<Node> list =graphs.getNeighbors(1);
//    for (Node node : list) {
//        System.out.println(node.value);
//    }

//code challenge 36 Breadth First

//    Set<Node> set = graphs.breadthFirst((Node) graphs.adjVertices.keySet().toArray()[0]);
//    for (Node node : set) {
//        System.out.println(node.value);
//    }

// code challenge 38 Depth

Set <Node>setDepth=graphs.depthFirstTraversal((Node) graphs.adjVertices.keySet().toArray()[0]);

    for (Node node : setDepth) {
        System.out.println(node.value);
    }









//    BinaryTree bts=new BinaryTree();
//    bts.addBinaryTree(6,bts.root);
//    bts.addBinaryTree(9,bts.root);
//    bts.addBinaryTree(5,bts.root);
//    bts.addBinaryTree(3,bts.root);
//    bts.addBinaryTree(10,bts.root);
//    bts.addBinaryTree(1,bts.root);
//    bts.preOrder(bts.root);
//    System.out.println();
//    BinaryTree bts2=new BinaryTree();
//    bts2.addBinaryTree(5,bts2.root);
//    bts2.addBinaryTree(4,bts2.root);
//    bts2.addBinaryTree(10,bts2.root);
//    bts2.addBinaryTree(2,bts2.root);
//    bts2.addBinaryTree(8,bts2.root);
//    bts2.addBinaryTree(9,bts2.root);
//    bts2.preOrder(bts2.root);
//    System.out.println("#######");
//
//    List list;
//  list= treeIntersection(bts.root,bts2.root);
//    for (Object o : list) {
//        System.out.println(o);
//    }


//    KAry root = new KAry(1, 2);
//    root.child[0] = new KAry(2, 2);
//    root.child[1] = new KAry(3, 2);
//    root.child[0].child[0] = new KAry(4, 2);
//    root.child[0].child[1] = new KAry(5, 2);
//
//    System.out.println(fizzBuzzTree(root));


//    BinarySearch bts=new BinarySearch();




//    System.out.println(bts.contains(67, bts.root));
//////
//        Bridth first
//////
//  bts.bredthFirst(bts.root);
//  Max Value
//    System.out.println("the MAx Value is "+bts.maxValue( bts.root));


////    System.out.println(bts.contains(3, tree));
//System.out.println(bts);
////    bts.inOrder(bts.root);



}catch (Exception e){
    e.printStackTrace();
}

    }
}
