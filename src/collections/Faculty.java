package collections;

import java.util.ArrayList;

public class Faculty {
    private String facName;
    private ArrayList<Group> arrGroup;
    private StatusFaculty statusFaculty;
    private int countStudents;

    Faculty(String facName, ArrayList<Group> arrGroup){
        this.facName = facName;
        this.arrGroup = arrGroup;
        for(Group gr : arrGroup){
            this.countStudents += gr.getCountStudents();
        }
    }
    Faculty(String facName){
        this.facName = facName;
        this.arrGroup = new ArrayList<>();
        this.countStudents = 0;
        statusFaculty = statusFaculty.NotActive;
    }
    public void addGroup(Group grp){
        this.arrGroup.add(grp);
        this.countStudents += grp.getCountStudents();
        if (this.countStudents<20)
            statusFaculty = statusFaculty.NotActive;
        else
            statusFaculty = statusFaculty.Active;
    }
    public void splitSmallGroups(){
        if (arrGroup.size()<2) return;
        Group curGroup;
        Group grp4merge = new Group();
        for (int i = 0; i < arrGroup.size(); i++) {
            curGroup = arrGroup.get(i); //текущая группа
            if (grp4merge.getCountStudents()>0){
                //если уже есть группа для объединения, то объединяем ее с текущей и обнуляем
                curGroup.addGroupStudents(grp4merge.getArrStudent());
                grp4merge.clearGroup();
                //arrGroup.remove(grp4merge);
            }
            if (curGroup.getCountStudents()<15){
                //запоминаем группу для объединения
                grp4merge = curGroup;
            }
        }
        if(grp4merge.getCountStudents()>0){
            //Если в последней группе оказалось мало людей, то объединяем ее с первой из списка
            arrGroup.get(0).addGroupStudents(grp4merge.getArrStudent());
            grp4merge.clearGroup();
            //arrGroup.remove(grp4merge);
        }
    }
    public String getStatusFaculty(){
        return statusFaculty.getStatusName();
    }
    public void checkFacultyStatus(){
        if (this.countStudents<20)
            statusFaculty = statusFaculty.NotActive;
        else
            statusFaculty = statusFaculty.Active;
        System.out.println("Статус факультета " + getStatusFaculty());
    }
    public void changeStatus(int status){
        if (status==1)
            this.statusFaculty = statusFaculty.Active;
        else
            this.statusFaculty = statusFaculty.NotActive;
    }
    public void showGroupsInfo(){
        for (Group gr: arrGroup){
            System.out.println(gr.toString());
        }
    }
}
