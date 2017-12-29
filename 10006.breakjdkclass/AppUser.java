
class AppUser {

  public static void main(String[] args) {
    BreakLoader breakLoader = new BreakLoader();
    try {
        Class clazz = breakLoader.loadClass("java.lang.Integer");
        // Object obj = clazz.newInstance();
        // Method loadTest = clazz.getDeclaredMethod("SayHello",null);
        // loadTest.invoke(obj);
    } catch (Exception e) {
        e.printStackTrace();
    }
  }

}
