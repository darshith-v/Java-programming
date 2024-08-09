//Reverse linkedlist through Iteration
package day_09;

public class LL {
  class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  class Linkedlist {
    Node head;

    public void addLast(int data) {
      Node newNode = new Node(data);

      if (head == null) {
        head = newNode;
        return;
      }
      // Traverse
      Node current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = newNode;
    }

    public void printAll() {
      Node current = head;
      while (current != null) {
        System.out.print(current.data + "->");
        current = current.next;
      }
      System.out.println("null");
    }

    public void reverseIteration() {
      Node prev = null;
      Node currt = head;
      Node nextNode = null;

      while (currt != null) {
        nextNode = currt.next;
        currt.next = prev;

        // update
        prev = currt;
        currt = nextNode;
      }
      head = prev; //update head to the new Node
    }
  }
  
  public static void main(String[] args) {
    LL outer = new LL();
    Linkedlist list = outer.new Linkedlist();

    list.addLast(10);    
    list.addLast(20);    
    list.addLast(30);    
    list.addLast(40);    
    list.addLast(50);
    list.printAll();

    list.reverseIteration();
    list.printAll();

  }
}
