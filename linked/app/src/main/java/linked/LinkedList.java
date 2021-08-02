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
    public void append (int val) {
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
    // insert before
    public  void insertAfter(int searchValue,int newValue){

      if(head== null){
          insert(newValue);
      } else {
          Node search;
          search=head;
          Node newNode=new Node(newValue);
          while (search.next != null){

              if (search.value == searchValue ) {
                  newNode.next=search.next;
                  search.next = newNode;
                  break;
              }
              search=search.next;
          }// end While
        }

    }


    public void insertBefor(int searchValue,int newValue){


      if(( head.value==searchValue) || head == null){
          insert(newValue);
      }else {

          Node search=head;
          Node newNode=new Node(newValue);
          Node holder=search;
          while (search.next != null){

              if (search.value == searchValue){
                  holder.next=newNode;
                  newNode.next = search;
               break;
              }
              holder=search;
              System.out.println(holder.value);
              search=search.next;
          }

      }


    }
// Print List
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
// retrun List Item as String
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


    // Revers Linke list
    public  void reverse(){
        // {5}->{4}->{3}->{2}->{1}->NULL
        // null<-{5}->{4}->{3}->{2}->{1}
        if (!checkEmpty()){
            Node current = new Node();
            Node prev=new Node();
            Node fast=new Node();
            prev=null;
            current=head;
            while (current != null) {
                fast=current.next;
               current.next=prev;
               prev=current;
               current=fast;
            }
            head=prev;
        }
    }

}
