/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
       LinkedList l1=new LinkedList();
        l1.append(1);
        l1.append(2);
        l1.append(3);


l1.insertAfter(2,10);
        l1.insertAfter(10,8);
        System.out.println(l1.toString());

        l1.insertBefor(1,333);
        System.out.println("inserBefor Linklist "+l1.toString());
    }
}
