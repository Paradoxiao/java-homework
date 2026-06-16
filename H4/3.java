
/*你的代码被嵌在这里*/

import java.util.Scanner;

abstract class Employee {
  protected int pay;

  public abstract int getSalary();
}

class Manager extends Employee {
  public Manager(int p) {
    pay = p;
  }

  public int getSalary() {
    return pay;
  }
}

class Salesman extends Employee {
  private int sale;

  public Salesman(int p, int s) {
    pay = p;
    sale = s;
  }

  public int getSalary() {
    return pay + sale;
  }
}

class Worker extends Employee {
  private int days;

  public Worker(int p, int day) {
    pay = p;
    days = day;
  }

  public int getSalary() {
    return pay * days;
  }
}

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int managerSalary = scan.nextInt();
    int salemanSalary = scan.nextInt();
    int salemanRaise = scan.nextInt();
    int workerEveryday = scan.nextInt();
    int workerDays = scan.nextInt();

    Employee e1 = new Manager(managerSalary);
    Employee e2 = new Salesman(salemanSalary, salemanRaise);
    Employee e3 = new Worker(workerEveryday, workerDays);

    System.out.println(e1.getSalary());
    System.out.println(e2.getSalary());
    System.out.println(e3.getSalary());

    scan.close();

  }
}
