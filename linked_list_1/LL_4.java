// Add node to given position
package linked_list_1;

public class LL_4 {
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

    public void givenPoistion(int position, int data) {
      Node newNode = new Node(data);

      if (head == null) {
        head = newNode;
        return;
      }

      Node current = head;
      for (int i = 1; i < position - 1; i++) {
        current = current.next;
      }

      newNode.next = current.next;
      current.next = newNode;
    }
  }

  public static void main(String[] args) {
    LL_4 outer = new LL_4();
    Linkedlist list = outer.new Linkedlist();

    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(50);
    list.addLast(60);
    list.addLast(70);
    list.printAll();

    list.givenPoistion(4, 40);
    list.printAll();
  }
}
