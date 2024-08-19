package Animals;

public class DemoAnimals {
    public static void main(String args[]){
        Dog dog1 = new Dog("красный", 27, "мясо", "Шарик", "дворняга", 16.3);
        Bird bird1 = new Bird("коричневый", 8, "насекомые", "снигирь", 327);

        dog1.bark();
        dog1.bite();
        dog1.jump();
        dog1.play();
        dog1.run();
        dog1.makeNoise(dog1.getName());
        dog1.play(dog1.getName());

        bird1.hatch();
        bird1.hatch();
        bird1.peck();
        bird1.sing();
        bird1.makeNoise(bird1.getFamily());
        bird1.play(bird1.getFamily());
    }
}
