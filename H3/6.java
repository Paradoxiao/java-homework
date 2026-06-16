class Main {
  public static void main(String[] args) {

  }
}

class Person {
  String name;

  public String toString() {
    return name;
  }
}

class Company {
  String name;

  public String toString() {
    return name;
  }
}

class Employee extends Person {
  Company company;
  double salary;

  public String toString() {
    return super.toString() + "-" + company.toString() + "-" + salary;
  }
}
