public class RobotSapper implements RobotEngineer{
    private String model;
    private String mineCleaning;
    private double powerConsumption;
    private String material;
    private boolean isOn;

    RobotSapper(String model, String mineCleaning, double powerConsumption, String material){
        this.model = model;
        this.mineCleaning = mineCleaning;
        this.powerConsumption = powerConsumption;
        this.material = material;
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
    }
    public void turnOff() {
        isOn = false;
    }
    public void uniquePossibility(){
        System.out.println(model + " разминирует мины!");
    }
    public void replaceMainUnit(){
        System.out.println("меняем основной агрегат у робота-сапера!");
    }
    public void repairRobot(){
        System.out.println("починили робота-сапера!");
    }
    public void createRobot(){
        System.out.println("создаем робота-сапера!");
    }
    public void getStatus(){
        if (isOn) System.out.println("Робот-сапер включен");
        else System.out.println("Робот-сапер выключен");
    }
    public void showSpecialEngAbility(){
        System.out.println(model + " показывает свою специальную особенность инженеров!");
    }
    public String toString(){
        return model + " " + mineCleaning + " " + powerConsumption + " " + material;
    }
}