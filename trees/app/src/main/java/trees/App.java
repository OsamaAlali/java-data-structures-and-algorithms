/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
try {


    BinarySearch bts=new BinarySearch();
Node tree=new Node(7);
    System.out.println(bts);

   bts.add(6,tree);
    bts.add(3,tree);
    bts.add(1,tree);
    bts.add(10,tree);
    bts.add(2,tree);
    bts.add(4,tree);

//    System.out.println(bts.contains(3, tree));
//
    bts.preOrder(tree);


}catch (Exception e){
    e.printStackTrace();
}

    }
}