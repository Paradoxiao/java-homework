import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] a = new int[5];
    for (int i = 0; i < 5; i++)
      a[i] = scanner.nextInt();
    scanner.close();
    for (int i = 0; i < 4; i++)
      for (int j = 0; j < 4 - i; j++)
        if (a[j] > a[j + 1]) {
          int temp = a[j + 1];
          a[j + 1] = a[j];
          a[j] = temp;
        }
    for (int j = 0; j < 5; j++)
      System.out.println(a[j]);
  }
}
