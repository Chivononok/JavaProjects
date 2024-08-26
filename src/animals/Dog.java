package animals;

class Dog extends Animals {
    private String name;
    private String breed;
    private double averageWeight;

    Dog(String c, int maxLT, String food, String name, String breed, double averageWeight){
        super(c, maxLT, food);
        this.name = name;
        this.breed = breed;
        this.averageWeight = averageWeight;
    }

    void bark(){
        System.out.println(name + " лает");
    }
    void bite(){
        System.out.println(name + " пробует укусить");
    }
    void run(){
        System.out.println(name + " бегает");
    }
    void play(){
        System.out.println(name + " играет");
    }
    void jump(){
        System.out.println(name + " прыгает");
    }
    String getName(){
        return name;
    }
}
