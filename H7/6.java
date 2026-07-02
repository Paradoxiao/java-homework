import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    String[] s = scanner.next().split(",");
    myList list = new myList();
    for (String i : s)
      list.add(i);
    boolean is_first = true;
    while (!list.isEmpty()) {
      for (int i = 1; i < m; i++)
        list.next();
      System.out.print((is_first ? "" : ",") + list.remove());
      is_first = false;
    }
    scanner.close();
  }
}

class myNode {
  String data;
  myNode next;

  public myNode(String s) {
    data = s;
    next = null;
  }
}

class myList {
  myNode now;

  public void add(String s) {
    if (now == null) {
      now = new myNode(s);
      now.next = now;
      return;
    }
    myNode tmp = now.next;
    now.next = new myNode(s);
    now.next.next = tmp;
    now = now.next;
  }

  public void next() {
    now = now.next;
  }

  public String remove() {
    String s = now.next.data;
    if (now == now.next)
      now = null;
    else
      now.next = now.next.next;
    return s;
  }

  public boolean isEmpty() {
    return now == null;
  }
}
