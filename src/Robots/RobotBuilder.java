public class RobotBuilder implements RobotEngineer {
    private String model;
    private String country;
    private double powerConsumption;
    private String buildUnit;
    private String material;
    private boolean isOn;

    RobotBuilder(String model, String country, double powerConsumption, String buildUnit, String material){
        this.model = model;
        this.country = country;
        this.powerConsumption = powerConsumption;
        this.buildUnit = buildUnit;
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
        System.out.println(model + " что-то строит!");
    }
    public void replaceMainUnit(){
        System.out.println("меняем основной агрегат у робота-строителя!");
    }
    public void repairRobot(){
        System.out.println("починили робота-строителя!");
    }
    public void createRobot(){
        System.out.println("создаем робота-строителя!");
    }
    public void getStatus(){
        if (isOn) System.out.println("Робот-строитель включен");
        else System.out.println("Робот-строитель выключен");
    }
    public void showSpecialEngAbility(){
        System.out.println(model + " показывает свою специальную особенность инженеров!");
    }
    public String toString(){
        return model + " " + country + " " + powerConsumption + " " + buildUnit + " " + material;
    }
}