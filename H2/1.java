import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name = scan.next();
    String sex = scan.next();
    int age = scan.nextInt();
    Person p = new Person();
    p.setName(name);
    p.setSex(sex);
    p.setAge(age);
    p.print();
    scan.close();
  }
}

/* 你的代码被嵌在这里 */
class Person {
  String name, sex;
  int age;

  public void setName(String name) {
    this.name = name;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void print() {
    System.out.print("name:" + name + "; sex:" + sex + "; age:" + age);
  }
}
