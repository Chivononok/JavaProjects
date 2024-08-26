package predator;

public class PredatorDemo {
    public static void main(String args[]){
        Predator crocodile = new Crocodile("болото", 9, "зеленый", "аллигатор");
        Predator leopard = new Leopard("джунгли", 76, "в крапинку", "Мурка");
        Predator wolf = new Wolf("лес", 34, "серый", "Ателло");

        System.out.println(crocodile.toString());
        System.out.println(leopard.toString());
        System.out.println(wolf.toString());

    }
}
