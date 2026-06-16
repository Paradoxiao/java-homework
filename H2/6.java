
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Fraction a = new Fraction(in.nextInt(), in.nextInt());
    Fraction b = new Fraction(in.nextInt(), in.nextInt());
    a.print();
    b.print();
    a.plus(b).print();
    a.print();
    b.print();
    in.close();
  }
}

/* 请在这里填写答案 */
class Fraction {
  int a, b;

  public Fraction(int a, int b) {
    this.a = a;
    this.b = b;
    fmt();
  }

  int gcd(int a, int b) {
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }

  Fraction fmt() {
    int n = gcd(a, b);
    a /= n;
    b /= n;
    return this;
  }

  public Fraction plus(Fraction other) {
    return new Fraction(a * other.b + other.a * b, b * other.b).fmt();
  }

  public void print() {
    fmt();
    if (a == b)
      System.out.println(1);
    else
      System.out.println(a + "/" + b);
  }
}
