package day_08;

//ax**2 + bx + c = 0;

import java.util.*;

public class quadratic_equation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Double a = sc.nextDouble();
    Double b = sc.nextDouble();
    Double c = sc.nextDouble();
    Double D = (b * b) - (4 * a * c);

    System.out.println("A value: " + a + "\n B value: " + b +"\n C value: "+ c +"\n D value: "+ D);
    
    
    if (D > 0) {
      Double r1 = -b + (Math.sqrt(D)) / (2 * a);
      Double r2 = -b - (Math.sqrt(D)) / (2 * a);

      System.out.println("Root 1 value: " + r1 + "\n" + "Root 2 value: "+ r2);
    }
     else if(D == 0){
       Double r1 = -b / (2 * a);
       Double r2 = -b / (2 * a);
       System.out.println("Root 1 value: " + r1 + "\n" + "Root 2 value: "+ r2);
    }
    else if (D < 0) {
      Double realPart = -b * (2 * a);
      Double imaginary = Math.sqrt(D) / (2 * a);
      System.out.println("Roots are complex and different.");
      System.out.println("root1 = " + realPart + " + " + imaginary + "i");
      System.out.println("root2 = " + realPart + " - " + imaginary + "i");
    }
    
    
  }  
}
