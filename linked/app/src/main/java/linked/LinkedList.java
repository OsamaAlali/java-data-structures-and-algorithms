package linked;

public class LinkedList {
    Node head;
    Node tail;


    // end constatcton
    // check if list is empty
    public boolean checkEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    // Add element to last List;
    public void addLast(int val) {
        Node newNode = new Node(val);
        if (checkEmpty()) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;

        }
    }

    // add to First elemante
    public void insert (int val) {
        Node newNode = new Node(val);
        if (checkEmpty()) {
            head = newNode;
            tail = head;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void print() {
        if (!checkEmpty()) {
            Node current = new Node();
            current = head;
            while (current != null) {
                System.out.println(current.value);
                current = current.next;
            }

        } else {
            System.out.println("list empty");
        }
    }
// check Value if exist in list
    public boolean includes (int val) {
        if (!checkEmpty()) {
            Node current = new Node();
            current = head;
            while (current != null) {
                if (current.value == val){
                    return true;
                }
                current = current.next;
            }

        }
        return false;
    }

    public String toString(){
        String msg="";
        if (!checkEmpty()) {
            Node current = new Node();
            current = head;

            while (current != null) {
 msg +="{"+String.valueOf(current.value)+"}->";
                current = current.next;
            }

        }else { return  "list is Empty";}

      return (msg +"NULL")  ;
    }


}
