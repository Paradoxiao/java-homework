import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    TreeSet<Integer> badminton = (TreeSet<Integer>) getBadmintonList(scanner.nextInt()),
        basketball = (TreeSet<Integer>) getBasketballList(scanner.nextInt());
    System.out.println(badminton.size() + " " + badminton);
    System.out.println(basketball.size() + " " + basketball);
    TreeSet<Integer> any = (TreeSet<Integer>) badminton.clone(), both = (TreeSet<Integer>) badminton.clone(),
        all = new TreeSet<>();
    for (int i = 1; i <= 1000; i++)
      all.add(i);
    any.addAll(basketball);
    both.retainAll(basketball);
    all.removeAll(badminton);
    all.removeAll(basketball);
    System.out.println(any.size() + " " + any);
    System.out.println(both.size() + " " + both);
    System.out.println(all.size() + " " + all);
    scanner.close();
  }

  public static Set<Integer> getBadmintonList(int seed) {
    // 创建包含1-1000的列表
    List<Integer> numbers = new ArrayList<>(1000);
    for (int i = 1; i <= 1000; i++) {
      numbers.add(i);
    }

    // 使用指定种子打乱顺序
    Collections.shuffle(numbers, new Random(seed));

    // 取前300个元素
    return new TreeSet<>(numbers.subList(0, 300));
  }

  public static Set<Integer> getBasketballList(int seed) {
    // 创建包含1-1000的列表
    List<Integer> numbers = new ArrayList<>(1000);
    for (int i = 1; i <= 1000; i++) {
      numbers.add(i);
    }

    // 使用指定种子打乱顺序
    Collections.shuffle(numbers, new Random(seed));

    // 取前400个元素并返回有序集合
    return new TreeSet<>(numbers.subList(0, 400));
  }
}
