import java.util.LinkedList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    ArrayListIntegerStack stack = new ArrayListIntegerStack();
    for (int i = 0; i < m; i++)
      System.out.println(stack.push(scanner.nextInt()));
    System.out.println(stack.peek() + "," + stack.empty() + "," + stack.size());
    System.out.println(stack);
    int x = scanner.nextInt();
    for (int i = 0; i < x; i++)
      System.out.println(stack.pop());
    System.out.println(stack.peek() + "," + stack.empty() + "," + stack.size());
    System.out.print(stack);
    scanner.close();
  }
}

interface IntegerStack {
  public Integer push(Integer item); // 如item为null，则不入栈直接返回null。否则直接入栈，然后返回item。

  public Integer pop(); // 出栈，如栈为空，则返回null。

  public Integer peek(); // 获得栈顶元素，如栈顶为空，则返回null。注意：不要出栈

  public boolean empty(); // 如果栈为空返回true

  public int size(); // 返回栈中元素数量
}

class ArrayListIntegerStack implements IntegerStack {
  private LinkedList<Integer> data;

  public ArrayListIntegerStack() {
    data = new LinkedList<>();
  }

  public String toString() {
    return data.toString();
  }

  public Integer push(Integer item) {
    if (item != null)
      data.addLast(item);
    return item;
  }

  public Integer pop() {
    return empty() ? null : data.removeLast();
  }

  public Integer peek() {
    return empty() ? null : data.getLast();
  }

  public boolean empty() {
    return data.isEmpty();
  }

  public int size() {
    return data.size();
  }
}
