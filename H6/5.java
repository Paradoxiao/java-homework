import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] s = scanner.nextLine().split(" ");
    Arrays.sort(s);
    System.out.print(s[0]);
    for (int i = 1; i < s.length; i++)
      System.out.print(" " + s[i]);
    System.out.println();
    scanner.close();
  }
}
