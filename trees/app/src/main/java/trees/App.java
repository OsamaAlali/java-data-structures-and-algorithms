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

//    System.out.println(bts);


   bts.add(6,bts.root);
    bts.add(3,bts.root);
    bts.add(1,bts.root);
    bts.add(10,bts.root);
    bts.add(15,bts.root);
    bts.add(9,bts.root);


    System.out.println("the MAx Value is "+bts.maxValue( bts.root));


////    System.out.println(bts.contains(3, tree));
//System.out.println(bts);
////    bts.inOrder(bts.root);



}catch (Exception e){
    e.printStackTrace();
}

    }
}
