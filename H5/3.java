import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    IAbility animal = null;
    int type = input.nextInt();
    String name = input.next();
    int age = input.nextInt();
    if (type == 1)
      animal = new Dog(name, age);
    else
      animal = new Cat(name, age);

    Simulator sim = new Simulator();
    sim.playSound(animal);
    input.close();
  }
}

/*** 请在这里填写你编写的Dog类、Cat类和Simulator类** */
abstract class Animal {
  private String name; // 名字
  private int age; // 年龄

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

interface IAbility {
  void showInfo(); // 输出动物信息

  void cry(); // 动物发出叫声
}

class Dog extends Animal implements IAbility {
  public Dog(String n, int a) {
    super(n, a);
  }

  public void showInfo() {
    System.out.println("我是一只狗,我的名字是" + getName() + ",今年" + getAge() + "岁");
  }

  public void cry() {
    System.out.println("旺旺");
  }
}

class Cat extends Animal implements IAbility {
  public Cat(String n, int a) {
    super(n, a);
  }

  public void showInfo() {
    System.out.println("我是一只猫,我的名字是" + getName() + ",今年" + getAge() + "岁");
  }

  public void cry() {
    System.out.println("喵喵");
  }
}

class Simulator {
  public void playSound(IAbility a) {
    a.showInfo();
    a.cry();
    Animal tmp = (Animal) a;
    System.out.println(tmp.getName());
    System.out.println(tmp.getAge());
  }
}
