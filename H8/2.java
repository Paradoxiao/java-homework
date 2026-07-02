import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Person> personList = Utils.getPersonList();
    HashMap<String, ArrayList<Person>> map = new HashMap<>();
    for (Person i : personList) {
      String name = i.getName();
      if (!map.containsKey(name))
        map.put(name, new ArrayList<>());
      map.get(name).add(i);
    }
    int n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      String name = scanner.next(), phoneNumber = scanner.next();
      List<Person> list = map.get(name);
      if (list == null)
        System.out.println("Not found!");
      else {
        boolean found = false;
        for (Person j : list)
          if (j.getPhoneNumber().equals(phoneNumber)) {
            System.out.println(j);
            found = true;
          }
        if (!found)
          System.out.println("Not found!");
      }
    }
    System.out.println(map.size());
    scanner.close();
  }
}

class Utils {

  private static final Random rd = new Random(3);
  private static final int number = 200000;

  private static List<String> getPersonName() {
    StringBuilder sb = new StringBuilder();
    List<String> names = new ArrayList<String>();
    for (int i = 0; i < Utils.number; i++) {
      sb.delete(0, sb.length());
      for (int j = 0; j < 4; j++) {
        if (j == 0) {
          sb.append((char) ('A' + rd.nextInt(26)));
        } else {
          sb.append((char) ('a' + rd.nextInt(26)));
        }
      }
      names.add(sb.toString());
    }
    return names;

  }

  private static List<String> getPhoneNumber() {

    String[] telFirst = "134,135,136,137,138,139,150,151,152,157,158,159,130,131,132,155,156,133,153".split(",");
    StringBuilder sb = new StringBuilder();
    List<String> phoneNumbers = new ArrayList<String>();
    for (int i = 0; i < Utils.number; i++) {
      sb.delete(0, sb.length());
      for (int j = 0; j < 9; j++) {
        if (j == 0) {
          sb.append(telFirst[rd.nextInt(telFirst.length)]);
        } else {
          sb.append(rd.nextInt(10));
        }
      }
      phoneNumbers.add(sb.toString());
    }
    return phoneNumbers;
  }

  private static List<String> getPersonAddress() {
    List<String> addresses = new ArrayList<String>();
    String[] roads = { "HuanDao Road", "WenZeng Road", "ZhongShang Road", "KaiHe Road", "NanHua Road", "SongBai Road",
        "BinShui Road", "ShiGu Road", "JiYuan Road", "YinJiang Road" };
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < Utils.number; i++) {
      sb.delete(0, sb.length());
      for (int j = 0; j < 2; j++) {
        if (j == 1) {
          sb.append(roads[rd.nextInt(roads.length)]);
        } else {
          sb.append("Room " + rd.nextInt(100) + "-" + rd.nextInt(1000) + "-" + rd.nextInt(10000) + ", ");
        }
      }
      addresses.add(sb.toString());
    }
    return addresses;
  }

  public static List<Person> getPersonList() {
    List<String> names = Utils.getPersonName();
    List<String> phones = Utils.getPhoneNumber();
    List<String> addresses = Utils.getPersonAddress();
    List<Person> persons = new ArrayList<Person>();

    for (int i = 0; i < Utils.number; i++) {
      Person person = new Person();
      person.setId(i);
      person.setName(names.get(i));
      person.setPhoneNumber(phones.get(i));
      person.setAddress(addresses.get(i));
      persons.add(person);
    }
    return persons;
  }
}

class Person {
  private int id;
  private String name, phoneNumber, address;

  public Person(int id, String name, String phoneNumber, String address) {
    this.id = id;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.address = address;
  }

  public Person() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Person [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
  }

}
