// Reverse linkedlist

package linked_list_1;


public class LL_3 {
    class Node{
      int data;
      Node next;

      Node(int data){
        this.data = data;
        this.next = null;

      }
  }

  class Linkedlist{
    Node head;

    public void addLast(int data){
      Node newNode = new Node(data);
      
      while(head == null){
        head = newNode;
        return;
      }

      Node current = head;
      while(current.next != null){
        current = current.next;
      }

      current.next = newNode;
    }

    public void reverseIteration(){
      Node prev = null;
      Node currt = head;
      Node nextNode = null;
      
      while(currt != null){
        nextNode = currt.next;
        currt.next = prev;

        //update
        prev = currt;
        currt = nextNode;
      }
      
      head = prev;        //update head to the new first node 
    }

    public void printAll(){
      Node current = head;

      while(current != null){
        System.out.print(current.data + "->");
        current = current.next;
      }
      System.out.println("null");
    }

  }

  public static void main(String[] args) {
    LL_3 outer = new LL_3();
    Linkedlist list = outer.new Linkedlist();

    list.addLast(1);
    list.addLast(2);
    list.addLast(3);
    list.addLast(4);
    list.addLast(5);

    list.printAll();

    list.reverseIteration();
    list.printAll();
  }
}
