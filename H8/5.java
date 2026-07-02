import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
    scanner.tokens().forEach(s -> map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1));
    map.remove("end");
    map.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue())
        .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
    scanner.close();
  }
}
