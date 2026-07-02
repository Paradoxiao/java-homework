import java.util.List;
import java.util.Scanner;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    HashSet<Integer> a = new HashSet<>(List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt())),
        b = new HashSet<>(List.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    a.retainAll(b);
    System.out.println(a.size());
    scanner.close();
  }
}
