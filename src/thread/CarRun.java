package thread;

import static java.lang.Thread.sleep;

public class CarRun implements Runnable{
    private long sleepTime;
    private int carNum;

    public CarRun(int carNum, long sleepTime){
        this.sleepTime = sleepTime;
        this.carNum = carNum;
    }

    @Override
    public void run() {
        try {
            sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            this.move();
        }
    }
    public void move(){
        System.out.println("Машина из класса CarRun номер " + carNum + " едет");
    }
}
