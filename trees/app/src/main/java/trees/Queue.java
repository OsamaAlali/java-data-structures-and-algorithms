package trees;

public class Queue <T> {

    Node  <T> front;
    Node <T> back;

    public Queue() {

    }
    public boolean isEmpty(){
        if(front== null)
            return true;
        return false;
    }
    public void  enqueue(Node data){

        if (isEmpty()){

            front=data;
            back=data;

        }else {
            back.next=data;
            back=back.next;
        }
    }
    public Node dequeue(){

        if (!isEmpty()){
            Node out=front;
            front=front.next;

            return out;
        }
        try {
            throw  new Exception("Queue Is Empty");
        } catch (Exception e) {
            e.printStackTrace();
            return  null;
        }

    }


}
