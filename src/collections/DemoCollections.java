package collections;

public class DemoCollections {
    public static void main(String args[]){
        Group gr1 = new Group(1);
        Group gr2 = new Group(2);

        for (double i = 0.0; i < 30; i++) {
            Student st = new Student("Имя"+i, "Фамилия" +i+i, "01.07.2009", "Город" + i, i/2);
            if (i%2==0)
                gr1.addStudent(st);
            else
                gr2.addStudent(st);
        }
        Faculty fac = new Faculty("Факультет");
        fac.addGroup(gr1);
        fac.addGroup(gr2);
        /*
        //==== 1.4 ====
        gr1.showStudentsInfo();
        System.out.println("Выгоняем студентов со среднем баллом <4 из группы");
        gr1.onlyTopStudents();
        gr1.showStudentsInfo();
        //=============
        */
        //==== 1.5 ====
        gr2.onlyTopStudents();
        fac.showGroupsInfo();
        System.out.println("Объединяем маленькие (<15 студентов) группы");
        fac.splitSmallGroups();
        fac.showGroupsInfo();
        //=============
        /*
        fac.checkFacultyStatus();   //1.8
        System.out.println("Меняем статус факультета");
        fac.changeStatus(0);        //1.7
        System.out.println("Статус факультета " + fac.getStatusFaculty());
        */
        /*
        //=== 1.9 ===
        System.out.println("Срдений балл по группе " + gr1.getGroupNum() + ": " + gr1.getAverageScore());
        System.out.println("Срдений балл по группе " + gr2.getGroupNum() + ": " + gr2.getAverageScore());
        //===========
        */
        /*
        //=== 1.11 ===
        System.out.println("Сортировка студентов по убыванию среднего балла группы " + gr1.getGroupNum());
        gr1.sortDes();
        gr1.showStudentsInfo();
        //============
        */
        /*
        //=== 1.10 ===
        System.out.println("Сортировка студентов по возрастанию среднего балла группы " + gr2.getGroupNum());
        gr2.sortAsc();
        gr2.showStudentsInfo();
        //============
        */
    }
}
