package animals;

class Animals {
    private String color;
    private int maxLifeTime;
    private String foodType;

    Animals(String color, int maxLifeTime, String foodType){
        this.color = color;
        this.maxLifeTime = maxLifeTime;
        this.foodType = foodType;
    }

    void makeNoise(String name){
        System.out.println(name + " издает звук из суперкласса");
    }
    void play(String name){
        System.out.println(name + " играет из суперкласса");
    }
}
