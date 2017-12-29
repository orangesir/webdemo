
class Data {
  public int a;
  public short b;
  public long c;
  public boolean d;

  public float e;
  public double f;

  public char g;
  public byte h;
}

class AppDefault {

  public static void main(String[] args) {
    Data data = new Data();
    System.out.println("int:"+String.valueOf(data.a));
    System.out.println("short:"+String.valueOf(data.b));
    System.out.println("long:"+String.valueOf(data.c));
    System.out.println("boolean:"+String.valueOf(data.d));
    System.out.println("float:"+String.valueOf(data.e));
    System.out.println("double:"+String.valueOf(data.f));
    System.out.println("char:"+String.valueOf(data.g));
    System.out.println("byte:"+String.valueOf(data.h));
    System.out.println("char:"+Integer.valueOf(data.g));
  }

}
