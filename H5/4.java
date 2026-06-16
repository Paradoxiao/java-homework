import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int m = scanner.nextInt(), n = scanner.nextInt(), value;
    Matrix mt = new Matrix(m, n);
    System.out.printf("row:%d column:%d\n", m, n);
    mt.read(scanner);
    m = scanner.nextInt();
    n = scanner.nextInt();
    value = scanner.nextInt();
    mt.set(m, n, value);
    System.out.print("after set value:\n" + mt);
    m = scanner.nextInt();
    n = scanner.nextInt();
    System.out.printf("value on (%d,%d):%d\n", m, n, mt.get(m, n));
    m = scanner.nextInt();
    n = scanner.nextInt();
    Matrix to_add = new Matrix(m, n);
    to_add.read(scanner);
    System.out.print("after add:\n" + mt.Matrix_add(to_add));
    m = scanner.nextInt();
    n = scanner.nextInt();
    Matrix to_multiply = new Matrix(m, n);
    to_multiply.read(scanner);
    System.out.print("after multiply:\n" + mt.Matrix_multipy(to_multiply));
    System.out.print("after transpose:\n" + mt.transpose());
    scanner.close();
  }
}

class Matrix {
  private int[][] data;
  private int m, n;

  public Matrix(int m, int n) {
    this.m = m;
    this.n = n;
    data = new int[m + 1][n + 1];
  }

  public void read(Scanner scanner) {
    for (int i = 1; i <= m; i++)
      for (int j = 1; j <= n; j++)
        data[i][j] = scanner.nextInt();
  }

  public void set(int row, int col, int value) {
    data[row][col] = value;
  }

  public int get(int row, int col) {
    return data[row][col];
  }

  public int width() {
    return n;
  }

  public int height() {
    return m;
  }

  public Matrix Matrix_add(Matrix b) {
    Matrix tmp = new Matrix(m, n);
    for (int i = 1; i <= m; i++)
      for (int j = 1; j <= n; j++)
        tmp.data[i][j] = data[i][j] + b.data[i][j];
    return tmp;
  }

  public Matrix Matrix_multipy(Matrix b) {
    Matrix tmp = new Matrix(m, b.n);
    for (int i = 1; i <= m; i++)
      for (int j = 1; j <= b.n; j++)
        for (int k = 1; k <= n; k++)
          tmp.data[i][j] += data[i][k] * b.data[k][j];
    return tmp;
  }

  public Matrix transpose() {
    Matrix tmp = new Matrix(n, m);
    for (int i = 1; i <= m; i++)
      for (int j = 1; j <= n; j++)
        tmp.data[i][j] = data[j][i];
    return tmp;
  }

  @Override
  public String toString() {
    String tmp = new String();
    for (int i = 1; i <= m; i++) {
      tmp += data[i][1];
      for (int j = 2; j <= n; j++)
        tmp += " " + data[i][j];
      tmp += "\n";
    }
    return tmp;
  }
}
