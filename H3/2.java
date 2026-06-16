import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    CellPhone c1 = new CellPhone(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
    CellPhone c2 = new CellPhone(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());

    System.out.println(c1.equals(c2));
    System.out.println(c1);
    System.out.println(c2);
  }
}

/* 你的代码将被嵌在这里 */
class CellPhone {
  String type;
  int rom, ssd, value;

  public CellPhone(String t, int r, int s, int v) {
    type = t;
    rom = r;
    ssd = s;
    value = v;
  }

  public boolean equals(CellPhone o) {
    return type.equals(o.type) && rom == o.rom && ssd == o.ssd;
  }

  public String toString() {
    return String.format("CellPhone [model:%s, memory:%d, storage:%d, price:%d]", type, rom, ssd, value);
  }
}
