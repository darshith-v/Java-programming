import java.util.Arrays;

public class day_10 {
  public static void main(String[] args) {
    String s1 = "LISTEN";
    String s2 = "SILENT";

    //String into charactor
    char c1[] = s1.toCharArray();
    char c2[] = s2.toCharArray();

    if (c1.length != c2.length) {
      System.out.println("They are not anagram");
      System.exit(0);
    }

    Arrays.sort(c1);
    Arrays.sort(c2);

    for (int i = 0; i < c1.length; i++) {
      if (c1[i] != c2[i]) {
        System.out.println("They are not anagram");
        System.exit(0);
      }
    }
    System.out.println("Anagram");
  }
}