package collections;

import java.util.ArrayList;

public class Group {
    private int groupNum;
    private ArrayList<Student> arrStudent;

    Group(int groupNum, ArrayList<Student> arrStudent){
        this.groupNum = groupNum;
        this.arrStudent = arrStudent;
    }
    Group(int groupNum){
        this.groupNum = groupNum;
        this.arrStudent = new ArrayList<>();
    }
    Group(){
        this.groupNum = -1;
        this.arrStudent = new ArrayList<>();
    }
    public void addStudent(Student st){
        arrStudent.add(st);
    }
    public int getGroupNum(){
        return groupNum;
    }
    public void onlyTopStudents(){
        arrStudent.removeIf(student -> student.getAverageScore()<4);
    }
    public int getCountStudents(){
        return arrStudent.size();
    }

    public ArrayList<Student> getArrStudent() {
        return arrStudent;
    }

    public void addGroupStudents(ArrayList<Student> group){
        this.arrStudent.addAll(group);
    }
    public void clearGroup(){
        arrStudent.clear();
    }
    public double getAverageScore(){
        double sumAverageScore=0;
        if (arrStudent.size()==0) return 0;

        for (Student st : arrStudent){
            sumAverageScore += st.getAverageScore();
        }
        return sumAverageScore/arrStudent.size();
    }
    public void sortAsc(){
        Student tmpElem;
        for (int j = arrStudent.size()-1; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                if (arrStudent.get(i).getAverageScore() > arrStudent.get(i+1).getAverageScore()){
                    tmpElem = arrStudent.get(i+1);
                    arrStudent.set(i+1, arrStudent.get(i));
                    arrStudent.set(i, tmpElem);
                }
            }
        }

    }
    public void sortDes(){
        Student tmpElem;
        for (int j = arrStudent.size()-1; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                if (arrStudent.get(i).getAverageScore() < arrStudent.get(i+1).getAverageScore()){
                    tmpElem = arrStudent.get(i+1);
                    arrStudent.set(i+1, arrStudent.get(i));
                    arrStudent.set(i, tmpElem);
                }
            }
        }
    }

    public void showStudentsInfo(){
        for (Student st: arrStudent)
            System.out.println(st.toString());
    }
    public String toString(){
        return "Группа " + getGroupNum() + " студентов: " +arrStudent.size();
    }
}
