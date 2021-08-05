package StacksAndQueues;

public class Stack<T> {
    Node <T> top;

    public Stack() {
        top=null;
    }
    public boolean isEmpty(){
        if (top == null)
            return true;
         return false;
    }
   public void push(T data){
        if (isEmpty()){
            Node newNode=new Node(data);

            top=newNode;

        }else {
            Node newNode=new Node(data);
            Node current= top;
            top=newNode;
            top.next=current;
            current=null;

        }
   }

   public T pop(){
        if(!isEmpty()){

        T value= top.value;
        top=top.next;

        return value;
        }
       try {
           throw new Exception("Stack is Empty");
       } catch (Exception e) {
           e.printStackTrace();
           return (T) "Stack is Empty";
       }

   }
  public T peek(){

        if (isEmpty())
        {
            try {
                throw new Exception("Stack is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return (T) "Stack is Empty";
            }

        }else
            return top.value;
  }

}
