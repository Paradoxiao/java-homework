import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int array[] = new int[n];

    for (int i = 0; i < n; i++) {
      array[i] = sc.nextInt();
    }

    MyArrays.printArray(array);// 显示数组的内容
    MyArrays.sortArray(array); // 对数组元素排序
    MyArrays.printArray(array);// 显示排序后的结果
    int sum = MyArrays.sumOfArray(array);// 数组元素求和
    System.out.println(sum);// 显示数组元素的和

  }

}

/* 请在这里填写MyArrays类的有关代码 */
class MyArrays {

  // private static void sort(int[] a, int l, int r) {
  // if (l >= r)
  // return;
  // int p = a[(l + r) / 2];
  // int i = l, j = r;
  // while (true) {
  // while (a[i] < p)
  // ++i;
  // while (a[j] > p)
  // --j;
  // if (i >= j)
  // break;
  // int tmp = a[i];
  // a[i] = a[j];
  // a[j] = tmp;
  // ++i;
  // --j;
  // }
  // sort(a, l, i - 1);
  // sort(a, j + 1, r);
  // }

  private static void sort(int[] a, int l, int r) {
    for (int i = l; i < r; i++)
      for (int j = l; j < r - i; j++)
        if (a[j] > a[j + 1]) {
          int temp = a[j + 1];
          a[j + 1] = a[j];
          a[j] = temp;
        }
  }

  public static void printArray(int[] arr) {
    System.out.print(arr[0]);
    for (int i = 1; i < arr.length; i++)
      System.out.print("," + arr[i]);
    System.out.println();
  }

  public static void sortArray(int[] arr) {
    sort(arr, 0, arr.length - 1);
  }

  public static int sumOfArray(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++)
      sum += arr[i];
    return sum;
  }
}
