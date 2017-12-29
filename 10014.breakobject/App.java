class UseThead extends Thread{

    private BreakClass breakClass;

    public BreakClass getBreakClass() {
        return breakClass;
    }

    public void setBreakClass(BreakClass breakClass) {
        this.breakClass = breakClass;
    }

    public void run() {
        breakClass.printHello();
    }

}


class BreakClass {

    private String hello = "Hello World!";

    public BreakClass() {
        UseThead useThead = new UseThead();
        useThead.setBreakClass(this);
        useThead.start();
       try {
           Thread.sleep(0, 1);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        hello = "New Hello World!";
    }

    public void printHello() {
        System.out.println(hello);
    }
}

public class App {

    public static void main(String[] args) {
        new BreakClass();
    }

}
