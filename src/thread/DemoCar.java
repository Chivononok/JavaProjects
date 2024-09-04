package thread;

public class DemoCar {
    public static void main(String args[]) throws InterruptedException {
        Car car1 = new Car(1, 100l);
        Car car2 = new Car(2, 100L);
        Car car5 = new Car(5, 100L);

        car1.start();
        try{
            car1.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        car2.start();
        car5.start();

        CarRun car3 = new CarRun(3, 104L);
        Thread th1 = new Thread(car3);
        th1.start();
        CarRun car4 = new CarRun(4, 106L);
        Thread th2 = new Thread(car4);
        th2.start();
    }
}
