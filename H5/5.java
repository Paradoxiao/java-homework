import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    ArrayIntegerStack stack = new ArrayIntegerStack(n);
    int m = scanner.nextInt();
    for (int i = 0; i < m; i++) {
      int x = scanner.nextInt();
      System.out.println(stack.push(x));
    }
    System.out.println(stack.peek() + "," + stack.empty() + "," + stack.size());
    System.out.println(stack);
    int x = scanner.nextInt();
    for (int i = 0; i < x; i++)
      System.out.println(stack.pop());
    System.out.println(stack.peek() + "," + stack.empty() + "," + stack.size());
    System.out.println(stack);
    scanner.close();
  }
}

interface IntegerStack {
  public Integer push(Integer item);
  // 如果item为null，则不入栈直接返回null。如果栈满，也返回null。如果插入成功，返回item。

  public Integer pop();
  // 出栈，如果为空，则返回null。出栈时只移动栈顶指针，相应位置不置为null

  public Integer peek();
  // 获得栈顶元素，如果为空，则返回null.

  public boolean empty();
  // 如果为空返回true

  public int size();
  // 返回栈中元素个数
}

class ArrayIntegerStack implements IntegerStack {
  private Integer[] data;

  private int len, top;

  public ArrayIntegerStack(int n) {
    data = new Integer[n];
    len = n - 1;
    top = -1;
  }

  public ArrayIntegerStack() {
    data = null;
  }

  public Integer push(Integer item) {
    if (item == null)
      return null;
    if (top == len)
      return null;
    data[++top] = item;
    return item;
  }

  public Integer pop() {
    if (empty())
      return null;
    return data[top--];
  }

  public Integer peek() {
    if (empty())
      return null;
    return data[top];
  }

  public boolean empty() {
    return top == -1;
  }

  public int size() {
    return top + 1;
  }

  @Override
  public String toString() {
    return Arrays.toString(data);
  }
}
