package StacksAndQueues;

public class Queue <T>{
    Node  <T> front;
    Node <T> back;

    public Queue() {

    }
    public boolean isEmpty(){
        if(front== null)
            return true;
        return false;
    }
public void  enqueue(T data){
    Node newNode=new Node(data);
        if (isEmpty()){

            front=newNode;
            back=newNode;

        }else {
            back.next=newNode;
            back=back.next;
        }
}
public T dequeue(){

   if (!isEmpty()){
       T out=front.value;
       front=front.next;

       return out;
   }
    try {
        throw  new Exception("Queue Is Empty");
    } catch (Exception e) {
        e.printStackTrace();
        return (T) "Queue Is Empty";
    }

}
public T peek(){
       if(isEmpty())
       {
           try {
               throw new Exception("Queue Is Empty");
           } catch (Exception e) {
               e.printStackTrace();
               return (T) "Queue Is Empty";
           }


       }

       return front.value;
}

}
