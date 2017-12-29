
class SupperClass {
  static {
    System.out.println("SupperClass init!");
  }

  public static int value=123;
}

class SubClass extends SupperClass{
  static {
    System.out.println("SubClass init!");
  }
}

class App {
  public static void main(String[] args) {
    int a = SubClass.value;
  }
}
