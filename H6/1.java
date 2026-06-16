import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double n1 = Math.random();
    int n2 = in.nextInt();
    int n3 = in.nextInt();
    double n4 = 0;

    /* 请在这里填写答案 */
    n4 = Math.round(Math.sqrt(n2) + Math.log(n3));
    // 判断随机数n1是否为整数并且是2-23之间的数
    n1 = (int) n1;
    n1 = (n1 % 22 + 2) % 22 + 2;
    if (n1 == (int) n1 && n1 >= 2 && n1 <= 23) {
      System.out.println("random");
    }
    System.out.println(n4);

  }
}
