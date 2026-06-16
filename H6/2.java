import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] s = scanner.nextLine().split(";");
    int[] a = new int[3];
    int sum = 0;
    for (int i = 0; i < 3; i++) {
      sum += a[i] = Integer.parseInt(s[i].substring(s[i].indexOf(":") + 1).trim());
      System.out.printf("%s--%d\n", s[i].substring(0, s[i].indexOf(":")).trim(), a[i]);
    }
    System.out.printf("总价格--%d", sum);
    scanner.close();
  }
}
