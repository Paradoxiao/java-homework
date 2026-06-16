
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    // 声明Pillar类对象pil
    Pillar pil;
    // 声明Shape类对象shp;
    Shape shp;
    // 键盘输入半径r，创建半径为r的Circle类对象，赋值给对象shp
    double r = in.nextDouble();
    shp = new Circle(r);
    // 键盘输入柱形高h，用底面shp和高h创建Pillar类对象，赋值给对象pil
    double h = in.nextDouble();
    pil = new Pillar(shp, h);
    // 显示柱形体积
    System.out.printf("圆形底的柱体体积%.2f\n", pil.getVolume());
    // 键盘输入矩形长a和宽b，创建Rectangle类对象，赋值给对象shp
    double a = in.nextDouble();
    double b = in.nextDouble();
    shp = new Rectangle(a, b);
    // 键盘输入柱形高h，用底面shp和高h创建Pillar类对象，赋值给对象pil
    h = in.nextDouble();
    pil = new Pillar(shp, h);
    // 显示柱形体积
    System.out.printf("矩形底的柱体体积%.2f\n", pil.getVolume());
    in.close();
  }
}

/* 请在这里填写答案 */
abstract class Shape {
  public abstract double getArea();
}

class Circle extends Shape {
  private double r;

  public Circle(double r) {
    this.r = r;
  }

  public double getArea() {
    return Math.PI * r * r;
  }
}

class Rectangle extends Shape {
  private double a, b;

  public Rectangle(double l, double w) {
    a = l;
    b = w;
  }

  public double getArea() {
    return a * b;
  }
}

class Pillar {
  private Shape bottom;
  private double height;

  public Pillar(Shape bot, double hei) {
    bottom = bot;
    height = hei;
  }

  public double getVolume() {
    return bottom.getArea() * height;
  }
}
