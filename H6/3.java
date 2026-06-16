import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();
    int cha = 0, space = 0, number = 0, other = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (Character.isLetter(c)) {
        cha++;
        continue;
      }
      if (Character.isDigit(c)) {
        number++;
        continue;
      }
      if (Character.isSpaceChar(c)) {
        space++;
        continue;
      }
      other++;
    }
    System.out.printf("英文字母%d空格%d数字%d其他%d", cha, space, number, other);
    scanner.close();
  }
}
