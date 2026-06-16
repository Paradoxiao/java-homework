import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    int sum = 1;
    System.out.print(1);
    for (int i = 2; i <= n; i++) {
      System.out.print("+" + i);
      sum += i;
    }
    System.out.print("=" + sum);
  }
}
