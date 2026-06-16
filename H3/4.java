import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int no = scan.nextInt();
    String name = scan.next();
    String sex = scan.next();
    Student s = new Student(no, name, sex);
    s.print();

    no = scan.nextInt();
    name = scan.next();
    sex = scan.next();
    String major = scan.next();
    CollegeStudent c = new CollegeStudent(no, name, sex, major);
    c.print();

    no = scan.nextInt();
    name = scan.next();
    sex = scan.next();
    major = scan.next();
    String supervisor = scan.next();
    GraduateStudent g = new GraduateStudent(no, name, sex, major, supervisor);
    g.print();
    g.doResearch();
    scan.close();
  }
}

/* 你的代码被嵌在这里 */
class Student {
  int id;
  String name, sex;

  public Student(int i, String n, String s) {
    id = i;
    name = n;
    sex = s;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getSex() {
    return sex;
  }

  public void setId(int i) {
    id = i;
  }

  public void setName(String n) {
    name = n;
  }

  public void setSex(String s) {
    sex = s;
  }

  public void attendClass(String className) {
    return;
  }

  public void print() {
    System.out.println("no: " + id + "\nname: " + name + "\nsex: " + sex);
  }
}

class CollegeStudent extends Student {
  String major;

  public CollegeStudent(int id, String name, String sex, String m) {
    super(id, name, sex);
    major = m;
  }

  public void print() {
    System.out.println("no: " + id + "\nname: " + name + "\nsex: " + sex + "\nmajor: " + major);
  }
}

class GraduateStudent extends CollegeStudent {
  String supervisor;

  public GraduateStudent(int id, String name, String sex, String m, String s) {
    super(id, name, sex, m);
    supervisor = s;
  }

  public void print() {
    System.out.println(
        "no: " + id + "\nname: " + name + "\nsex: " + sex + "\nmajor: " + major + "\nsupervisor: " + supervisor);
  }

  public void doResearch() {
    System.out.println(name + " is doing research");
  }
}
