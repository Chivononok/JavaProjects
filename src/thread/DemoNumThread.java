package thread;


public class DemoNumThread {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            NumThread nt1 = new NumThread();
            nt1.start();
        }
    }
}
