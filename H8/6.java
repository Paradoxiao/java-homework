import java.util.*;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
    scanner.tokens().forEach(name -> map.put(name, map.containsKey(name) ? map.get(name) + 1 : 1));
    System.out.print(
        map.entrySet().stream().filter(
            x -> x.getValue() == map.entrySet().stream().max((a, b) -> a.getValue() - b.getValue()).get().getValue())
            .map(x -> x.getKey()).collect(Collectors.joining(" ")));
    scanner.close();
  }
}
