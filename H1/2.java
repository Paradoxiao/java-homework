import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    int j = 0;
    for (int i = 1; i <= n; i++) {
      if (j++ > 0)
        System.out.print(' ');
      System.out.print(i);
      if (j == 10) {
        j = 0;
        System.out.println();
      }
    }
  }
}
