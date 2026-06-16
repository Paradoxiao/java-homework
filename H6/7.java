import java.time.LocalDate;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] s1 = scanner.nextLine().split("-"),
        s2 = scanner.nextLine().split("-");
    LocalDate date1 = LocalDate.of(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]), Integer.parseInt(s1[2])),
        date2 = LocalDate.of(Integer.parseInt(s2[0]), Integer.parseInt(s2[1]), Integer.parseInt(s2[2]));
    boolean date1_earlier_date2 = date1.isBefore(date2);
    long x = date1.toEpochDay() - date2.toEpochDay();
    x = date1_earlier_date2 ? -x : x;
    System.out.printf("第一个日期比第二个日期更%s\n", date1_earlier_date2 ? "早" : "晚");
    System.out.printf("两个日期间隔%d天\n", x);
    System.out.printf("两个日期间隔%d周", x / 7);
    scanner.close();
  }
}
