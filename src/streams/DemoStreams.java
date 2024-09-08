package streams;

import java.util.*;
import java.util.stream.Collectors;

public class DemoStreams {
    public static void main(String args[]) throws NotFoundCity {

        List<City> list = Arrays.asList(
                new City(1, "Минск", 2147624,Continents.EUROPE),
                new City(2, "Лондон", 47470041,Continents.EUROPE),
                new City(3, "Мехико", 127470041,Continents.EUROPE),
                new City(4, "Бангкок", 947811751,Continents.ASIA),
                new City(5, "Брест", 945557,Continents.EUROPE));
        //поиск города с макс населением на всех континентах
        City cit1 = list.stream().reduce(City::max)
                .get();
        System.out.println("город с максимальным населением: " + cit1);

        //поиск города с минимальным населением на всех континентах
        City cit2 = list.stream().reduce((x, y)->x.getPopulation()> y.getPopulation()?y:x).get();
        System.out.println("город с минимальным населением: " + cit2);

        // поиск города с макс населением на континенте Europe
        City cit3 = list.stream()
                .filter(x->x.getContinent()==Continents.EUROPE)
                .reduce(City::max)
                .get();
        System.out.println("город с максимальным населением на континенте " + Continents.EUROPE + ": " + cit3);

        // поиск города с мин населением на континенте Europe
        City cit4 = list.stream()
                .filter(x->x.getContinent() == Continents.EUROPE)
                .reduce((city, city2) -> city.getPopulation()< city2.getPopulation()?city:city2)
                .get();
        System.out.println("город с наименьшим населением на континенте " + Continents.EUROPE + ": " + cit4);

        //получить случайный город с населением больше 1 млн
        City cit5 = list.stream()
                .filter(city -> city.getPopulation()>1_000_000)
                .findAny()
                .get();
        System.out.println("случайный город с населением больше 1 млн: " + cit5);

        //получить все города с населением больше 1 млн
        List<City> arrCity = list.stream()
                .filter(city -> city.getPopulation()>1_000_000)
                .collect(Collectors.toList());
        System.out.println("города с населением больше 1 млн:");
        for (City city : arrCity) {
            System.out.println(city);
        }

        //города по возрастанию населения
        List<City> arrCity2 = list.stream()
                .sorted((o1, o2) -> o1.getPopulation()- o2.getPopulation())
                .toList();
        System.out.println("отсортированные города по возрастанию населения:");
        for (City city : arrCity2) {
            System.out.println(city);
        }

        //города по убыванию населения
        List<City> arrCity3 = list.stream()
                .sorted((o1, o2) -> o2.getPopulation()- o1.getPopulation())
                .toList();
        System.out.println("отсортированные города по убыванию населения:");
        for (City city : arrCity3) {
            System.out.println(city);
        }

        //получить коллекцию из имен городов
        List<String> nameCol = list.stream()
                .map(City::getName).toList();
        System.out.println("коллекция только из имен городов: " + nameCol);

        //среднее населением во всех городах
        double averagePopulation = list.stream()
                .collect(Collectors.averagingInt(City::getPopulation));
        System.out.println("среднее население во всех городах: " + (int) averagePopulation);

        //проверить есть ли город Осло
        boolean isPresentOslo = list.stream()
                .anyMatch(city -> city.getName()=="Осло");
        System.out.println("в коллекции есть город Осло: " + isPresentOslo);

        //поиск города по имени, если нет такого города, то выбрасывать исключение
        CheckCity isPresentCity = (List n, String cityName) ->{
            boolean found = false;
            City elem = null;

            for (int i = 0; i < n.size(); i++) {
                elem = (City) n.get(i);
                if (elem.getName() == cityName) {
                    found = true;
                    break;
                }
            }

            if(!found) {
                throw new NotFoundCity();
            }
            return elem;
        };
        City cit6 = isPresentCity.isPresent(list, "Осло");
        System.out.println(cit6);
    }
}
