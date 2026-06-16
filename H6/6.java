import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Vehicle v1 = new Vehicle(scanner.next(), scanner.nextInt(), scanner.next()),
        v2 = new Vehicle(scanner.next(), scanner.nextInt(), scanner.next());
    System.out.printf("第一辆是%s，时速为%.1fkm/h，颜色为%s\n第二辆是%s，时速为%.1fkm/h，颜色为%s", v1.getKind(), v1.getSpeed(), v1.getColor(),
        v2.getKind(), v2.getSpeed(), v2.getColor());
    scanner.close();
  }
}

class Vehicle {
  private String kind, color;
  private int speed;

  public Vehicle(String k, int s, String c) {
    kind = k;
    speed = s;
    color = c;
  }

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public double getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
}
