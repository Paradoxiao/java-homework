import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
  // 以空格(单个或多个)为分隔符，将line中的元素抽取出来，放入一个List
  /* covnertStringToList函数代码 */
  public static List<String> convertStringToList(String line) {
    if (line == null || line.isBlank())
      return new ArrayList<>();
    ArrayList<String> list = new ArrayList<>();
    list.addAll(Arrays.asList(line.trim().split("\\s+")));
    return list;
  }

  // 在list中移除掉与str内容相同的元素
  /* remove函数代码 */
  public static void remove(List<String> list, String str) {
    if (list == null || str == null)
      return;
    while (list.indexOf(str) != -1)
      list.remove(str);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()) {
      List<String> list = convertStringToList(sc.nextLine());
      System.out.println(list);
      String word = sc.nextLine();
      remove(list, word);
      System.out.println(list);
    }
    sc.close();
  }

}
