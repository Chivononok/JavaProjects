package predator;

public class Crocodile extends Predator{
    private String type;

    public Crocodile(String habitat, int maxSpeed, String color, String type){
        super(habitat, maxSpeed, color);
        this.type = type;
    }

    String huntMethod(){
        return "Прыгнуть на жертву";
    }

    public String toString(){
        return "Крокодил. Тип: " + type + ", метод охоты:" + huntMethod()
                + ", шум при движении:" + makeNoise()
                + ", способ передвижения:" + moveType();
    }

    String makeNoise(){
        return "слышен смех от того, что трава щекочет ему животик";
    }

    String moveType() {
        return "Ползает на животе";
    }

    public String sleep() {
        return "Крокодил уснул";
    }
}
