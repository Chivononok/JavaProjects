public class Wolf extends Predator{
    private String name;

    Wolf(String habitat, int maxSpeed, String color, String name){
        super(habitat, maxSpeed, color);
        this.name = name;
    }
    String huntMethod(){
        return "Окружает жертву";
    }

    public String toString(){
        return "Волк. Имя: " + name + ", метод охоты:" + huntMethod()
                + ", шум при движении:" + makeNoise()
                + ", способ передвижения:" + moveType();
    }

    String makeNoise(){
        return "продолжительный и пронзающий до самых костей вой";
    }

    String moveType() {
        return "неспеша сокращает дистанцию";
    }
}
