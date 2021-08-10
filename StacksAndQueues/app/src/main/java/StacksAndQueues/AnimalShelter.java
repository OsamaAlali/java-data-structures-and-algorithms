package StacksAndQueues;

public class AnimalShelter <T> {
    Queue <T> dogs;
    Queue <T> cats;

    public AnimalShelter() {
        dogs=new Queue<>();
        cats=new Queue<>();
    }

    public void enqueue(T obj){
        if (obj instanceof Cats){
            cats.enqueue(obj);

        }else {
            dogs.enqueue(obj);
        }

    }

    public T dequeue(T obj){
        if (obj.equals("dog")){
            return dogs.dequeue();
        }else if(obj.equals("cat")){
            return  cats.dequeue();
        }else return null;
    }


}
