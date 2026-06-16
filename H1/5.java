import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      if (n < 0 || n > 100) {
        System.out.println("error!");
        continue;
      }
      n /= 10;
      char ch;
      switch (n) {
        case 10:
        case 9:
          ch = 'A';
          break;
        case 8:
          ch = 'B';
          break;
        case 7:
          ch = 'C';
          break;
        case 6:
          ch = 'D';
          break;
        default:
          ch = 'E';
      }
      System.out.println(ch);
    }
    scanner.close();
  }
}
