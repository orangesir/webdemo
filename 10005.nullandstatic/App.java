
class Null {
  public static int value = 100;
}

class App {

  public static void main(String[] args) {
    System.out.println(((Null)null).value);
  }

}
