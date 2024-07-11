package linked_list;

public class Linked_list {

  private Node head;
  private Node tail;
  public 

  private class Node {
      private int data;
      private Node next;
    

      public Node(int data) {
        this.data = data;

      }

      public Node(int data, int next) {
        this.data = data;
        this.next = next;
      }
    
  }
}
