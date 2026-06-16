import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 通过键盘输入确定Student数组的长度
    Student[] stu = new Student[Integer.parseInt(sc.nextLine())];
    for (int i = 0; i < stu.length; i++) {
      // 截取输入的字符
      String[] str = sc.nextLine().split("\\s+");
      // 三个字符串表示为Graduate，否则为Undergraduate
      if (str.length > 2) {
        stu[i] = new Graduate(str[0], Double.parseDouble(str[1]),
            Boolean.parseBoolean(str[2]));
      } else {
        stu[i] = new Undergraduate(str[0], Double.parseDouble(str[1]));
      }
    }

    // 循环输出结果
    for (int i = 0; i < stu.length; i++) {
      if (stu[i].isReq())
        System.out.println(stu[i].getId() + " pass");
      else
        System.out.println(stu[i].getId() + " fail");
    }

    sc.close();
  }
}

class Student {
  private String id;
  private double ca;

  public Student(String id, double ca) {
    this.id = id;
    this.ca = ca;
  }

  public boolean isReq() {
    return false;
  }

  public String getId() {
    return id;
  }

  public double getCA() {
    return ca;
  }
}

/* 请在这里填写答案 */
class Undergraduate extends Student {
  public Undergraduate(String id, double ca) {
    super(id, ca);
  }

  public boolean isReq() {
    return this.getCA() >= 80;
  }
}

class Graduate extends Student {
  boolean supervisor;

  public Graduate(String id, double ca, boolean su) {
    super(id, ca);
    supervisor = su;
  }

  public boolean isReq() {
    return this.getCA() >= 85 && supervisor;
  }
}
