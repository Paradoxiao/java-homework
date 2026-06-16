import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] s = scanner.nextLine().split(",");
    for (int i = 0; i < s.length; i++)
      System.out.print(s[i].split("/")[2] + ";");
    scanner.close();
  }
}
