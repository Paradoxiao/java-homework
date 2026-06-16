/* 请在这里填写答案 */
class Admin {
  public String name;
  String passwd = "123456";

  public void login(String pw) {
    if (passwd.equals(pw))
      System.out.println("密码正确，欢迎" + name + "登录系统");
    else
      System.out.println("密码错误，" + name + "您无权登录系统");
  }
}

// 在这里给出函数被调用进行测试的例子。例如：
public class TestAdmin {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    Admin ad1 = new Admin();
    ad1.name = name;
    String pw = sc.next();
    ad1.login(pw);
  }
}
