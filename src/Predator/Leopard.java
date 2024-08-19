public class Leopard extends Predator {
    private String name;

    Leopard(String habitat, int maxSpeed, String color, String name){
        super(habitat, maxSpeed, color);
        this.name = name;
    }

    String huntMethod(){
        return "Догнать жертву";
    }

    public String toString(){
        return "Леопард. Имя: " + name + ", метод охоты:" + huntMethod()
                + ", шум при движении:" + makeNoise()
                + ", способ передвижения:" + moveType();
    }

    String makeNoise(){
        return "жертва услышит только собственный крик";
    }

    String moveType() {
        return "Мчится как молния";
    }

}
