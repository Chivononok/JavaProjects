package robots;

public class RobotChef implements Robots{
    private String model;
    private String country;
    private double powerConsumption;
    private String cookUnit;
    private boolean isOn;

    RobotChef(String model, String country, double powerConsumption, String cookUnit){
        this.model = model;
        this.country = country;
        this.powerConsumption = powerConsumption;
        this.cookUnit = cookUnit;
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }
    public void turnOff() {
        isOn = false;
    }
    public void uniquePossibility(){
        System.out.println(model + " готовит еду!");
    }
    public void replaceMainUnit(){
        System.out.println("меняем основной агрегат у робота-повора!");
    }
    public void repairRobot(){
        System.out.println("починили робота-повора!");
    }
    public void createRobot(){
        System.out.println("создаем робота-повара!");
    }
    public void getStatus(){
        if (isOn) System.out.println("Робот-повар включен");
        else System.out.println("Робот-повар выключен");
    }
    public String toString(){
        return model + " " + country + " " + powerConsumption + " " + cookUnit;
    }
}