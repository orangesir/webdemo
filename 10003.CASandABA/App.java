import java.util.concurrent.atomic.AtomicInteger;

class TestThread extends Thread {

  public static AtomicInteger i = new AtomicInteger(0);

  public void inrc() {
    // 这里面使用了传说中的CAS 实际上是 sun.misc.Unsafe 类的compareAndSwap 操作
    i.getAndIncrement();

    // 用户不能自己调用
    // @CallerSensitive
    // public static Unsafe getUnsafe() {
    //     Class var0 = Reflection.getCallerClass();
    //     if(!VM.isSystemDomainLoader(var0.getClassLoader())) {
    //         throw new SecurityException("Unsafe");
    //     } else {
    //         return theUnsafe;
    //     }
    // }
  }

  public void run() {
    for (int a=0;a<1000;a++) {
      inrc();
    }
  }

}


class App {

  public static void main(String[] args) {
    TestThread[] pool = {new TestThread(), new TestThread(), new TestThread()};
    for (TestThread item : pool ) {
      item.start();
    }
    boolean isDo = true;
    while(isDo) {
      isDo = false;
      for (TestThread item : pool ) {
        if(item.isAlive()) {
          isDo = true;
          break;
        }
      }
    }
    System.out.println("The correct value is 3000; now:"+TestThread.i.toString());
  }

}
