package Animals;

class Bird extends Animals {
    private String family;
    private int maxFlightAltitude;

    Bird(String c, int maxLT, String food, String family, int maxFlightAltitude){
        super(c, maxLT,food);
        this.family = family;
        this.maxFlightAltitude = maxFlightAltitude;
    }

    void sing(){
        System.out.println(family + " поет");
    }
    void peck(){
        System.out.println(family + " пробует клюнуть!");
    }
    void hatch(){
        System.out.println(family + " высиживает яйца");
    }
    String getFamily(){
        return family;
    }
}
