import java.util.*;

public class Main {
  public static void main(String[] args) {
    String[] strs = { "12345", "67891", "12347809931", "98765432102", "67891", "12347809933" };
    StringList sl = new StringList();
    LinkedList<String> qqList = sl.constructList(strs);
    System.out.println(sl.search(qqList));
  }
}

/* 请在这里填写答案：StringList类 */
class StringList {
  public LinkedList<String> constructList(String[] strs) {
    if (strs == null)
      return new LinkedList<>();
    LinkedList<String> ll = new LinkedList<>();
    ll.addAll(Arrays.asList(strs));
    return ll;
  }

  public String search(LinkedList<String> list) {
    Scanner scanner = new Scanner(System.in);
    int l = scanner.nextInt();
    scanner.close();
    if (list == null)
      return "not exist";
    return list.stream().filter(s -> s != null && s.length() == l).findFirst().orElse("not exist");
  }
}
