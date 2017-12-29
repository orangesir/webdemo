
public class VolatileTest extends  Thread {

    /**
     * 使用了volatile，则1秒后，子线程会退出循环，因为在主线程将isRunning置位为false
     */
    // private volatile boolean isRunning = true;

    /**
     * 不使用volatile，1秒后，主线程置位isRunning为false，但主线程对isRunning的修改对子线程不可见，子线程看见的还是true，循环继续
     *
     * 将setRunning方法设置为synchronized也可以达到volatile的效果，意思就是同步代码块保护的变量修改时也会直接刷新到主存
     *
     */
    private boolean isRunning = true;

    public boolean isRunning(){
        return isRunning;
    }

    public void setRunning(boolean isRunning){
        this.isRunning= isRunning;
    }

    public void run(){
        int a = 5;
        System.out.println("进入了run...............");
        while (isRunning){
          a++;
          if(a>1000) {
            a=1;
          }
          // if(a>1000) {
          //   a=1;
          // }
        }
        System.out.println("isUpdated的值被修改为为false,线程将被停止了");
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileTest volatileThread = new VolatileTest();
        volatileThread.start();
        Thread.sleep(1000);
        volatileThread.setRunning(false);   //停止线程
        Thread.sleep(2000);
    }
}
