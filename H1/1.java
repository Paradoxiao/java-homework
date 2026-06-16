import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt(), b = scanner.nextInt();
    scanner.close();
    System.out.printf("%d+%d=%d", a, b, a + b);
  }
}
