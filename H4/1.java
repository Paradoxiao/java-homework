
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    HiINC[] hi = new HiINC[n];
    for (int i = 0; i < n; i++) {
      String type = sc.next();
      if (type.equals("bicycle")) {
        hi[i] = new Bicycle(sc.next());
      } else {
        hi[i] = new Car(sc.next(), sc.nextDouble());
      }
    }
    double rent = HiINC.calculateRent(hi, sc.nextInt());
    System.out.printf("%.2f", rent);
  }
}

/* 请在这里填写答案 */
abstract class HiINC {
  public abstract double getRent();

  static double calculateRent(HiINC[] hi, int days) {
    double total = 0;
    for (int i = 0; i < hi.length; i++)
      total += hi[i].getRent();
    total *= days;
    return total;
  }
}

class Bicycle extends HiINC {
  String id;

  public Bicycle(String i) {
    id = i;
  }

  public double getRent() {
    return 12;
  }
}

class Car extends HiINC {
  String id;
  double cost;

  public Car(String i, double c) {
    id = i;
    cost = c;
  }

  public double getRent() {
    return 0.001 * cost;
  }
}
