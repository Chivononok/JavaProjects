package streams;

import java.util.stream.Stream;

public class City{
    private int id;
    private String name;
    private int population;
    private Continents continent;

    public City(int id, String name, int population, Continents continent){
        this.id = id;
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public int getPopulation(){
        return population;
    }
    public String getName(){
        return name;
    }
    public static City max(City x, City y){
        return (x.getPopulation()>y.getPopulation()) ? x : y;
    }
    public String toString(){
        return "Id: " + id + " имя: " + name + " население: " + population + " континент: " + continent;
    }
    public Continents getContinent() {
        return continent;
    }
}
