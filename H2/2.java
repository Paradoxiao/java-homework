import java.util.Scanner;

class Point {
  private double x;
  private double y;

  public String toString() {
    return "(" + this.x + "," + this.y + ")";
  }

  /** 你所提交的代码将被嵌在这里（替换此行） **/
  public Point() {
    x = 0;
    y = 0;
  }

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point(Point other) {
    x = other.x;
    y = other.y;
  }

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public Point add(Point other) {
    return new Point(x + other.x, y + other.y);
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }
}

public class Main {
  public static void main(String[] args) {
    Point a = new Point(); // default ctor, x and y are zeros
    Scanner sc = new Scanner(System.in);
    double x, y, z;
    x = sc.nextDouble();
    y = sc.nextDouble();
    z = sc.nextDouble();
    Point b = new Point(x, y); // ctor by x and y
    Point c = new Point(b); // ctor by another Point
    a.setY(z);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    c.setX(z);
    a = b.add(c);
    System.out.println(a);
    System.out.println("b.x=" + b.getX() + " b.y=" + b.getY());
    sc.close();
  }
}
