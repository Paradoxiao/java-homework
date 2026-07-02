import java.util.ArrayList;

public class Main {
  private ArrayList<Student> slist = new ArrayList<Student>();

  public void addStudent(Student s) {
    this.slist.add(s);
  }

  public void showStudent() {
    for (Student s : slist) {
      System.out.println(s);
    }
  }

  public static void main(String[] args) {
    Main t = new Main();
    t.addStudent(new Student("2016001", "rose", 18));
    t.addStudent(new Student("2016002", "hunifu", 19));
    t.addStudent(new Student("2016003", "britsh", 20));
    t.addStudent(new Student("2016004", "sunni", 17));
    t.showStudent();
  }
}

/* 请在这里填写答案 */
class Student {
  private String id, something;
  private int age;

  public Student(String id, String something, int age) {
    this.id = id;
    this.something = something;
    this.age = age;
  }

  public String toString() {
    return id + " " + something + " " + age;
  }
}
