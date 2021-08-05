/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StacksAndQueues;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

       Stack <Integer> s1=new Stack<Integer>();
       s1.push(2);
       s1.push(3);
       s1.push(4);
        System.out.println("Is Empty "+s1.isEmpty());
        System.out.println("Peek  "+s1.peek()+"\n");
        System.out.println("POP = "+s1.pop());
        System.out.println("POP = "+s1.pop());
        System.out.println("POP = "+s1.pop());
        System.out.println("POP = "+s1.pop());
        System.out.println("Peek : "+s1.peek());
        ////////////////////////////////
        /////////////////////////////
        System.out.println("Queue\n");

        Queue<Integer> q=new Queue<>();
        System.out.println(q.isEmpty());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        System.out.println(q.isEmpty());



        System.out.println("Dequeue = "+q.dequeue());
        System.out.println("Dequeue = "+q.dequeue());
        System.out.println("Dequeue = "+q.dequeue());
        System.out.println("Dequeue = "+q.dequeue());
        System.out.println(q.dequeue());// return expcetion


    }
}