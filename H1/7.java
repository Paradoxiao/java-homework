import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.close();
    System.out.printf("%d%s是闰年", n, n % 100 != 0 && n % 4 == 0 || n % 400 == 0 ? "" : "不");
  }
}
