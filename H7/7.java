import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt();
    ArrayList<String> s = new ArrayList<>(Arrays.asList(scanner.next().split(","))), ans = new ArrayList<>();
    int index = 0;
    while (!s.isEmpty())
      ans.add(s.remove(index = (index + m - 1) % s.size()));
    System.out.print(ans.get(0));
    for (int i = 1; i < ans.size(); i++)
      System.out.print("," + ans.get(i));
    scanner.close();
  }
}
