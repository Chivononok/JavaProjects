package thread;

public class Car extends Thread {
    private long sleepTime;
    private int carNum;
    private Thread car;

    public Car(int carNum, long sleepTime){
        this.sleepTime = sleepTime;
        this.carNum = carNum;
    }

    public void run(){
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(200l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.move();
        }
    }

    public void move(){
        System.out.println("Машина " + carNum + " едет");
    }
}
