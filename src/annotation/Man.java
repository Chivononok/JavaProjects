package annotation;

import java.util.Arrays;


public class Man {
    private String name;
    private int height;
    private int weight;

    public String getName(){
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
@AcademyInfo(year = 2021)
    public void getInfo(Object o){
        Class cl = o.getClass();
        System.out.println("Имя класса:" + cl);
        System.out.println("Поля класса:" + Arrays.toString(cl.getDeclaredFields()));
        System.out.println("Методы класса: " + Arrays.toString(cl.getDeclaredMethods()));
        System.out.println("Родитель: " + cl.getSuperclass());
        System.out.println("Конструкторы: " + Arrays.toString(cl.getDeclaredConstructors()));
    }
}
