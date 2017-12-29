class DataThread extends Thread {

  public static volatile int i=0;

  public void inrc() {
    // synchronized(DataThread.class) {
        i++;
    // }
  }

  public void run() {
      for (int j=0; j<1000; j++ ) {
          inrc();
      }
  }

}

class App {

  public static void main(String[] args) {
    DataThread[] pool = {new DataThread(),new DataThread(),new DataThread()};
    for(DataThread item : pool) {
      item.start();
    }
    boolean isDo = true;
    while(isDo) {
      isDo = false;
      for (DataThread item : pool ) {
        if(item.isAlive()) {
          isDo = true;
          break;
        }
      }
    }
    System.out.println("data must 3000, now:"+String.valueOf(DataThread.i));
  }

}
