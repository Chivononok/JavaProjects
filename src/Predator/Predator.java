abstract class Predator {
    private String habitat;
    private int maxSpeed;
    private String color;

    Predator(String habitat, int maxSpeed, String color){
        this.habitat = habitat;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    abstract String huntMethod();
    abstract public String toString();
    abstract String makeNoise();
    abstract String moveType();
}
