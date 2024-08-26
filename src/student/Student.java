import java.awt.color.ICC_ColorSpace;

public class Student {
    private int id;
    private String firstName;
    private String name;
    private String secondName;
    private String birthDate;
    private String facultyName;
    private int curs;
    private String groupName;

    public Student(int id, String firstName, String name, String secondName, String birthDate, String facultyName,
                   int curs, String groupName){
        this.id = id;
        this.firstName = firstName;
        this.name = name;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.facultyName = facultyName;
        this.curs = curs;
        this.groupName = groupName;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSecondName(String secondName){
        this.secondName = secondName;
    }
    public String getSecondName(){
        return secondName;
    }
    public void setBirthDate(String birthDate){
        this.birthDate = birthDate;
    }
    public String getBirthDate(){
        return birthDate;
    }
    public void setFacultyName(String facultyName){
        this.facultyName = facultyName;
    }
    public String getFacultyName(){
        return facultyName;
    }
    public void setCurs(int curs){
        this.curs = curs;
    }
    public int getCurs(){
        return curs;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void information(){
        System.out.print("id:" + this.id + " имя:"+this.name + " фамилия:" + this.firstName + " отчество:" + this.secondName +
              " дата рождения:" + birthDate + " факультет:" + this.facultyName + " курс:" + this.curs + " группа:" + this.groupName);
    }
}
