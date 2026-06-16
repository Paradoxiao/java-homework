public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 输入外币名称、现汇买入价、现汇卖出价
    CurrencyExchange.setPrice(sc.next(), sc.nextDouble(), sc.nextDouble());
    // 输入人民币金额
    double money = sc.nextDouble();
    // 输出上述金额人民币可兑换外币金额
    System.out.printf("%.2f人民币兑换%.2f%s\n", money, CurrencyExchange.saleForeignMoney(money),
        CurrencyExchange.getCurrencyName());
    // 输入外币金额
    money = sc.nextDouble();
    // 输出上述金额外币可兑换人民币金额
    System.out.printf("%.2f%s兑换%.2f人民币", money, CurrencyExchange.getCurrencyName(),
        CurrencyExchange.purchaseForeignMoney(money));
    sc.close();
  }
}

/* 请在这里填写答案 */
class CurrencyExchange {
  private static String currencyName;
  private static double pricePurchase, priceSale;

  public static void setPrice(String c, double p, double s) {
    currencyName = c;
    pricePurchase = p;
    priceSale = s;
  }

  public static String getCurrencyName() {
    return currencyName;
  }

  public static double purchaseForeignMoney(double fmoney) {
    return fmoney * pricePurchase / 100;
  }

  public static double saleForeignMoney(double rmb) {
    return rmb * 100 / priceSale;
  }
}
