package collections;

public class Student {
    private String name;
    private String lastName;
    private String birthDate;
    private String city;
    private double averageScore;

    Student(String name, String lastName, String birthDate, String city, double averageScore){
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.city = city;
        this.averageScore = averageScore;
    }

    public double getAverageScore(){
        return averageScore;
    }
    public String toString(){
        return name + " " + lastName + " средний балл: " + averageScore;
    }
}
