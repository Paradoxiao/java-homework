import java.time.LocalDate;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    TreeMap<String, Student> map = new TreeMap<>();
    for (int i = 0; i < n; i++) {
      String id = scanner.next(), name = scanner.next(), ymd = scanner.next();
      double score = scanner.nextDouble();
      LocalDate date = LocalDate.parse(ymd);
      map.put(id, new Student(id, name, date, score));
    }
    map.forEach((k, v) -> System.out.println(v));
    scanner.close();
  }
}

class Student implements Comparable {
  private String id, name;
  private LocalDate birthday;
  double score;

  public Student(String id, String name, LocalDate birthday, double score) {
    this.id = id;
    this.name = name;
    this.birthday = birthday;
    this.score = score;
  }

  @Override
  public String toString() {
    return "Student [id=" + id + ", name=" + name + ", birthday="
        + String.format("%d年%02d月%d日", birthday.getYear(), birthday.getMonth().getValue(), birthday.getDayOfMonth())
        + ", score="
        + score + "]";
  }

  @Override
  public int compareTo(Object o) {
    return id.compareTo(((Student) o).id);
  }
}
