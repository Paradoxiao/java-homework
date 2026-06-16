import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] a = new int[3][];
    int len = 0, n;
    for (int i = 0; i < 3; i++) {
      len += n = scanner.nextInt();
      a[i] = new int[n];
      for (int j = 0; j < n; j++)
        a[i][j] = scanner.nextInt();
    }
    scanner.close();
    int[] arr = new int[len];
    int i = 0;
    for (int j = 0; j < 3; j++)
      for (int k = 0; k < a[j].length; k++)
        arr[i++] = a[j][k];
    sort(arr, 0, arr.length - 1);
    System.out.print(arr[0]);
    for (int j = 1; j < arr.length; j++)
      System.out.print(" " + arr[j]);
    System.out.println();
  }

  // private static void sort(int[] a, int l, int r) {
  // if (l >= r)
  // return;
  // int p = a[(l + r) / 2];
  // int i = l, j = r;
  // while (true) {
  // while (a[i] > p)
  // ++i;
  // while (a[j] < p)
  // --j;
  // if (i >= j)
  // break;
  // int tmp = a[i];
  // a[i] = a[j];
  // a[j] = tmp;
  // ++i;
  // --j;
  // }
  // sort(a, j + 1, r);
  // sort(a, l, i - 1);
  // }

  private static void sort(int[] a, int l, int r) {
    int length = r - l + 1;
    for (int i = 0; i < length - 1; i++)
      for (int j = l; j < r - i; j++)
        if (a[j] < a[j + 1]) {
          int temp = a[j + 1];
          a[j + 1] = a[j];
          a[j] = temp;
        }
  }
}
