import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char a = 'A', b = 'B', c = 'C', d = 'D', e = 'E';
    while (scanner.hasNext()) {
      int n = scanner.nextInt();
      char tmp;
      switch (n) {
        case 1:
          tmp = a;
          a = b;
          b = c;
          c = d;
          d = e;
          e = tmp;
          break;
        case 2:
          tmp = e;
          e = d;
          d = c;
          c = b;
          b = a;
          a = tmp;
          break;
        case 3:
          tmp = a;
          a = b;
          b = tmp;
          break;
      }
    }
    scanner.close();
    System.out.printf("%c,%c,%c,%c,%c", a, b, c, d, e);
  }
}
