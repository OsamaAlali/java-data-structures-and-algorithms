package StacksAndQueues;

public class PseudoQueue <T> {
    Stack <T> stack1;
    Stack <T> stack2;

    public PseudoQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void  enqueue( T data){
        stack1.push(data);

    }
    public T dequeue(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        T data=stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
      return data;
    }
}
