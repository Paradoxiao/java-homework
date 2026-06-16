import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(new Date(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()).days());
    scanner.close();
  }
}

class Date {
  int year, month, day;

  public Date(int y, int m, int d) {
    year = y;
    month = m;
    day = d;
  }

  public boolean isLeap() {
    return year % 100 != 0 && year % 4 == 0 || year % 400 == 0;
  }

  public int days() {
    int ans = 0;
    switch (month) {
      case 12:
        ans += 30;
      case 11:
        ans += 31;
      case 10:
        ans += 30;
      case 9:
        ans += 31;
      case 8:
        ans += 31;
      case 7:
        ans += 30;
      case 6:
        ans += 31;
      case 5:
        ans += 30;
      case 4:
        ans += 31;
      case 3:
        ans += isLeap() ? 29 : 28;
      case 2:
        ans += 31;
      case 1:
        ans += day;
    }
    return ans;
  }
}
