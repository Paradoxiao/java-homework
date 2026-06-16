
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int arrayLen = input.nextInt();
    int[] list = new int[arrayLen];
    for (int i = 0; i < arrayLen; i++)
      list[i] = input.nextInt();
    if (isSorted(list))
      System.out.println("Array sorted");
    else
      System.out.println("Array not sorted");
  }

  /* 请在这里填写答案 */
  public static boolean isSorted(int[] arr) {
    for (int i = 1; i < arr.length; i++)
      if (arr[i - 1] > arr[i])
        return false;
    return true;
  }
}
