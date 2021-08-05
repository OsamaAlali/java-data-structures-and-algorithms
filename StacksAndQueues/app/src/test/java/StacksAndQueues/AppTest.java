/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StacksAndQueues;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test public void  checkPush(){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        try {
            boolean out =false;
            assertEquals(false,s.isEmpty());

        }catch (Exception ios){
            ios.printStackTrace();
        }

    }

    @Test public void  multiple(){
        Stack<Integer> s=new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);

        Integer out =3;
        assertEquals(out,s.peek());
    }

    @Test public void popOff(){
        Stack<Integer> s=new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);

        Integer out =3;
        assertEquals(out,s.pop());
    }
    @Test public void empty(){
        Stack<Integer> s=new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);

        s.pop();
        s.pop();
        s.pop();
        boolean out =true;
        assertEquals(out,s.isEmpty());
    }

    @Test public  void peek(){
        Stack<Integer> s=new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);

        Integer out =3;
        assertEquals(out,s.peek());
    }

    @Test public void creobject(){
        Stack<Integer> s=new Stack<Integer>();

        boolean out =true;
        assertEquals(out,s.isEmpty());
    }

    @Test public void createObject(){
        Stack<Integer> s=new Stack<Integer>();

       String out="Stack is Empty";
        assertEquals(out,s.pop());
    }


    @Test public void enqueue(){
       Queue <Integer> q= new Queue<>();
q.enqueue(1);

        Integer out= 1;
        assertEquals(out,q.peek());
    }

    @Test public void multipleValue(){
        Queue <Integer> q= new Queue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        Integer out= 1;
        assertEquals(out,q.peek());
    }

    @Test public void dequ(){
        Queue <Integer> q= new Queue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.dequeue();
        q.dequeue();


        Integer out= 3;
        assertEquals(out,q.peek());

    }
    @Test public void peekInQueue(){
        Queue <Integer> q= new Queue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.dequeue();



        Integer out= 2;
        assertEquals(out,q.peek());

    }

    @Test public void emptyQueue(){
        Queue <Integer> q= new Queue<>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        q.dequeue();
        q.dequeue();
        q.dequeue();
        boolean out= true;
        assertEquals(out,q.isEmpty());

    }

    @Test public void checkExpation (){
        Queue <Integer> q= new Queue<>();
      String   out="Queue Is Empty";
        assertEquals(out,q.peek());

    }
}