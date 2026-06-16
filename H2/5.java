
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    int n, x, y;
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      n = sc.nextInt(); // 待考察的点数
      int count = 0; // 计数器
      Rect rect = new Rect(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()); // 构建矩形对象
      for (int i = 0; i < n; i++) // 判断n个点是否在矩形对象rect中
      {
        x = sc.nextInt(); // 读入待考察点的x坐标
        y = sc.nextInt(); // 读入待考察点的y坐标
        boolean inRect = rect.isInRect(x, y); // 判断点(x,y)是否在矩形中
        if (inRect) // 是，计数器加1
        {
          count++;
        }
      }
      System.out.println(count); // 打印N个点在矩形对象中的点的个数
    }
  }
}

/* 请在这里填写答案 */

class Rect {
  int x1, y1, x2, y2; // 4个属性,分别表示左下角和右上角的x、y坐标

  // 构造方法
  public Rect(int x1, int y1, int x2, int y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;
  }

  // 判断点（x,y)是否在本矩形对象内部，在窗边的不计
  public boolean isInRect(int x, int y) {
    return x > x1 && x < x2 && y > y1 && y < y2;
  }
}
