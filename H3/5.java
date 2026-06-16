import java.util.Scanner;

class Point {
  private int xPos, yPos;

  public Point(int x, int y) {
    xPos = x;
    yPos = y;
  }

  @Override
  /* 请在这里填写答案 */
  public boolean equals(Object o) {
    return xPos == ((Point) o).xPos && yPos == ((Point) o).yPos;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Object p1 = new Point(sc.nextInt(), sc.nextInt());
    Object p2 = new Point(sc.nextInt(), sc.nextInt());
    System.out.println(p1.equals(p2));
    sc.close();
  }
}
