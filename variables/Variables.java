
package variables;

import java.util.*;

public class Variables {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String name = sc.nextLine();
    System.out.println(name);

    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int sum = a + b;

    System.out.println("Total: "+ sum);
  }
}