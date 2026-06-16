import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    if (n == 0) {
      System.out.print(1);
      return;
    }
    int pow = 1;
    for (int i = 1; i <= n; i++)
      pow *= i;
    System.out.print(pow);
  }
}
