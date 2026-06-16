class Main {
  public static void main(String[] args) {
    // System.out.print("公鸡:0母鸡:25小鸡:75\n公鸡:4母鸡:18小鸡:78\n公鸡:8母鸡:11小鸡:81\n公鸡:12母鸡:4小鸡:84");
    for (int i = 0; i <= 20; i++)
      for (int j = 0; j <= 33; j++)
        for (int k = 0; k <= 300; k += 3)
          if (i + j + k == 100 && 5 * i + 3 * j + k / 3 == 100)
            System.out.printf("公鸡:%d母鸡:%d小鸡:%d\n", i, j, k);
  }
}
